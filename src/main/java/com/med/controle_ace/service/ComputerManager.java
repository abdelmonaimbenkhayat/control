package com.med.controle_ace.service;

import com.med.controle_ace.Repository.ComputerRepository;
import com.med.controle_ace.entites.Computer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    public final ComputerRepository computerRepository;

    @Override
    public List<Computer> findComputerByProce(String proce) {
        return computerRepository.findByProce(proce);
    }

    @Override
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }
}
