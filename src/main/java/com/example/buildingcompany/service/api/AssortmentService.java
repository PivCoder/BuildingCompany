package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.Assortment;

import java.util.List;

public interface AssortmentService {
    Assortment addAssortment(Assortment assortment);
    void deleteAssortment(long id);
    Assortment getAssortmentById(long id);
    Assortment editAssortment(Assortment assortment);
    List<Assortment> getAllAssortment();
}
