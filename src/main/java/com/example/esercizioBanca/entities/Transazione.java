package com.example.esercizioBanca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transazione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Conto conto_in;
    @ManyToOne
    private Conto conto_out;
    @Column(nullable = false)
    private LocalDateTime timestamp;
    @Column(nullable = false)
    @Check(name = "check_importo_transazione", constraints = "importo > 0")
    private double importo;

}
