package com.example.esercizioBanca.controllers;

import com.example.esercizioBanca.services.TransazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transazione")
public class TransazioneController {

    @Autowired
    private TransazioneService transazioneService;

}
