package com.moran.proj.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.moran.proj.entity.User;
import com.moran.proj.service.UserService;
import com.moran.proj.shared.AbstractController;

@Controller
@RequestMapping("/User/")
public class UserController extends AbstractController
{

	@Autowired
	protected UserService	userService;

	@RequestMapping(value = "/Index", method = RequestMethod.GET)
	public String index()
	{
		Set<User> users = userService.getAllUsers();
		return "/user/index";
	}
}
