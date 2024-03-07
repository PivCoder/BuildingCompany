package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.TypeOfAssortment;

import java.util.List;
import java.util.Optional;

public interface TypeOfAssortmentService {
    TypeOfAssortment addTypeOfAssortment(TypeOfAssortment typeOfAssortment);
    void deleteTypeOfAssortment(long id);
    TypeOfAssortment getTypeOfAssortmentById(long id);
    TypeOfAssortment editTypeOfAssortment(TypeOfAssortment typeOfAssortment);
    List<TypeOfAssortment> getAllTypeOfAssortment();
}
