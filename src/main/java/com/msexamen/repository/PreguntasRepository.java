package com.msexamen.repository;

import com.msexamen.entity.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PreguntasRepository extends JpaRepository<Preguntas,Integer> {

}
