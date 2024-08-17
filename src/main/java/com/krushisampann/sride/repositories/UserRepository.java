package com.krushisampann.sride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krushisampann.sride.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
