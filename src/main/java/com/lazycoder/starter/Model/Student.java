package com.lazycoder.starter.Model;

public class Student {
	
	private int id;
	private String name;
	private String studentId;
	private String session;
	private String about;
	
	public Student() {
		super();
	}
	
	
	public Student(String name, String studentId, String session, String about) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.session = session;
		this.about = about;
	}
	
	
	public Student(int id, String name, String studentId, String session, String about) {
		super();
		this.id = id;
		this.name = name;
		this.studentId = studentId;
		this.session = session;
		this.about = about;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}

	
	
}
