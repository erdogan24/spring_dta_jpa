package com.erdoganakpolat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erdoganakpolat.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
