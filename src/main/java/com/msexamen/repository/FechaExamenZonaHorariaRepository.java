package com.msexamen.repository;

import com.msexamen.entity.FechaExamenzonaHoraria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FechaExamenZonaHorariaRepository extends JpaRepository<FechaExamenzonaHoraria, Integer> {
}
