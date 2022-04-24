package com.msexamen.service.implement;

import com.msexamen.entity.Estudiante;
import com.msexamen.repository.EstudianteRepository;
import com.msexamen.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImplemet implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Object newEstudiante(Estudiante estudiante) throws Exception {
       Object newestudiante= estudianteRepository.save(estudiante);
        return newestudiante;
    }
}
