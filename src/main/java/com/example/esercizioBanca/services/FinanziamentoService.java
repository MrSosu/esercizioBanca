package com.example.esercizioBanca.services;

import com.example.esercizioBanca.repositories.FinanziamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanziamentoService {
    @Autowired
    private FinanziamentoRepository finanziamentoRepository;

}
