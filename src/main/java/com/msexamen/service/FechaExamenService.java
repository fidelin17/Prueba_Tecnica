package com.msexamen.service;

import com.msexamen.entity.FechaExamen;
import org.springframework.stereotype.Service;

@Service
public interface FechaExamenService {
    Object newFechaExamen(FechaExamen fechaExamen) throws Exception;
}
