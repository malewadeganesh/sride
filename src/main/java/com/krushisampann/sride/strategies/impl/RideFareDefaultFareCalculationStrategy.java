package com.krushisampann.sride.strategies.impl;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.RideRequest;
import com.krushisampann.sride.services.DistanceService;
import com.krushisampann.sride.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareDefaultFareCalculationStrategy  implements RideFareCalculationStrategy{

	private final DistanceService distanceService;

    @Override
	public double calculateFare(RideRequest rideRequest) {
		Double distance = distanceService.calculateDistnce(rideRequest.getPickupLocation(), rideRequest.getDropOffLocation());
		return distance*RIDE_FARE_MULTIPLIER;
	}

	}

