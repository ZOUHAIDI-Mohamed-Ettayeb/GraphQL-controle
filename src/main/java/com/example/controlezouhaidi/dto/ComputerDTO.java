package com.example.controlezouhaidi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ComputerDTO {
    private String proce;
    private int ram;
    private double price;
    private String hardDrive;
    private String macAddress;

}