package com.pvelilla.qatar.project.Mundial2022.service.impl;

import com.pvelilla.qatar.project.Mundial2022.config.dozer.DozerMappingBuilder;
import com.pvelilla.qatar.project.Mundial2022.dto.JugadorDto;
import com.pvelilla.qatar.project.Mundial2022.entity.Jugador;
import com.pvelilla.qatar.project.Mundial2022.exceptions.RecordNotFoundException;
import com.pvelilla.qatar.project.Mundial2022.respository.JugadorRepository;
import com.pvelilla.qatar.project.Mundial2022.service.JugadorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JugadorServiceImpl implements JugadorService {

    private JugadorRepository jugadorRepository;

    private static final String NAME_DOMAIN = "Jugador";

    public JugadorServiceImpl(final JugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }
    @Override
    public List<JugadorDto> findAll() {
        return jugadorRepository
                .findAll()
                .stream().map(mapper -> new DozerMappingBuilder().map(mapper, JugadorDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public JugadorDto findById(Long jugadorId) {
        return jugadorRepository.findById(jugadorId)
                               .map(mapper -> new DozerMappingBuilder().map(mapper, JugadorDto.class))
                               .orElseThrow(() -> new RecordNotFoundException(NAME_DOMAIN, jugadorId));
    }

    @Override
    public Long save(JugadorDto JugadorDto) {
        Jugador jugador = new DozerMappingBuilder().map(JugadorDto, Jugador.class);
        jugadorRepository.save(jugador);
        return jugador.getJugadorId();
    }

    @Override
    public JugadorDto update(Long jugadorId, JugadorDto jugadorDto) {
        return jugadorRepository.findById(jugadorId).map(mapper -> {
            Jugador jugador= new DozerMappingBuilder().map(jugadorDto, Jugador.class);
            jugador.setJugadorId(jugadorId);
            jugadorRepository.save(jugador);
            return new DozerMappingBuilder().map(jugador, JugadorDto.class);
        }).orElseThrow(() -> new RecordNotFoundException(NAME_DOMAIN, jugadorId));
    }

    @Override
    public JugadorDto deleteById(Long jugadorId) {
        return jugadorRepository.findById(jugadorId).map(mapper -> {
            jugadorRepository.delete(mapper);
            return new DozerMappingBuilder().map(mapper, JugadorDto.class);
        }).orElseThrow(() -> new RecordNotFoundException(NAME_DOMAIN, jugadorId));
    }
}
