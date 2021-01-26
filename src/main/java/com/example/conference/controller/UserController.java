package com.example.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.conference.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstname", defaultValue = "Sanchit") String firstname,
						@RequestParam(value = "lastname", defaultValue = "Jain") String lastname,
						@RequestParam(value = "age", defaultValue = "23") int age) {
		User user = new User();
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAge(age);
		
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("User firstname:" + user.getFirstname());
		
		return user;
	}
}
