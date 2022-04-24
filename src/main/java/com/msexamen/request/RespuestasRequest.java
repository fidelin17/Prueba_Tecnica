package com.msexamen.request;

import java.util.List;
import java.util.UUID;

public class RespuestasRequest {

    private UUID idRespuestaEstudiante;
    private UUID idexamen;
    private UUID idestudiante;
    private List<PreguntaRespuestaRequest> list;

    public RespuestasRequest() {
    }

    public RespuestasRequest(UUID idRespuestaEstudiante, UUID idexamen, UUID idestudiante, List<PreguntaRespuestaRequest> list) {
        this.idRespuestaEstudiante = idRespuestaEstudiante;
        this.idexamen = idexamen;
        this.idestudiante = idestudiante;
        this.list = list;
    }

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

    public List<PreguntaRespuestaRequest> getList() {
        return list;
    }

    public void setList(List<PreguntaRespuestaRequest> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "RespuestasRequest{" +
                "idRespuestaEstudiante='" + idRespuestaEstudiante + '\'' +
                ", idexamen='" + idexamen + '\'' +
                ", idestudiante='" + idestudiante + '\'' +
                ", list=" + list +
                '}';
    }
}
