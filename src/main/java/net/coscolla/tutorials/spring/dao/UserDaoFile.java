package net.coscolla.tutorials.spring.dao;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import net.coscolla.tutorials.spring.model.User;

public class UserDaoFile implements IUserDao {

	private String xmlPath;
	
	public User getById(long id) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		User u = new User();
		
		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			Document dom = db.parse(xmlPath + "/" + id + ".xml");
			Node rootNode = dom.getFirstChild();
			
			for(int i = 0; i< rootNode.getChildNodes().getLength(); i++)
			{
				Node p = rootNode.getChildNodes().item(i);
				
				if(p.getNodeName().equals("name"))
					u.name = p.getTextContent();
				if(p.getNodeName().equals("id"))
					u.id = Long.parseLong(p.getTextContent());
				
			}

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

		return u;
	}

	public String getXmlPath() {
		return xmlPath;
	}

	public void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}

}
