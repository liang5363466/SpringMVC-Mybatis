package com.moran.proj.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moran.proj.dao.StudentDao;
import com.moran.proj.entity.SMM_Student;
import com.moran.proj.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao	userDao;

	@Override
	public int insertStudent(SMM_Student user)
	{
		return userDao.insertStudent(user);
	}

	@Override
	public List<Map<String,Object>> getAllStudents()
	{
		return userDao.getAllStudents();
	}
}
