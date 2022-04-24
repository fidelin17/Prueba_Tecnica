package com.msexamen.service;

import com.msexamen.entity.Preguntas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PreguntasService {
    Object newPregunta(Preguntas preguntas) throws Exception;
    List<Preguntas> getAllPreguntas() throws Exception;
}
