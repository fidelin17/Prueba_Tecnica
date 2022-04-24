package com.msexamen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
@Entity
@Table(name = "respuestasEstudiante")
public class RespuestasEstudiante {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idRespuestaEstudiante;

    private UUID idexamen;
    private UUID idestudiante;
    private UUID idpregunta;
    private String respuesta;

    public UUID getIdRespuestaEstudiante() {
        return idRespuestaEstudiante;
    }

    public void setIdRespuestaEstudiante(UUID idRespuestaEstudiante) {
        this.idRespuestaEstudiante = idRespuestaEstudiante;
    }

    public UUID getIdexamen() {
        return idexamen;
    }

    public void setIdexamen(UUID idexamen) {
        this.idexamen = idexamen;
    }

    public UUID getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(UUID idestudiante) {
        this.idestudiante = idestudiante;
    }

    public UUID getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(UUID idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
