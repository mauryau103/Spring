package com.multi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.model.book.Book;
import com.multi.model.user.User;
import com.multi.repository.book.BookRepository;
import com.multi.repository.user.UserRepository;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages ="{com.multi.*}")
public class SpringBootMultipleDsApplication {
	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@PostConstruct
	public void addData2DB() {
		 userRepo.saveAll(Stream.of(new User(744,"Umesh"),new User(455,"Aashu")).collect(Collectors.toList()));
		 bookRepo.saveAll(Stream.of(new Book(143,"The Alchemist"),new Book(341,"Atomic Habit")).collect(Collectors.toList()));

	}

	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleDsApplication.class, args);
	}

}
