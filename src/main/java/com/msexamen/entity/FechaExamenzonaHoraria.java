package com.msexamen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "fechaexamenzona")
public class FechaExamenzonaHoraria {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID ideFechaExamenZona;
    private UUID idfechaexamen;
    private UUID idestudiante;

    public UUID getIdeFechaExamenZona() {
        return ideFechaExamenZona;
    }

    public void setIdeFechaExamenZona(UUID ideFechaExamenZona) {
        this.ideFechaExamenZona = ideFechaExamenZona;
    }

    public UUID getIdfechaexamen() {
        return idfechaexamen;
    }

    public void setIdfechaexamen(UUID idfechaexamen) {
        this.idfechaexamen = idfechaexamen;
    }

    public UUID getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(UUID idestudiante) {
        this.idestudiante = idestudiante;
    }
}
