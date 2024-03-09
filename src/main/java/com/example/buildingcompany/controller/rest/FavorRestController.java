package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.service.api.AssortmentService;
import com.example.buildingcompany.service.api.FavorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/favor")
public class FavorRestController {
    private FavorService favorService;

    @Autowired
    public void setService(FavorService favorService) {

        this.favorService = favorService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Favor>> getAllFavors(){
        return new ResponseEntity<>(favorService.getAllFavors(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Favor> getFavorById(@PathVariable long id){
        Favor favor = favorService.getFavorById(id);
        return new ResponseEntity<>(favor, HttpStatus.OK);
    }
}
