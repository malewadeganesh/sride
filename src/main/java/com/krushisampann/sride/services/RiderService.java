package com.krushisampann.sride.services;

import java.util.List;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.RideDto;
import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.dto.RiderDto;

public interface RiderService {
	
	RideRequestDto requestRide(RideRequestDto rideRequestDto);
	RideDto cancelRide(Long rideId);
	
	DriverDto rateDriver(Long rideId, double rating);
	RiderDto getMyProfile();
	List<RideDto> getAllMyRides();

}
