package net.coscolla.tutorials.spring;

import net.coscolla.tutorials.spring.dao.IUserDao;
import net.coscolla.tutorials.spring.model.User;

import org.springframework.beans.factory.annotation.Autowired;

public class StartApp {

	private IUserDao dao;
	
	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	public void main()
	{
		User user = dao.getById(1);
		System.out.println(user.toString());
	}
}
