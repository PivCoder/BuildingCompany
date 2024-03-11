package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.FavorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavorTypeRepository extends JpaRepository<FavorType, Long> {
}
