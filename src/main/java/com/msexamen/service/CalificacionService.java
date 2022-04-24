package com.msexamen.service;

import com.msexamen.entity.Calificacion;
import org.springframework.stereotype.Service;

@Service
public interface CalificacionService {
    Object newCalificacion(Calificacion calificacion) throws Exception;
}
