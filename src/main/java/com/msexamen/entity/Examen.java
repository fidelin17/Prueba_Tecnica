package com.msexamen.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "examen")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@examen", scope = Examen.class)
public class Examen implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idexamen;
    private String nombre;

    @OneToMany(mappedBy = "examen")
    private List<Preguntas> preguntas;

    public List<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }

    public UUID getIdexamen() {
        return idexamen;
    }

    public void setIdexamen(UUID idexamen) {
        this.idexamen = idexamen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
