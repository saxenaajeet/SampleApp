package com.nhssystems.demo.NHSystems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhsystems.demo.NHSystem.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
