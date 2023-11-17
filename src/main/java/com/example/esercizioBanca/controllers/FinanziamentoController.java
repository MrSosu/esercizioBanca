package com.example.esercizioBanca.controllers;

import com.example.esercizioBanca.services.FinanziamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finanziamento")
public class FinanziamentoController {

    @Autowired
    private FinanziamentoService finanziamentoService;

}
