package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Planning;
import com.example.buildingcompany.repository.PlanningRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class PlanningServiceImpl {

    private final PlanningRepository planningRepository;

    public Planning savePlanning(Planning planning) {
        return planningRepository.save(planning);
    }

    public void deletePlanning(long id) {
        planningRepository.deleteById(id);
    }

    public Planning getPlanningById(long id) {
        return planningRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public Planning updatePlanning(Planning planning) {
        return planningRepository.save(planning);
    }

    public List<Planning> getAllPlannings() {
        return planningRepository.findAll();
    }
}
