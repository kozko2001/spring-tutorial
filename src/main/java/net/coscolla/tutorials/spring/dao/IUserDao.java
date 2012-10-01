package net.coscolla.tutorials.spring.dao;

import net.coscolla.tutorials.spring.model.User;

public interface IUserDao {
	public User getById(long id);
}
