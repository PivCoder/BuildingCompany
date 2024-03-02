package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.TypeOfAssortment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfAssortmentRepository extends JpaRepository<TypeOfAssortment, Long> {
}
