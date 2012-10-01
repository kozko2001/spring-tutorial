package net.coscolla.tutorials.spring.model;

public class User {
	public String name;
	public long   id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User model id: " + id + "   name: " + name;
	}
}
