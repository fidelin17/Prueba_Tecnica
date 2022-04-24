package com.msexamen.service.implement;

import com.msexamen.entity.Respuestas;
import com.msexamen.repository.RespuestasRepository;
import com.msexamen.service.RespuestasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuesServiceImplent implements RespuestasService {
    @Autowired
    private RespuestasRepository repository;
    @Override
    public Object newRespuestas(Respuestas respuestas) throws Exception {
        Object newRespuestas= repository.save(respuestas);
        return newRespuestas;
    }
}
