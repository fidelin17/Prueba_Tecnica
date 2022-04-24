package com.msexamen.service.implement;

import com.msexamen.entity.Estudiante;
import com.msexamen.repository.EstudianteRepository;
import com.msexamen.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImplemet implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Object newEstudiante(Estudiante estudiante) throws Exception {
       Object newestudiante= estudianteRepository.save(estudiante);
        return newestudiante;
    }

    @Override
    public List<Estudiante> getAllEstudiantes() throws Exception {
        List<Estudiante> list= estudianteRepository.findAll();
        return list;
    }
}
