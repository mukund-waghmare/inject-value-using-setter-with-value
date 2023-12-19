package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int studentId;
	
	private String studentName;

	public int getStudentId() {
		return studentId;
	}

	@Value(value = "1")
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Value(value = "ABC")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
