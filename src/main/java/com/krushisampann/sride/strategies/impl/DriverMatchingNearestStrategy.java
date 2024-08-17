package com.krushisampann.sride.strategies.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.Driver;
import com.krushisampann.sride.strategies.DriverMatchingStrategy;

@Service
public class DriverMatchingNearestStrategy implements DriverMatchingStrategy {

	@Override
	public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		return List.of();
	}

}
