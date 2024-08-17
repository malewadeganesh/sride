package com.krushisampann.sride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krushisampann.sride.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{

}
