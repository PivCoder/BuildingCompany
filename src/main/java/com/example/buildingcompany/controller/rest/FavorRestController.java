package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.service.FavorServiceImpl;
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
@RequestMapping("rest/favor")
public class FavorRestController {
    private FavorServiceImpl favorService;

    @Autowired
    public void setService(FavorServiceImpl favorService) {

        this.favorService = favorService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Favor>> getAllFavors() {
        return new ResponseEntity<>(favorService.getAllFavors(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Favor> getFavorById(@PathVariable @Positive long id) {
        Favor favor = favorService.getFavorById(id);
        return new ResponseEntity<>(favor, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Favor> createFavor(@RequestBody Favor newFavor) {
        return new ResponseEntity<>(favorService.saveFavor(newFavor), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Favor> updateFavor(@RequestBody Favor favor) {
        favorService.updateFavor(favor);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Favor> deleteFavor(@PathVariable("id") @Positive Long id) {
        favorService.deleteFavor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
