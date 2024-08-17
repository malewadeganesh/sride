package com.krushisampann.sride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krushisampann.sride.entities.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long>{

}
