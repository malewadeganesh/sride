package com.krushisampann.sride.services;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.SignupDto;
import com.krushisampann.sride.dto.UserDto;

public interface AuthService {
	
String logIn(String email, String Password);
UserDto signup(SignupDto signupDto);
DriverDto onboardNewdriver(Long userId);
}
