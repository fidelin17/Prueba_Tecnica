package com.msexamen.service.implement;

import com.msexamen.entity.Ciudad;
import com.msexamen.repository.CiudadRepository;
import com.msexamen.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImplemet implements CiudadService {
    @Autowired
    private CiudadRepository repository;
    @Override
    public Object newZonaHoraria(Ciudad ciudad) throws Exception {
        Object newCiudad=repository.save(ciudad);
        return newCiudad;
    }
}
