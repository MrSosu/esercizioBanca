package com.example.esercizioBanca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    @Check(name = "check_costo_conto", constraints = "costo >= 0")
    private double costo;
    @Column(nullable = false)
    @Check(name = "check_tot_conto", constraints = "tot_conto >= 0")
    private double tot_conto;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Cliente> intestatari;

}
