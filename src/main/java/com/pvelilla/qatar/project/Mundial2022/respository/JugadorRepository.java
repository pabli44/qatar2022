package com.pvelilla.qatar.project.Mundial2022.respository;

import com.pvelilla.qatar.project.Mundial2022.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JugadorRepository extends JpaRepository<Jugador, Long>, JpaSpecificationExecutor<Jugador> {
}
