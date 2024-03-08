package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.TypeOfTimeLimit;
import com.example.buildingcompany.repository.TypeOfTimeLimitRepository;
import com.example.buildingcompany.service.api.TypeOfTimeLimitService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class TypeOfTimeLimitServiceImpl implements TypeOfTimeLimitService {
    TypeOfTimeLimitRepository typeOfTimeLimitRepository;

    @Autowired
    public void setTypeOfTimeLimitRepository(TypeOfTimeLimitRepository typeOfTimeLimitRepository) {
        this.typeOfTimeLimitRepository = typeOfTimeLimitRepository;
    }

    @Override
    public TypeOfTimeLimit addTypeOfTimeLimit(TypeOfTimeLimit typeOfTimeLimit) {
        return typeOfTimeLimitRepository.save(typeOfTimeLimit);
    }

    @Override
    public void deleteTypeOfTimeLimit(long id) {
        typeOfTimeLimitRepository.deleteById(id);
    }

    @Override
    public TypeOfTimeLimit getTypeOfTimeLimitById(long id) {
        return typeOfTimeLimitRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public TypeOfTimeLimit editTypeOfTimeLimit(TypeOfTimeLimit typeOfTimeLimit) {
        return typeOfTimeLimitRepository.save(typeOfTimeLimit);
    }

    @Override
    public List<TypeOfTimeLimit> getAllTypeOfTimeLimits() {
        return typeOfTimeLimitRepository.findAll();
    }
}
