package com.moran.proj.service;

import java.util.Set;

import com.moran.proj.entity.User;


public interface UserService
{
	public int insertUser(User user);
	Set<User> getAllUsers();
}
