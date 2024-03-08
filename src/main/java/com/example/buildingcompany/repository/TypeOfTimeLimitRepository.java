package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.TypeOfTimeLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfTimeLimitRepository extends JpaRepository<TypeOfTimeLimit, Long> {
}
