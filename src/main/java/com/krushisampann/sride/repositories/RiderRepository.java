package com.krushisampann.sride.repositories;

import com.krushisampann.sride.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krushisampann.sride.entities.Ride;

@Repository
public interface RiderRepository  extends JpaRepository<Rider, Long>{

}
