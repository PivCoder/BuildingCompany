package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlotAllDtoTest {

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

        // Then
        Assertions.assertEquals(id, plotAllDto.getId());
        Assertions.assertEquals(name, plotAllDto.getName());
        Assertions.assertEquals(address, plotAllDto.getAddress());
        Assertions.assertEquals(description, plotAllDto.getDescription());
        Assertions.assertEquals(image, plotAllDto.getImage());
        Assertions.assertEquals(size, plotAllDto.getSize());
        Assertions.assertEquals(electricity, plotAllDto.isElectricity());
        Assertions.assertEquals(water, plotAllDto.isWater());
        Assertions.assertEquals(price, plotAllDto.getPrice());
        Assertions.assertEquals(images, plotAllDto.getImages());
    }
}
