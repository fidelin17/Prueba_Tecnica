package com.msexamen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "respuestas")
public class Respuestas implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idrespuesta;
    private UUID idpregunta;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private String correcta;

    @ManyToOne
    @JoinColumn(name = "idpregunta", insertable = false, updatable = false)
    private Preguntas preguntas;

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }

    public UUID getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(UUID idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public UUID getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(UUID idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
}
