package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFound;
import com.example.buildingcompany.model.TypeOfAssortment;
import com.example.buildingcompany.repository.TypeOfAssortmentRepository;
import com.example.buildingcompany.service.api.TypeOfAssortmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO доделать нормальные методы

@Service
public class TypeOfServiceImpl implements TypeOfAssortmentService {

    //TODO переделать в инъекцию метода
    @Autowired
    private TypeOfAssortmentRepository typeOfAssortmentRepository;

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
        return typeOfAssortmentRepository.findById(id).orElseThrow(() -> new ElementNotFound(""));
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
