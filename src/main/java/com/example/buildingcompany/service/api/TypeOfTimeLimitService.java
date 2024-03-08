package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.TypeOfTimeLimit;

import java.util.List;

public interface TypeOfTimeLimitService {
    TypeOfTimeLimit addTypeOfTimeLimit(TypeOfTimeLimit typeOfTimeLimit);
    void deleteTypeOfTimeLimit(long id);
    TypeOfTimeLimit getTypeOfTimeLimitById(long id);
    TypeOfTimeLimit editTypeOfTimeLimit(TypeOfTimeLimit typeOfTimeLimit);
    List<TypeOfTimeLimit> getAllTypeOfTimeLimits();
}
