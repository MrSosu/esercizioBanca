package com.example.esercizioBanca.services;

import com.example.esercizioBanca.repositories.TransazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransazioneService {

    @Autowired
    private TransazioneRepository transazioneRepository;

}
