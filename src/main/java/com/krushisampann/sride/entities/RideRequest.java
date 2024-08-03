package com.krushisampann.sride.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import com.krushisampann.sride.entities.enums.PaymentMethod;
import com.krushisampann.sride.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RideRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
//	//import Point from org.locationtech.jts.geom.Point;
//	//4326 for Earth Geometry--> @Column(columnDefinition = "Geometry(Point, 4326)")
	@Column(columnDefinition = "Geometry(Point, 4326)")
	private Point pickupLocation;
	
	@Column(columnDefinition = "Geometry(Point, 4326)")
	private Point dropOffLocation;
	
	@CreationTimestamp
	private LocalDateTime requestedTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Rider rider;
	
	@Enumerated(EnumType.STRING)
	private RideRequestStatus rideRequestStatus;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;
	
	

}
