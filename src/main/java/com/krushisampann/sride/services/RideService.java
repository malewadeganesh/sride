package com.krushisampann.sride.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.Driver;
import com.krushisampann.sride.entities.Ride;
import com.krushisampann.sride.entities.enums.RideStatus;

public interface RideService {
	
	Ride getRideById(Long rideId);
	void matchWithDrivers(RideRequestDto rideRequestDto);
	Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
	Ride updateRideStatus(Long rideId, RideStatus rideStatus);
	Page<Ride>getAllRidesOfRider(Long riderId,PageRequest pageRequest);
	Page<Ride>getAllRidesOfDriver(Long driverId,PageRequest pageRequest);

}
