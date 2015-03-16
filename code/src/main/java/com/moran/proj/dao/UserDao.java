package com.moran.proj.dao;

import java.util.Set;

import com.moran.proj.entity.User;


public interface UserDao
{
	int insertUser(User user);
	Set<User> getAllUsers();
}
