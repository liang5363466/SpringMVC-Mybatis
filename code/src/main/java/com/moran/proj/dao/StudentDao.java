package com.moran.proj.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.moran.proj.entity.SMM_Student;


public interface StudentDao
{
	int insertStudent(SMM_Student user);
	
	List<Map<String,Object>> getAllStudents();
}
                                                                               