package com.msexamen.service.implement;

import com.msexamen.entity.Respuestas;
import com.msexamen.entity.RespuestasEstudiante;
import com.msexamen.repository.RespuestasEstudianteRepository;
import com.msexamen.service.RespuestasEstudianteService;
import com.msexamen.service.RespuestasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RespuestasEstudianteServiceImplemet implements RespuestasEstudianteService {
    @Autowired
    private RespuestasEstudianteRepository repository;

    @Override
    public Object newRespuestaEstudiante(RespuestasEstudiante respuestasEstudiante) throws Exception {
        Object newRespuestas= repository.save(respuestasEstudiante);
        return newRespuestas;
    }

    @Override
    public List<RespuestasEstudiante> obtenerRespuestas(UUID idestudiante, UUID idexamen) throws Exception {
        List<RespuestasEstudiante> list = (List<RespuestasEstudiante>) repository.getRespuestaEstudianteById(idestudiante,idexamen);
        return list;
    }
}
