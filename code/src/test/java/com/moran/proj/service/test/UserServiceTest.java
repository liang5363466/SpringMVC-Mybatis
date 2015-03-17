package com.moran.proj.service.test;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moran.proj.entity.User;
import com.moran.proj.service.UserService;

public class UserServiceTest
{
	private UserService	userService;

	@SuppressWarnings("resource")
	@Before
	public void before()
	{
		String [] configs = new String[] { 
			"classpath:config/spring-common.xml", 
			"classpath:config/spring-mybatis.xml" 
		};
		ApplicationContext context = new ClassPathXmlApplicationContext(configs);
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void getAllUsers()
	{
		Set<User> users = userService.getAllUsers();
		System.out.println(users.size());
	}
	
//	@Test
//	public void addUser()
//	{
//		User user = new User();
//		// user.setId(new BigDecimal(1));
//		user.setName("Tom");
//		user.setPassword("123456");
//		user.setEmail("123456@qq.com");
//		userService.insertUser(user);
//	}
}
