package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.service.api.AssortmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/assortment")
public class AssortmentRestController {
    private AssortmentService assortmentService;

    @Autowired
    public void setService(AssortmentService assortmentService) {

        this.assortmentService = assortmentService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Assortment>> getAllAssortment(){
        return new ResponseEntity<>(assortmentService.getAllAssortment(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Assortment> getAssortmentById(@PathVariable long id){
        Assortment assortment = assortmentService.getAssortmentById(id);
        return new ResponseEntity<>(assortment, HttpStatus.OK);
    }
}
