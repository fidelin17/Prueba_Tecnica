package com.msexamen.service;

import com.msexamen.entity.Examen;
import com.msexamen.entity.Preguntas;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface ExamenService {
    Object newExamen(Examen examen) throws Exception;
    List<Examen> getAllExamens() throws Exception;
}
