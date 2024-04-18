package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.PlanningMapper;
import com.example.buildingcompany.mapper.PlanningMapperImpl;
import com.example.buildingcompany.model.Planning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanningSlimDtoTest {

    private final PlanningMapper planningMapper = new PlanningMapperImpl();

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

        Planning planning = planningMapper.toPlanning(planningSlimDto);

        // Then
        Assertions.assertEquals(planning.getId(), planningSlimDto.getId());
        Assertions.assertEquals(planning.getLength(), planningSlimDto.getLength());
        Assertions.assertEquals(planning.getWidth(), planningSlimDto.getWidth());
        Assertions.assertEquals(planning.getNumberOfFloors(), planningSlimDto.getNumberOfFloors());
        Assertions.assertEquals(planning.getImage(), planningSlimDto.getImage());
    }
}
