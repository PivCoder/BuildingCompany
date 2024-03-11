package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.Plot;

import java.util.List;

public interface PlotService {
    Plot addPlot(Plot plot);
    void deletePlot(long id);
    Plot getPlotById(long id);
    Plot editPlot(Plot plot);
    List<Plot> getAllPlots();
}
