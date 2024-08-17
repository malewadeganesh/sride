package com.krushisampann.sride.strategies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krushisampann.sride.dto.RideRequestDto;
import com.krushisampann.sride.entities.Driver;


public interface DriverMatchingStrategy {

  List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
  
}
