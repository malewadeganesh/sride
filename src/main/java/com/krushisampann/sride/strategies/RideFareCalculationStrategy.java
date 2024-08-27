package com.krushisampann.sride.strategies;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.RideRequest;

public interface RideFareCalculationStrategy {
	//We Can put this in env variable as well but for now we hardcoded here
	double RIDE_FARE_MULTIPLIER=10;
	double calculateFare(RideRequest rideRequest);

}
