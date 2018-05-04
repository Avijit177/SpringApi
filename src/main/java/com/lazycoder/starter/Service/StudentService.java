package com.lazycoder.starter.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.lazycoder.starter.Model.Student;

@Service
public class StudentService {
	List<Student> dummyList = new ArrayList<Student>();
	
	public List<Student> getAllStudent()
	{
		CreateDummyList();
		return dummyList;
	}
	
	
	public void CreateDummyList()
	{
		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
		dummyList.add(new Student("Sumon", "11223", "2011", "king of playboy"));
		dummyList.add(new Student("Milton", "5364334", "2013", "Very talanted person"));
		dummyList.add(new Student("Al Helal", "12115410", "2012", "Problem solver"));
		dummyList.add(new Student("Sohag ", "12115410", "2012", "Calm ans happy person"));
		dummyList.add(new Student("Topu", "12115410", "2012", "King of Liar"));
		dummyList.add(new Student("Dhrubo", "12115410", "2012", "Splenidn Photographer"));
		dummyList.add(new Student("Anjan", "12115410", "2012", "Troubleshooter "));
//		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
//		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
//		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
//		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
//		dummyList.add(new Student("Avijit", "12115410", "2012", "He is arrogant"));
		
	}
	
//	public Object getCustomerList(int page,int size)
//	{
//		return customerRepository.findAll(new PageRequest(page, size));
//	}

}
