package com.msexamen.request;

import java.util.UUID;

public class PreguntaRespuestaRequest {

    private UUID idpregunta;
    private String respuesta;

    public PreguntaRespuestaRequest(){
    }
    public PreguntaRespuestaRequest(UUID idpregunta, String respuesta) {
        this.idpregunta = idpregunta;
        this.respuesta = respuesta;
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

    @Override
    public String toString() {
        return "PreguntaRespuestaRequest{" +
                "idpregunta='" + idpregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
