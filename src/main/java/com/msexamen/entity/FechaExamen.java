package com.msexamen.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "fechaexamen")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@fecha", scope = FechaExamen.class)
public class FechaExamen {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idfechaexamen;
    private UUID idexamen;
    private Date fecha;
    private UUID idciudad;


    @ManyToOne
    @JoinColumn(name = "idciudad", insertable = false, updatable = false)
    private Ciudad ciudad;

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

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

    public UUID getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(UUID idciudad) {
        this.idciudad = idciudad;
    }
}
