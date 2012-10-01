package net.coscolla.tutorials.spring.model;

public class User {
	public String name;
	public long   id;
	
	@Override
	public String toString() {
		return "User model id: " + id + "   name: " + name;
	}
}
