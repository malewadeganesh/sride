package com.krushisampann.sride.strategies;

import com.krushisampann.sride.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
	double calculateFare(RideRequestDto rideRequestDto);

}
