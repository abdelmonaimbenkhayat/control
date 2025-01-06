package com.med.controle_ace.web;

import com.med.controle_ace.dto.ComputerDTO;
import com.med.controle_ace.mapper.ComputerMapper;
import com.med.controle_ace.service.ComputerManager;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {

    public ComputerManager computerManager;
    public ComputerMapper computerMapper;

    /*public ComputerGraphQLController(ComputerManager computerManager, ComputerMapper computerMapper) {
        this.computerManager = computerManager;
        this.computerMapper = computerMapper;
    }*/

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        return computerMapper.toDTOs(computerManager.findComputerByProce(proce));
    }

    @MutationMapping
    public ComputerDTO saveComputer(@Argument("computerDetail") ComputerDTO dto) {
        ComputerDTO computerDTO = new ComputerDTO(dto.getProce(), dto.getRam(), dto.getHardDrive(), dto.getPrice(), dto.getMacAddress());
        return computerMapper.ComputerToComputerDTO(
                computerManager.saveComputer(computerMapper.ComputerDTOToComputer(computerDTO)));
    }

}
