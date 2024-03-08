package com.example.buildingcompany.repository;

import com.example.buildingcompany.model.HouseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseTypeRepository extends JpaRepository<HouseType, Long> {
}
