package com.msexamen.service.implement;

import com.msexamen.entity.Preguntas;
import com.msexamen.repository.PreguntasRepository;
import com.msexamen.service.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntasServiceImplement implements PreguntasService {
    @Autowired
    private PreguntasRepository repository;
    @Override
    public Object newPregunta(Preguntas preguntas) throws Exception {
        Object newPregunta= repository.save(preguntas);
        return newPregunta;
    }

    @Override
    public List<Preguntas> getAllPreguntas() throws Exception {
        List<Preguntas> list= repository.findAll();
        return list;
    }
}
