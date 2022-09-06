package com.pvelilla.qatar.project.Mundial2022.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JugadorDto {

    private Long jugadorId;

    private String nombre;

    private String equipo;

    private String nacionalidad;

    private double estatura;
}
