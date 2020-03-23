package com.example.interviewquestion.service;

import org.springframework.stereotype.Service;

@Service
public class QuestionsUtil {

	public int findFactorial(int i) {
		if(i<=1)
			return 1;
		else
			return i*findFactorial(i-1);
	}

}
