package com.krushisampann.sride.strategies.impl;

import java.util.List;

import com.krushisampann.sride.entities.RideRequest;
import com.krushisampann.sride.repositories.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.Driver;
import com.krushisampann.sride.strategies.DriverMatchingStrategy;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestStrategy implements DriverMatchingStrategy {
	private final DriverRepository driverRepository;

	@Override
	public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
		// TODO Auto-generated method stub
		return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
	}

}
