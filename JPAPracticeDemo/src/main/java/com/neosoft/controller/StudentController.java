package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Student;
import com.neosoft.service.StudentInterface;

@RestController
public class StudentController {
	
	@Autowired
	private StudentInterface studentService;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.save(student);
		
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);

		return "Student Deleted";
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable Integer id) {
		Student s=student;
		System.out.println(s);
		return studentService.updateStudent(student, id);
	}

	
	@GetMapping("/findByName/{name}")
	public Student findStudentByName(@PathVariable String name) {
		return studentService.findByNameStdent(name);
	}
	
	@GetMapping("/findByNameAndRollNo/{name},{rollNo}")
	public Student findStudentByNameAndRolNo(@PathVariable String name,@PathVariable int rollNo) {
		return studentService.findByNameAndRollNoStdent(name, rollNo);
	}
	
	@GetMapping("/findByNameStartingWith/{name}")
	public Student findStudentByNameStartingWith(@PathVariable String name) {
		return studentService.findByNameStartingWithStudent(name);
	}
	
	@GetMapping("/findByNameEndingWith/{name}")
	public Student findStudentByNameEndingWith(@PathVariable String name) {
		return studentService.findByNameEndingWithStudent(name);
	}
	
	@GetMapping("/findByNameContaining/{name}")
	public Student findStudentByNameContaining(@PathVariable String name) {
		return studentService.findByNameContainingStudent(name);
	}
	
	@GetMapping("/findByNameLike/{pattern}")
	public Student findStudentByNameLikePattern(@PathVariable String pattern) {
		return studentService.findByNameLikePattern(pattern);
	}
	
	@GetMapping("/findRollNoLessThan/{rollNo}")
	public List<Student> findStudentByRollNo(@PathVariable int rollNo) {
		return studentService.findByRollNo(rollNo);
	}
	
	
	@GetMapping("/findRollNoGreaterThanEqual/{rollNo}")
	public List<Student> findStudentByRollNoGreaterThan(@PathVariable int rollNo) {
		return studentService.findByRollNoGreaterThan(rollNo);
	}
	
	@GetMapping("/show")
	public List<Student> showAll(){
		return studentService.showAll();
	}
	
	@GetMapping("/byName/{name}")
	public Student getByName(@PathVariable String name ){
		return studentService.getStudentByName(name);
	}
	
	@GetMapping("/byNameAndRollNo/{name},{rollNo}")
	public Student getByNameAndRollNo(@PathVariable String name,@PathVariable int rollNo ){
		return studentService.getStudentByNameAndRollNo(name, rollNo);
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAll(){
		return studentService.getStudent();
	}
	
	
	
	
	

}
