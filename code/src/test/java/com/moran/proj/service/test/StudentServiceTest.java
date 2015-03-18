package com.moran.proj.service.test;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moran.proj.entity.SMM_Student;
import com.moran.proj.service.StudentService;

public class StudentServiceTest
{
	private StudentService	studentService;

	@SuppressWarnings("resource")
	@Before
	public void before()
	{
		String [] configs = new String[] { 
			"classpath:config/spring-common.xml", 
			"classpath:config/spring-mybatis.xml" 
		};
		ApplicationContext context = new ClassPathXmlApplicationContext(configs);
		studentService = (StudentService) context.getBean("studentServiceImpl");
	}

}
