package com.krushisampann.sride.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.krushisampann.sride.entities.enums.PaymentMethod;
import com.krushisampann.sride.entities.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod patmentMethod;
	
	@OneToOne
	private Ride ride;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	private double amount;
	
	@CreationTimestamp
	private LocalDateTime paymentTime;

}
