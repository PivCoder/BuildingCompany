package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.PlotAllDto;
import com.example.buildingcompany.dto.PlotSlimDto;
import com.example.buildingcompany.model.Plot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PlotMapper {

    public abstract PlotAllDto toPlotAllDto(Plot plot);

    public abstract PlotSlimDto toPLotSlimDto(Plot plot);

    public abstract Plot toPLot(PlotAllDto plotAllDto);

    public abstract Plot toPlot(PlotSlimDto plotSlimDto);
}
