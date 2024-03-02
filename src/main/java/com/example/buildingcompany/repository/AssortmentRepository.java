package com.example.buildingcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingcompany.model.Assortment;

//TODO описать данный интерфейс
@Repository
public interface AssortmentRepository extends JpaRepository<Assortment, Long> {
}
