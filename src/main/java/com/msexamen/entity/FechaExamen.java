package com.msexamen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "fechaexamen")
public class FechaExamen {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"

    )
    private UUID idfechaexamen;
    private UUID idexamen;
    private Date fecha;
    private String zonaHoraria;

    public UUID getIdfechaexamen() {
        return idfechaexamen;
    }

    public void setIdfechaexamen(UUID idfechaexamen) {
        this.idfechaexamen = idfechaexamen;
    }

    public UUID getIdexamen() {
        return idexamen;
    }

    public void setIdexamen(UUID idexamen) {
        this.idexamen = idexamen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }
}
