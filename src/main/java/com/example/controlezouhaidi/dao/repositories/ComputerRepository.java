package com.example.controlezouhaidi.dao.repositories;

import com.example.controlezouhaidi.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

     List<Computer> findByProce(String proce);


}

