package com.msexamen.service;

import com.msexamen.entity.Ciudad;
import org.springframework.stereotype.Service;

@Service
public interface CiudadService {
    Object newZonaHoraria (Ciudad ciudad) throws Exception;
}
