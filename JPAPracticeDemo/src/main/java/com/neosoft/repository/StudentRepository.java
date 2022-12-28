package com.neosoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByName(String name);
	
	public Student findByNameAndRollNo(String name,int rollNo);
	
	public Student findByNameStartingWith(String prefix);
	
	public Student findByNameEndingWith(String suffix);
	
	public Student findByNameContaining(String words);
	
	public Student findByNameLike(String pattern);
	
	public List<Student> findByRollNoLessThan(int rollNo);
	
	public List<Student> findByRollNoGreaterThanEqual(int rollNo);
	
	@Query("SELECT s FROM Student s")
	public List<Student> getAllStudent();
	
	
	@Query("SELECT s FROM Student s WHERE s.id=:id")
	public Student getStudentByName(@Param("id") String name);
	
	@Query("SELECT s FROM Student s WHERE s.name=:n AND s.rollNo=:r")
	public Student getStudentByNameAndRollNo(@Param("n")String name,@Param("r") int rollNo);
	
	@Query(value = "SELECT * FROM student",nativeQuery = true)
	public List<Student> getStudent();
	
//	@Modifying
//	@Query()

}
