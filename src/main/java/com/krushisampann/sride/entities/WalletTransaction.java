package com.krushisampann.sride.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.krushisampann.sride.entities.enums.TransactionMethod;
import com.krushisampann.sride.entities.enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WalletTransaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private double amount;
	
	private TransactionType transactionType;
	
	private TransactionMethod transactionMethod;
	
	@ManyToOne
	private Wallet wallet;
	
	@OneToOne
	private Ride ride;
	
	private String transactionId;
	
	@CreationTimestamp
	private LocalDateTime timeStamp;
}
