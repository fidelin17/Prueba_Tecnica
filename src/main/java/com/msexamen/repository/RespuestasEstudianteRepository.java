package com.msexamen.repository;

import com.msexamen.entity.RespuestasEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RespuestasEstudianteRepository extends JpaRepository<RespuestasEstudiante, Integer> {

    @Query("SELECT re FROM RespuestasEstudiante re WHERE re.idestudiante = :idestudiante and re.idexamen= :idexamen")
    List<RespuestasEstudiante> getRespuestaEstudianteById(@Param("idestudiante") UUID idestudiante, @Param("idexamen") UUID idexamen) throws Exception;

}
