package com.thomas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
