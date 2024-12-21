package com.example.controlezouhaidi.service;

import com.example.controlezouhaidi.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByProce(String proce);

}
