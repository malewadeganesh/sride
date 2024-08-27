package com.krushisampann.sride.services.impl;

import java.util.List;

import com.krushisampann.sride.entities.Rider;
import com.krushisampann.sride.entities.User;
import com.krushisampann.sride.entities.enums.RideRequestStatus;
import com.krushisampann.sride.repositories.RideRequestRepository;
import com.krushisampann.sride.repositories.RiderRepository;
import com.krushisampann.sride.strategies.DriverMatchingStrategy;
import com.krushisampann.sride.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.XSlf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.krushisampann.sride.dto.DriverDto;
import com.krushisampann.sride.dto.RideDto;
import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.dto.RiderDto;
import com.krushisampann.sride.entities.RideRequest;
import com.krushisampann.sride.services.RiderService;

@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService{
	private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
	private final RideRequestRepository rideRequestRepository;
	private final RiderRepository riderRepository;


    @Override
	public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
		//Took rideRequestDto and convert them to rideRequest by using modelMapper.
		RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
		System.out.print(rideRequest);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare=rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

		RideRequest savedRideRequest=rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDrivers(rideRequest);

		return modelMapper.map(savedRideRequest, RideRequestDto.class);
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

	@Override
	public Rider createNewRider(User user) {
		Rider rider=Rider.builder().user(user).rating(0.0).build();
        return riderRepository.save(rider);
	}


}