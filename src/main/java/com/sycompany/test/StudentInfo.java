package com.sycompany.test;

public class StudentInfo {

	private Student student;

	public StudentInfo() {   //빈 생성자
		super();
	}

	
	public StudentInfo(Student student) {  // 매개변수 있는 생성자
		super();
		this.student = student;
	}

	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
