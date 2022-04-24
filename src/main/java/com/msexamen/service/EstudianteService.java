package com.msexamen.service;

import com.msexamen.entity.Estudiante;
import com.msexamen.entity.Examen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstudianteService {
    Object newEstudiante(Estudiante estudiante) throws Exception;
    List<Estudiante> getAllEstudiantes() throws Exception;


}
