package com.example.parameterization.Repository;

import com.example.parameterization.Entity.SurgicalProcedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SurgicalProcedureRepository extends JpaRepository <SurgicalProcedure, Long >{
   @Query("DELETE FROM SurgicalProcedure s WHERE s.cptky = :id")
    void deleteAllById(long id);
    List<SurgicalProcedure> findByCptCodeContainingIgnoreCase(String cptCode);

}
