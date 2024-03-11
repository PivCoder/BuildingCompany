package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.service.api.AssortmentService;
import com.example.buildingcompany.service.api.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/house")
public class HouseRestController {
    private HouseService houseService;

    @Autowired
    public void setService(HouseService houseService) {

        this.houseService = houseService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<House>> getAllHouses(){
        return new ResponseEntity<>(houseService.getAllHouses(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<House> getHouseById(@PathVariable long id){
        House house = houseService.getHouseById(id);
        return new ResponseEntity<>(house, HttpStatus.OK);
    }
}
