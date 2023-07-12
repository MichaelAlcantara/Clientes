package io.github.michaelAlcantara.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cfp;
    
    @Column
    private LocalDate dataCriação;
}
