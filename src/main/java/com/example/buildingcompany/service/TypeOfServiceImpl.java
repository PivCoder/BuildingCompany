package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.TypeOfAssortment;
import com.example.buildingcompany.repository.TypeOfAssortmentRepository;
import com.example.buildingcompany.service.api.TypeOfAssortmentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

//TODO доделать нормальные методы

@Service
@Validated
@Transactional
public class TypeOfServiceImpl implements TypeOfAssortmentService {

    TypeOfAssortmentRepository typeOfAssortmentRepository;

    @Autowired
    public void setTypeOfAssortmentRepository(TypeOfAssortmentRepository typeOfAssortmentRepository) {
        this.typeOfAssortmentRepository = typeOfAssortmentRepository;
    }

    @Override
    public TypeOfAssortment addTypeOfAssortment(TypeOfAssortment typeOfAssortment) {
        return typeOfAssortmentRepository.save(typeOfAssortment);
    }

    @Override
    public void deleteTypeOfAssortment(long id) {
        typeOfAssortmentRepository.deleteById(id);
    }

    @Override
    public TypeOfAssortment getTypeOfAssortmentById(long id) {
        return typeOfAssortmentRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public TypeOfAssortment editTypeOfAssortment(TypeOfAssortment typeOfAssortment) {
        return typeOfAssortmentRepository.save(typeOfAssortment);
    }

    @Override
    public List<TypeOfAssortment> getAllTypeOfAssortment() {
        return typeOfAssortmentRepository.findAll();
    }
}
