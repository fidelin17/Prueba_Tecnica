package com.msexamen.service;

import com.msexamen.entity.FechaExamen;
import com.msexamen.entity.Preguntas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FechaExamenService {
    Object newFechaExamen(FechaExamen fechaExamen) throws Exception;
    List<FechaExamen> getAllFechasExamen() throws Exception;
}
