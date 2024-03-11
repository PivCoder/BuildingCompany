package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Plot;
import com.example.buildingcompany.service.api.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/plot")
public class PlotRestController {
    private PlotService plotService;

    @Autowired
    public void setService(PlotService plotService) {

        this.plotService = plotService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Plot>> getAllPLots(){
        return new ResponseEntity<>(plotService.getAllPlots(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Plot> getPlotById(@PathVariable long id){
        Plot plot = plotService.getPlotById(id);
        return new ResponseEntity<>(plot, HttpStatus.OK);
    }
}
