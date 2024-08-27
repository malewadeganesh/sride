package com.krushisampann.sride.strategies;

import java.util.List;

import com.krushisampann.sride.entities.RideRequest;
import org.springframework.stereotype.Service;


import com.krushisampann.sride.entities.Driver;


public interface DriverMatchingStrategy {

  List<Driver> findMatchingDrivers(RideRequest rideRequest);
  
}
