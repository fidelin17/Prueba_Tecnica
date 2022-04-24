package com.msexamen.service;

import com.msexamen.entity.RespuestasEstudiante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface RespuestasEstudianteService {
     Object newRespuestaEstudiante(RespuestasEstudiante respuestasEstudiante) throws  Exception;

    List<RespuestasEstudiante> obtenerRespuestas(UUID idestudiante, UUID idexamen) throws  Exception;
}
