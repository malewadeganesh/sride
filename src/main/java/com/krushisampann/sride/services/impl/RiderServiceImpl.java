package com.krushisampann.sride.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.RideDto;
import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.dto.RiderDto;
import com.krushisampann.sride.services.RiderService;

@Service
public class RiderServiceImpl implements RiderService{

	@Override
	public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RideDto cancelRide(Long rideId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto rateDriver(Long rideId, double rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RiderDto getMyProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RideDto> getAllMyRides() {
		// TODO Auto-generated method stub
		return null;
	}

}
