package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Planning;
import com.example.buildingcompany.service.PlanningServiceImpl;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("rest/planning")
public class PlanningRestController {
    private PlanningServiceImpl planningService;

    @Autowired
    public void setService(PlanningServiceImpl planningService) {

        this.planningService = planningService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Planning>> getAllPlannings() {
        return new ResponseEntity<>(planningService.getAllPlannings(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Planning> getPlanningById(@PathVariable @Positive long id) {
        Planning planning = planningService.getPlanningById(id);
        return new ResponseEntity<>(planning, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Planning> createPlanning(@RequestBody Planning newPlanning) {
        return new ResponseEntity<>(planningService.savePlanning(newPlanning), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Planning> updatePlanning(@RequestBody Planning planning) {
        planningService.updatePlanning(planning);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Planning> deletePlanning(@PathVariable("id") @Positive Long id) {
        planningService.deletePlanning(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
