package com.example.esercizioBanca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(nullable = false)
    private LocalDate dataNascita;
    @Column(nullable = false)
    private String indirizzo;
    @Column(nullable = false)
    private String comune;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String telefono;
    @Column(nullable = false, unique = true)
    private String codiceFiscale;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Conto> contiCliente;


}
