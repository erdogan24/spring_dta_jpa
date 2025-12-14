package com.erdoganakpolat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erdoganakpolat.entities.Student;
import com.erdoganakpolat.repository.StudentRepository;
import com.erdoganakpolat.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
	    return studentRepository.save(student);
		
	}

}
