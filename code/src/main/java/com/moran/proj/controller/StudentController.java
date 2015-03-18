package com.moran.proj.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.moran.proj.service.StudentService;
import com.moran.proj.shared.AbstractController;

@Controller
@RequestMapping("/Student/")
public class StudentController extends AbstractController
{
	@Autowired
	protected StudentService	studentService;

	@RequestMapping(value = "/List", method = RequestMethod.GET)
	public String list()
	{
		List<Map<String,Object>> students = studentService.getAllStudents();
		request("model", students);
		return "student_list";
	}
}
