package com.vsky.service;

import com.vsky.dao.UserDao;
import com.vsky.dao.UserDaoImpl;
import com.vsky.dto.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImpl();
		return dao.login(user);
	}
}
