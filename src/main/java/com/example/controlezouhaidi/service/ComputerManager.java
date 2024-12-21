package com.example.controlezouhaidi.service;

import com.example.controlezouhaidi.dao.entities.Computer;
import com.example.controlezouhaidi.dao.repositories.ComputerRepository;
import com.example.controlezouhaidi.dto.ComputerDTO;
import com.example.controlezouhaidi.mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDTOToComputer(computerDTO);
        computer = computerRepository.save(computer);
        computerDTO = computerMapper.fromComputerToComputerDTO(computer);
        return computerDTO;
    }



    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }


}
