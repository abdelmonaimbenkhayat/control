package com.med.controle_ace.service;

import com.med.controle_ace.entites.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findComputerByProce(String proce);
    Computer saveComputer(Computer computer);
}
