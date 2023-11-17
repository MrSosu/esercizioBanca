package com.example.esercizioBanca.repositories;

import com.example.esercizioBanca.entities.Transazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransazioneRepository extends JpaRepository<Transazione, Long> {
}
