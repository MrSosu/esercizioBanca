package com.example.esercizioBanca.repositories;

import com.example.esercizioBanca.entities.Finanziamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanziamentoRepository extends JpaRepository<Finanziamento, Long> {
}
