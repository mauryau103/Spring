package com.week6.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.week6.demo.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	
	//by using transactional the rollback operation will perform
	
	@Transactional
	@Query(value = "select * from Student",nativeQuery = true)
	List<Student> getAllStudents();
	
}