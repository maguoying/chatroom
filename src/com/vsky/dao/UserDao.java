package com.vsky.dao;

import com.vsky.dto.User;

public interface UserDao {

	abstract User login(User user);
}
