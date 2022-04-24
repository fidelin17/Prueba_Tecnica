package com.msexamen.service.implement;

import com.msexamen.entity.Calificacion;
import com.msexamen.repository.CalificacionRepository;
import com.msexamen.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionServiceImplement implements CalificacionService {
    @Autowired
    private CalificacionRepository repository;

    @Override
    public Object newCalificacion(Calificacion calificacion) throws Exception {
        Object newcalifi= repository.save(calificacion);
        return newcalifi;
    }
}
