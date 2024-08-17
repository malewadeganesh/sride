package com.krushisampann.sride.dto;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.krushisampann.sride.entities.enums.RideRequestStatus;
import com.krushisampann.sride.entities.enums.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
	
	private Long id;
	private Point pickupLocation;
	private Point dropOffLocation;
	private LocalDateTime createdTime;
	private RiderDto rider;
	private DriverDto driver;
	private RideRequestStatus rideRequestStatus;
	private RideStatus rideStatus;
	private String otp;
	
	private Double fare;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;


}
