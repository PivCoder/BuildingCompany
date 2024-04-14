package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.House;
import com.example.buildingcompany.service.HouseServiceImpl;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("rest/house")
public class HouseRestController {
    private HouseServiceImpl houseService;

    @Autowired
    public void setService(HouseServiceImpl houseService) {

        this.houseService = houseService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<House>> getAllHouses() {
        return new ResponseEntity<>(houseService.getAllHouses(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<House> getHouseById(@PathVariable @Positive long id) {
        House house = houseService.getHouseById(id);
        return new ResponseEntity<>(house, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<House> createHouse(@RequestBody House newHouse) {
        return new ResponseEntity<>(houseService.saveHouse(newHouse), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<House> updateHouse(@RequestBody House house) {
        houseService.updateHouse(house);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<House> deleteHouse(@PathVariable("id") @Positive Long id) {
        houseService.deleteHouse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
