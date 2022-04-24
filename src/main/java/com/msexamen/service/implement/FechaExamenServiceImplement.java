package com.msexamen.service.implement;

import com.msexamen.entity.FechaExamen;
import com.msexamen.repository.FechaExamenRepository;
import com.msexamen.service.FechaExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FechaExamenServiceImplement implements FechaExamenService {
    @Autowired
    private FechaExamenRepository repository;
    @Override
    public Object newFechaExamen(FechaExamen fechaExamen) throws Exception {
        Object newFechaExamen= repository.save(fechaExamen);
        return newFechaExamen;
    }
}
