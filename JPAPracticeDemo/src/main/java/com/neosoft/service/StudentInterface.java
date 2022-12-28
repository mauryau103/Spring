package com.neosoft.service;

import java.util.List;

import com.neosoft.model.Student;

public interface StudentInterface {
	
	public Student save(Student student);
	
	public Student findById(int id);
	
	public void deleteStudent(int id);
	
	public Student updateStudent(Student student, int id);
	
	public Student findByNameStdent(String name);
	
	public Student findByNameAndRollNoStdent(String name,int rollNo);
	
	public Student findByNameStartingWithStudent(String prefix);
	
	public Student findByNameEndingWithStudent(String suffix);
	
	public Student findByNameContainingStudent(String words);
	
	public Student findByNameLikePattern(String pattern);
	
	public List<Student> findByRollNo(int rollNo);
	
	public List<Student> findByRollNoGreaterThan(int rollNo);
	
	public List<Student> showAll();
	
	public Student getStudentByName(String name);
	
	public Student getStudentByNameAndRollNo(String name,int rollNo);
	
	public List<Student> getStudent();

}
