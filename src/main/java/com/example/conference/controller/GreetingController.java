package com.example.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("greeting")
	public String greeting (Map<String, Object> model) {
		model.put("message", "Hello Sanchit");
		return "greeting";
	}
	
	@GetMapping("thyme")
	public String thyme (Map<String, Object> model) {
		model.put("message", "Hello Sanchit in Thymeleaf");
		return "thyme";
	}
}