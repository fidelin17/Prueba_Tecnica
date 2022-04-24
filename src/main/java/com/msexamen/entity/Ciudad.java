package com.msexamen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idciudad;
    private String nombre;
    private String zonahoraria;

    public UUID getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(UUID idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZonahoraria() {
        return zonahoraria;
    }

    public void setZonahoraria(String zonahoraria) {
        this.zonahoraria = zonahoraria;
    }
}
