package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.PlotMapper;
import com.example.buildingcompany.mapper.PlotMapperImpl;
import com.example.buildingcompany.model.Plot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlotSlimDtoTest {
    private final PlotMapper plotMapper = new PlotMapperImpl();

    @Test
    public void givenPlotSlimDto_whenSetFields_thenCorrect() {
        // Given
        Long id = 1L;
        String name = "Test Plot";
        String address = "123 Main Street";
        String description = "Test description";
        String image = "/image.jpg";

        PlotSlimDto plotSlimDto = new PlotSlimDto();

        // When
        plotSlimDto.setId(id);
        plotSlimDto.setName(name);
        plotSlimDto.setAddress(address);
        plotSlimDto.setDescription(description);
        plotSlimDto.setImage(image);

        Plot plot = plotMapper.toPlot(plotSlimDto);

        // Then
        Assertions.assertEquals(plot.getId(), plotSlimDto.getId());
        Assertions.assertEquals(plot.getName(), plotSlimDto.getName());
        Assertions.assertEquals(plot.getAddress(), plotSlimDto.getAddress());
        Assertions.assertEquals(plot.getDescription(), plotSlimDto.getDescription());
        Assertions.assertEquals(plot.getImage(), plotSlimDto.getImage());
    }
}
