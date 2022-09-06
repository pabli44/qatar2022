package com.pvelilla.qatar.project.Mundial2022.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Jugador {

    @Id
    @Column(name = "jugador_id")
    private Long jugadorId;

    @Column
    private String nombre;

    @Column
    private String equipo;

    @Column
    private String nacionalidad;

    @Column
    private double estatura;


}
