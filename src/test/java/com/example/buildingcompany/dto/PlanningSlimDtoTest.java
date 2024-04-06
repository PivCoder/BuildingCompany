package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanningSlimDtoTest {

    @Test
    public void givenPlanningSlimDto_whenSetFields_thenCorrect() {
        // Given
        Long id = 1L;
        double length = 10.0;
        double width = 8.0;
        int numberOfFloors = 3;
        String image = "/image.jpg";

        PlanningSlimDto planningSlimDto = new PlanningSlimDto();

        // When
        planningSlimDto.setId(id);
        planningSlimDto.setLength(length);
        planningSlimDto.setWidth(width);
        planningSlimDto.setNumberOfFloors(numberOfFloors);
        planningSlimDto.setImage(image);

        // Then
        Assertions.assertEquals(id, planningSlimDto.getId());
        Assertions.assertEquals(length, planningSlimDto.getLength());
        Assertions.assertEquals(width, planningSlimDto.getWidth());
        Assertions.assertEquals(numberOfFloors, planningSlimDto.getNumberOfFloors());
        Assertions.assertEquals(image, planningSlimDto.getImage());
    }
}
