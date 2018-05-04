package com.lazycoder.starter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazycoder.starter.Model.Student;
import com.lazycoder.starter.Service.StudentService;

@RestController
public class AppController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String GetData()
	{
		return "i am on";
	}
	
	@GetMapping("/all")
	public List<Student> getStudent()
	{
		return studentService.getAllStudent();
	}

}
