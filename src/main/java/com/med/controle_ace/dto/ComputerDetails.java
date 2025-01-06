package com.med.controle_ace.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDetails {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}
