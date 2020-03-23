package com.example.interviewquestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.interviewquestion.service.QuestionsUtil;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionsUtil questionsUtil;
	@GetMapping
	public String question() {
		return "U can find factorial of a number by placing that at the end of url, Ex:http://localhost:8085/question/factorial/3 ,max number=15.";
	}
	@GetMapping("/factorial/{value}")
	public String findFactorialQuestion(@PathVariable int value) {
		int n = questionsUtil.findFactorial(value);
		return "Factorial of :"+value+" is :"+n;
	}

}
