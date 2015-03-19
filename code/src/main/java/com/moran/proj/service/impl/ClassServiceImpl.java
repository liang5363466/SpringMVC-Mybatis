package com.moran.proj.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moran.proj.dao.ClassDao;
import com.moran.proj.service.ClassService;

@Service("ClassService")
public class ClassServiceImpl implements ClassService
{

	@Autowired
	private ClassDao	classDao;

	@Override
	public List<Map<String, Object>> getAllClasses()
	{
		return classDao.getAllClasses();
	}

}
