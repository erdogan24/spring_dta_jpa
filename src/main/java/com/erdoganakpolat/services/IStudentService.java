package com.erdoganakpolat.services;

import java.util.List;

import com.erdoganakpolat.entities.Student;

public interface IStudentService {
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
}
