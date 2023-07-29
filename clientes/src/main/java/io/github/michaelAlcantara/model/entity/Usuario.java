package io.github.michaelAlcantara.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Significa que é único
    @Column(unique = true, name = "login")
    private String username;

    @Column(name = "senha")
    private String password;
}
