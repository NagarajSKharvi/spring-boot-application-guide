package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userId, String password) {
		return userId.equals("Nagaraj S Kharvi") && password.equals("1234");
	}
}
