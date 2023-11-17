package com.example.esercizioBanca.controllers;

import com.example.esercizioBanca.services.ContoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conto")
public class ContoController {

    @Autowired
    private ContoService contoService;

}
