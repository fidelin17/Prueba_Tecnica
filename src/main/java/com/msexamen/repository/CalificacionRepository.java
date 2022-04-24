package com.msexamen.repository;

import com.msexamen.entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.util.resources.cldr.bn.CalendarData_bn_IN;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion,Integer> {
}
