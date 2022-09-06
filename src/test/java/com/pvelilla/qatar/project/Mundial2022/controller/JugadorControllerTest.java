package com.pvelilla.qatar.project.Mundial2022.controller;

import com.pvelilla.qatar.project.Mundial2022.dto.JugadorDto;
import com.pvelilla.qatar.project.Mundial2022.respository.JugadorRepository;
import com.pvelilla.qatar.project.Mundial2022.service.impl.JugadorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorControllerTest {


    private static final String NOMBRE_JUGADOR = "Jorge Lopez";
    private static final String EQUIPO = "BARCELONA FC";
    private static final String NACIONALIDAD = "Argentina";
    private static final double ESTATURA = 1.98;
    @Mock
    private JugadorRepository jugadorRepository;

    @InjectMocks
    private JugadorServiceImpl jugadorService;

    private JugadorDto jugadorDto;


    public JugadorControllerTest() {
    }

    @BeforeEach
    public void setup(){
        jugadorRepository = Mockito.mock(JugadorRepository.class);
        jugadorService = new JugadorServiceImpl(jugadorRepository);
        jugadorDto = new JugadorDto();
    }

    @Test
    public void save() {
        jugadorDto.setJugadorId(3L);
        jugadorDto.setNombre(NOMBRE_JUGADOR);
        jugadorDto.setEquipo(EQUIPO);
        jugadorDto.setNacionalidad(NACIONALIDAD);
        jugadorDto.setEstatura(ESTATURA);

        jugadorService.save(jugadorDto);
        assertNotNull(jugadorDto.getJugadorId());

    }

    @Test
    public void deleteById() {

    }

    @Test
    public void updateById() {
        jugadorDto.setEstatura(2.50);
        jugadorDto.setEquipo("Valencia CF");
        jugadorDto.setNombre("Camilo Benedetti");
        jugadorDto.setNacionalidad("Italia");
        jugadorService.update(3L, jugadorDto);
    }

    @Test
    public void getAdressById() {
        assertNotNull(jugadorService.findById(3L));
    }

    @Test
    public void findALlRecords() {
        assertNotNull(jugadorService.findAll());
    }
}