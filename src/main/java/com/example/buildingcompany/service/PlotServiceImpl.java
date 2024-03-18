package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Plot;
import com.example.buildingcompany.repository.PlotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class PlotServiceImpl {

    private final PlotRepository plotRepository;

    public Plot savePlot(Plot plot) {
        return plotRepository.save(plot);
    }

    public void deletePlot(long id) {
        plotRepository.deleteById(id);
    }

    public Plot getPlotById(long id) {
        return plotRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public Plot updatePlot(Plot plot) {
        return plotRepository.save(plot);
    }

    public List<Plot> getAllPlots() {
        return plotRepository.findAll();
    }
}
