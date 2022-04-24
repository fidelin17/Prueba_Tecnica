package com.msexamen.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "estudiante")

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@estudiante", scope = Estudiante.class)
public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idestudiante;
    private String nombre;
    private  int edad;
    private UUID idciudad;

    @ManyToOne
    @JoinColumn(name = "idciudad", insertable = false, updatable = false)
    private Ciudad ciudad;

    public UUID getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(UUID idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public UUID getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(UUID idciudad) {
        this.idciudad = idciudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
