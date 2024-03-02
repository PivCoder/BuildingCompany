package com.example.buildingcompany.service.api;

import java.util.List;
import java.util.Optional;

import com.example.buildingcompany.model.Assortment;

//TODO описать данный интерфейс
public interface AssortmentService {
    Assortment addAssortment(Assortment assortment);
    void deleteAssortment(long id);
    Optional<Assortment> getAssortmentById(long id);
    Assortment editAssortment(Assortment assortment);
    List<Assortment> getAllAssortment();
}
