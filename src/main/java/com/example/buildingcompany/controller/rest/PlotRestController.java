package com.example.buildingcompany.controller.rest;

import com.example.buildingcompany.model.Plot;
import com.example.buildingcompany.service.PlotServiceImpl;
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
@RequestMapping("rest/plot")
public class PlotRestController {
    private PlotServiceImpl plotService;

    @Autowired
    public void setService(PlotServiceImpl plotService) {

        this.plotService = plotService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Plot>> getAllPlots() {
        return new ResponseEntity<>(plotService.getAllPlots(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Plot> getPlotById(@PathVariable @Positive long id) {
        Plot plot = plotService.getPlotById(id);
        return new ResponseEntity<>(plot, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Plot> createPlot(@RequestBody Plot newPlot) {
        return new ResponseEntity<>(plotService.savePlot(newPlot), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Plot> updatePlot(@RequestBody Plot plot) {
        plotService.updatePlot(plot);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Plot> deletePlot(@PathVariable("id") @Positive Long id) {
        plotService.deletePlot(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
