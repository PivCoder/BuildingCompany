package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Planning;
import com.example.buildingcompany.repository.PlanningRepository;
import com.example.buildingcompany.service.api.PlanningService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class PlanningServiceImpl implements PlanningService {
    PlanningRepository planningRepository;

    @Autowired
    public void setPlanningRepository(PlanningRepository planningRepository) {
        this.planningRepository = planningRepository;
    }

    @Override
    public Planning addPlanning(Planning planning) {
        return planningRepository.save(planning);
    }

    @Override
    public void deletePlanning(long id) {
        planningRepository.deleteById(id);
    }

    @Override
    public Planning getPlanningById(long id) {
        return planningRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public Planning editPlanning(Planning planning) {
        return planningRepository.save(planning);
    }

    @Override
    public List<Planning> getAllPlannings() {
        return planningRepository.findAll();
    }
}
