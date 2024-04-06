package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlotSlimDtoTest {

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

        // Then
        Assertions.assertEquals(id, plotSlimDto.getId());
        Assertions.assertEquals(name, plotSlimDto.getName());
        Assertions.assertEquals(address, plotSlimDto.getAddress());
        Assertions.assertEquals(description, plotSlimDto.getDescription());
        Assertions.assertEquals(image, plotSlimDto.getImage());
    }
}
