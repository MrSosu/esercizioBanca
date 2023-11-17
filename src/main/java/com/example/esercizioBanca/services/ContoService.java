package com.example.esercizioBanca.services;

import com.example.esercizioBanca.repositories.ContoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContoService {

    @Autowired
    private ContoRepository contoRepository;

}
