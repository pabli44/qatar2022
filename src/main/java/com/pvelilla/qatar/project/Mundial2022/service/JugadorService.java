package com.pvelilla.qatar.project.Mundial2022.service;

import com.pvelilla.qatar.project.Mundial2022.dto.JugadorDto;

import java.util.List;

public interface JugadorService {

    List<JugadorDto> findAll();

    JugadorDto findById(Long jugadorId);

    Long save(JugadorDto JugadorDto);

    JugadorDto update(Long jugadorId, JugadorDto jugadorDto);

    JugadorDto deleteById(Long jugadorId);
}
