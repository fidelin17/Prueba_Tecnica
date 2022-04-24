package com.msexamen.service;

import com.msexamen.entity.Estudiante;
import org.springframework.stereotype.Service;

@Service
public interface EstudianteService {
    Object newEstudiante(Estudiante estudiante) throws Exception;


}
