package com.moran.proj.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moran.proj.dao.UserDao;
import com.moran.proj.entity.User;
import com.moran.proj.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao	userDao;

	@Override
	public int insertUser(User user)
	{
		return userDao.insertUser(user);
	}

	@Override
	public Set<User> getAllUsers()
	{
		return userDao.getAllUsers();
	}
}
