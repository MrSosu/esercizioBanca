package com.example.esercizioBanca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Finanziamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    @Check(name = "check_ammontare_finanziamento", constraints = "ammontare > 0")
    private double ammontare;
    @Column(nullable = false)
    @Check(name = "check_durata_finanziamento", constraints = "durata > 0")
    private int durata;
    @Column(nullable = false)
    @Check(name = "check_tasso_finanziamento", constraints = "tasso >= 0")
    private double tasso;
    @ManyToOne
    private Conto conto;
    @ManyToOne
    private Cliente cliente;


}
