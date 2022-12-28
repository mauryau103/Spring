package com.neosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Student;
import com.neosoft.repository.StudentRepository;
@Service
public class StudentImpl implements StudentInterface {

	@Autowired
	private StudentRepository studentRepo;
	
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student newStudent, int id) {
		// TODO Auto-generated method stub
		Student existingStudent=studentRepo.findById(id).get();
		//System.out.println(existingStudent);
		existingStudent.setName(newStudent.getName());
		existingStudent.setRollNo(newStudent.getRollNo());
		existingStudent.setEmail(newStudent.getEmail());
		existingStudent.setStream(newStudent.getStream());
		
		studentRepo.save(existingStudent);
		return existingStudent;
	}

	@Override
	public Student findByNameStdent(String name) {
		// TODO Auto-generated method stub
		return studentRepo.findByName(name);
	}

	@Override
	public Student findByNameAndRollNoStdent(String name, int rollNo) {
		// TODO Auto-generated method stub
		return studentRepo.findByNameAndRollNo(name, rollNo);
	}

	@Override
	public Student findByNameStartingWithStudent(String prefix) {
		// TODO Auto-generated method stub
		return studentRepo.findByNameStartingWith(prefix);
	}

	@Override
	public Student findByNameEndingWithStudent(String suffix) {
		// TODO Auto-generated method stub
		return studentRepo.findByNameEndingWith(suffix);
	}

	@Override
	public Student findByNameContainingStudent(String words) {
		// TODO Auto-generated method stub
		return studentRepo.findByNameContaining(words);
	}

	@Override
	public Student findByNameLikePattern(String pattern) {
		// TODO Auto-generated method stub
		return studentRepo.findByNameLike(pattern);
	}

	@Override
	public List<Student> findByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return studentRepo.findByRollNoLessThan(rollNo);
	}

	@Override
	public List<Student> findByRollNoGreaterThan(int rollNo) {
		// TODO Auto-generated method stub
		return studentRepo.findByRollNoGreaterThanEqual(rollNo);
	}

	@Override
	public List<Student> showAll() {
		// TODO Auto-generated method stub
		//return studentRepo.findAll();
		return studentRepo.getAllStudent();
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepo.getStudentByName(name);
	}

	@Override
	public Student getStudentByNameAndRollNo(String name, int rollNo) {
		// TODO Auto-generated method stub
		return studentRepo.getStudentByNameAndRollNo(name, rollNo);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepo.getStudent();
	}
	
	

	

}
