package com.example.conference.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.conference.model.Registration;

@Controller
public class RegistrationController {
	
	@GetMapping("registration")
	public String getRegistration(@ModelAttribute ("registration") Registration registration) {
		return "registration";
	}
	
	@PostMapping("registration")
	public String addRegistration(@Valid @ModelAttribute ("registration") 
									Registration registration, 
									BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("There were Errors");
			return "registration";
		}
		
		System.out.println("Registration: " + registration.getName());
		return "redirect:registration";
	}
}
