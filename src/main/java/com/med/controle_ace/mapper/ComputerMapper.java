package com.med.controle_ace.mapper;

import com.med.controle_ace.dto.ComputerDTO;
import com.med.controle_ace.entites.Computer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ComputerMapper {

    public ComputerDTO ComputerToComputerDTO(Computer computer) {
        return new ComputerDTO(computer.getProce(), computer.getRam(), computer.getHardDrive(), computer.getPrice(), computer.getMacAddress());
    }

    public Computer ComputerDTOToComputer(ComputerDTO computerDTO) {
        Computer computer = new Computer();
        computer.setProce(computerDTO.getProce());
        computer.setRam(computerDTO.getRam());
        computer.setHardDrive(computerDTO.getHardDrive());
        computer.setPrice(computerDTO.getPrice());
        computer.setMacAddress(computerDTO.getMacAddress());
        return computer;
    }

    public List<ComputerDTO> toDTOs(List<Computer> computers) {
        return computers.stream().map(this::ComputerToComputerDTO).collect(Collectors.toList());
    }
}
