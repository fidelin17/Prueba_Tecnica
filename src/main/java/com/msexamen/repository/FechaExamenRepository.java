package com.msexamen.repository;

import com.msexamen.entity.FechaExamen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FechaExamenRepository extends JpaRepository<FechaExamen,Integer> {
}
