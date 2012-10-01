package net.coscolla.tutorials.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StartApp app = ctx.getBean(StartApp.class);
        app.main();
	}
}
