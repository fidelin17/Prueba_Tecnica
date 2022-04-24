package com.msexamen.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ciudad")
//@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@ciudad", scope = Preguntas.class)
public class Ciudad {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idciudad;
    private String nombre;
    private String zonahoraria;

    @OneToMany(mappedBy = "ciudad")
    private List<FechaExamen> fechaexamen;

    @OneToMany(mappedBy = "ciudad")
    private List<Estudiante> estudiantes;

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

    public List<FechaExamen> getFechaexamen() {
        return fechaexamen;
    }

    public void setFechaexamen(List<FechaExamen> fechaexamen) {
        this.fechaexamen = fechaexamen;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
