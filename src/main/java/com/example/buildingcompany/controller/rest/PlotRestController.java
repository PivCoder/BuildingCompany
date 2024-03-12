package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Plot;
import com.example.buildingcompany.service.api.PlotService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Plot>> getAllPlots(){
        return new ResponseEntity<>(plotService.getAllPlots(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Plot> getPlotById(@PathVariable @Positive long id){
        Plot plot = plotService.getPlotById(id);
        return new ResponseEntity<>(plot, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Plot> createPlot(@RequestBody Plot newPlot){
        return new ResponseEntity<>(plotService.addPlot(newPlot), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Plot> updatePlot(@RequestBody Plot plot){
        plotService.editPlot(plot);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Plot> deletePlot(@PathVariable("id") @Positive Long id){
        plotService.deletePlot(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
