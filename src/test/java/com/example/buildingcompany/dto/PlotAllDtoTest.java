package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.PlotMapper;
import com.example.buildingcompany.mapper.PlotMapperImpl;
import com.example.buildingcompany.model.Plot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlotAllDtoTest {
    private final PlotMapper plotMapper = new PlotMapperImpl();

    @Test
    public void givenPlotAllDto_whenSetFields_thenCorrect() {
        // Given
        Long id = 1L;
        String name = "Test Plot";
        String address = "123 Main Street";
        String description = "Test description";
        String image = "/image.jpg";
        double size = 1000.0;
        boolean electricity = true;
        boolean water = true;
        double price = 50000.0;
        String images = "/images";

        PlotAllDto plotAllDto = new PlotAllDto();

        // When
        plotAllDto.setId(id);
        plotAllDto.setName(name);
        plotAllDto.setAddress(address);
        plotAllDto.setDescription(description);
        plotAllDto.setImage(image);
        plotAllDto.setSize(size);
        plotAllDto.setElectricity(electricity);
        plotAllDto.setWater(water);
        plotAllDto.setPrice(price);
        plotAllDto.setImages(images);

        Plot plot = plotMapper.toPLot(plotAllDto);

        // Then
        Assertions.assertEquals(plot.getId(), plotAllDto.getId());
        Assertions.assertEquals(plot.getName(), plotAllDto.getName());
        Assertions.assertEquals(plot.getAddress(), plotAllDto.getAddress());
        Assertions.assertEquals(plot.getDescription(), plotAllDto.getDescription());
        Assertions.assertEquals(plot.getImage(), plotAllDto.getImage());
        Assertions.assertEquals(plot.getSize(), plotAllDto.getSize());
        Assertions.assertEquals(plot.isElectricity(), plotAllDto.isElectricity());
        Assertions.assertEquals(plot.isWater(), plotAllDto.isWater());
        Assertions.assertEquals(plot.getPrice(), plotAllDto.getPrice());
        Assertions.assertEquals(plot.getImages(), plotAllDto.getImages());
    }
}
