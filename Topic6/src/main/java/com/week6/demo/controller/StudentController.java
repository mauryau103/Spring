package com.week6.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.week6.demo.model.Address;
import com.week6.demo.model.Student;
import com.week6.demo.repository.StudentRepo;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save")
	public void registerStudent(@RequestBody Student student) {
		repo.save(student);
		System.out.println("Hello");
	}
	
	@GetMapping("/getAllStud/{id}")
	public Optional<Student> getStudentById(@PathVariable long id) {
		return  repo.findById(id);	
	}
	
	@GetMapping("/getAddress/{id}")
	public Optional<Address> getStudentId(@PathVariable long id) {
		Optional<Student> student =  repo.findById(id);
		return Optional.of(student.get().getAddress());
	}
	
	@GetMapping("/getAllStud")
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	@GetMapping("/getByNative")
	public List<Student> getStudent(){
		return  repo.getAllStudents();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteUserById(@PathVariable long id) {
		repo.deleteById(id);
		System.out.println("Student deleted...");
	}
	
	@PutMapping("/updateStudent/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable long id) {	
		Student stud =  repo.findById(id).get();
		stud.setStudent_name(student.getStudent_name());
		repo.save(stud);
	}

}
