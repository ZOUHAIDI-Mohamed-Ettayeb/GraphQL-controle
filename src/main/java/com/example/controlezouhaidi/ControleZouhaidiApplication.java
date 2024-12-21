package com.example.controlezouhaidi;

import com.example.controlezouhaidi.dto.ComputerDTO;
import com.example.controlezouhaidi.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleZouhaidiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleZouhaidiApplication.class, args);

    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputer(
                    (ComputerDTO) List.of(
                            ComputerDTO.builder()
                                    .proce("Intel Core i5")
                                    .ram(8)
                                    .price(700.00)
                                    .hardDrive("512GB SSD")
                                    .macAddress("00:1A:2B:3C:4D:5E")
                                    .build(),
                            ComputerDTO.builder()
                                    .proce("AMD Ryzen 5")
                                    .ram(16)
                                    .price(900.50)
                                    .hardDrive("1TB HDD")
                                    .macAddress("00:1B:2C:3D:4E:5F")
                                    .build(),
                            ComputerDTO.builder()
                                    .proce("Intel Core i7")
                                    .ram(32)
                                    .price(1200.99)
                                    .hardDrive("2TB SSD")
                                    .macAddress("00:1C:2D:3E:4F:5G")
                                    .build(),
                            ComputerDTO.builder()
                                    .proce("Apple M1")
                                    .ram(16)
                                    .price(1500.75)
                                    .hardDrive("256GB SSD")
                                    .macAddress("00:1D:2E:3F:4G:5H")
                                    .build()
                    )

            );
        };
    }

}
