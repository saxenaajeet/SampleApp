package com.nhssystems.demo.NHSystems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhsystems.demo.NHSystem.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
