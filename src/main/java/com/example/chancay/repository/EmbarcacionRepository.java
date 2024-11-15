package com.example.chancay.repository;

import com.example.chancay.model.Embarcacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbarcacionRepository extends JpaRepository<Embarcacion, Integer> {
    
}
