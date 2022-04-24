package com.msexamen.repository;

import com.msexamen.entity.Respuestas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RespuestasRepository extends JpaRepository<Respuestas,Integer> {

    @Query("SELECT r.correcta FROM Respuestas r WHERE r.idpregunta = :id")
    public int getRespuestaByPreguntaId(@Param("id") UUID id);
}
