package com.pvelilla.qatar.project.Mundial2022.controller;

import com.pvelilla.qatar.project.Mundial2022.dto.JugadorDto;
import com.pvelilla.qatar.project.Mundial2022.dto.ResponseMapDTO;
import com.pvelilla.qatar.project.Mundial2022.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiv1/jugadores")
public class JugadorController {

    private JugadorService jugadorService;

    @Autowired
    public JugadorController(final JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @CrossOrigin
    @PostMapping
    public ResponseMapDTO save(@RequestBody JugadorDto jugadorDto) {
        return new ResponseMapDTO("recordId", jugadorService.save(jugadorDto));
    }

    @CrossOrigin
    @DeleteMapping(value = "/{jugadorId}")
    public JugadorDto deleteById(@PathVariable Long jugadorId) {
        return jugadorService.deleteById(jugadorId);
    }

    @CrossOrigin
    @PutMapping(value = "/{jugadorId}")
    public JugadorDto updateById(@PathVariable Long jugadorId, @RequestBody JugadorDto jugadorDto) {
        return jugadorService.update(jugadorId, jugadorDto);
    }

    @CrossOrigin
    @GetMapping(value = "/{jugadorId}")
    public JugadorDto getAdressById(@PathVariable Long jugadorId) {
        return jugadorService.findById(jugadorId);
    }

    @CrossOrigin
    @GetMapping
    public List<JugadorDto> findALlRecords() {
        return jugadorService.findAll();
    }
}
