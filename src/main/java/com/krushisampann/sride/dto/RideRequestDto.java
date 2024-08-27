package com.krushisampann.sride.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import com.krushisampann.sride.entities.Rider;
import com.krushisampann.sride.entities.enums.PaymentMethod;
import com.krushisampann.sride.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
	
	private Long id;
	
	private PointDto pickupLocation;
	private PointDto dropOffLocation;
	private PaymentMethod paymentMethod;
	
	private LocalDateTime requestedTime;
	
	private RiderDto rider;

	private Double fare;
	
	
	

}
