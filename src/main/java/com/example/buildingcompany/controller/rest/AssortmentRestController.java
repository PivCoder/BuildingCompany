package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.service.AssortmentServiceImpl;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/assortment")
public class AssortmentRestController {
    private AssortmentServiceImpl assortmentService;

    @Autowired
    public void setService(AssortmentServiceImpl assortmentService) {

        this.assortmentService = assortmentService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Assortment>> getAllAssortments(){
        return new ResponseEntity<>(assortmentService.getAllAssortment(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Assortment> getAssortmentById(@PathVariable @Positive long id){
        Assortment assortment = assortmentService.getAssortmentById(id);
        return new ResponseEntity<>(assortment, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Assortment> createAssortment(@RequestBody Assortment newAssortment){
        return new ResponseEntity<>(assortmentService.saveAssortment(newAssortment), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Assortment> updateAssortment(@RequestBody Assortment assortment){
        assortmentService.updateAssortment(assortment);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Assortment> deleteAssortment(@PathVariable("id") @Positive Long id){
        assortmentService.deleteAssortment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
