package com.msexamen.service;

import com.msexamen.entity.Respuestas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RespuestasService {
    Object newRespuestas(Respuestas respuestas) throws  Exception;
}
