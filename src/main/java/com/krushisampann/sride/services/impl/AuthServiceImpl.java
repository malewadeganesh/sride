package com.krushisampann.sride.services.impl;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.SignupDto;
import com.krushisampann.sride.dto.UserDto;
import com.krushisampann.sride.entities.Rider;
import com.krushisampann.sride.entities.User;
import com.krushisampann.sride.entities.enums.Role;
import com.krushisampann.sride.exceptions.RuntimeConflictException;
import com.krushisampann.sride.repositories.UserRepository;
import com.krushisampann.sride.services.AuthService;
import com.krushisampann.sride.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
	private final UserRepository userRepository;
	private final RiderService riderService;
    private final ModelMapper modelMapper;

	@Override
	public String logIn(String email, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto signup(SignupDto signupDto) {
		User user=userRepository.findByEmail(signupDto.getEmail()).orElse(null);
		if(user!=null){
			throw new RuntimeConflictException("Cannot signup, User already exist with email"+signupDto.getEmail());
		}
		User mappedUser= modelMapper.map(signupDto,User.class );
		mappedUser.setRoles(Set.of(Role.RIDER));
		User savedUser= userRepository.save(mappedUser);

		//Create user related entities
        riderService.createNewRider(savedUser);
		//ToDo add wallet related service here

		// TODO Auto-generated method stub
		return modelMapper.map(savedUser,UserDto.class);
    }

	@Override
	public DriverDto onboardNewdriver(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
