package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Plot;
import com.example.buildingcompany.repository.PlotRepository;
import com.example.buildingcompany.service.api.PlotService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class PlotServiceImpl implements PlotService {
    PlotRepository plotRepository;

    @Autowired
    public void setPlotRepository(PlotRepository plotRepository) {
        this.plotRepository = plotRepository;
    }

    @Override
    public Plot addPlot(Plot plot) {
        return plotRepository.save(plot);
    }

    @Override
    public void deletePlot(long id) {
        plotRepository.deleteById(id);
    }

    @Override
    public Plot getPlotById(long id) {
        return plotRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public Plot editPlot(Plot plot) {
        return plotRepository.save(plot);
    }

    @Override
    public List<Plot> getAllPlots() {
        return plotRepository.findAll();
    }
}
