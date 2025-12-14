package com.erdoganakpolat.controller.impl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erdoganakpolat.controller.IStudentController;
import com.erdoganakpolat.entities.Student;


@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {

		return null;
	}

}
