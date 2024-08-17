package com.krushisampann.sride.services;

import java.util.List;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.RideDto;
import com.krushisampann.sride.dto.RiderDto;

public interface DriverService {
	
	RideDto acceptRide(Long rideId);
	RideDto cancelRide(Long rideId);
	RideDto startRide(Long rideId);
	RideDto endRide(Long rideId);
	
	RiderDto rateRider(Long rideId, double rating);
	DriverDto getMyProfile();
	List<RideDto> getAllMyRides();

}
