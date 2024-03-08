package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.Planning;

import java.util.List;

public interface PlanningService {
    Planning addPlanning(Planning planning);
    void deletePlanning(long id);
    Planning getPlanningById(long id);
    Planning editPlanning(Planning planning);
    List<Planning> getAllPlannings();
}
