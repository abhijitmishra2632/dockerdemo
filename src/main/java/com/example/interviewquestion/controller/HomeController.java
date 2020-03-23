package com.example.interviewquestion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	@GetMapping
	public String hello() {
		System.out.println("Hi Abhijit..");
		return "Welcome to Spring app..";
	}

}
