package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTypeDtoTest {

    @Test
    public void givenHouseTypeDto_whenSetName_thenCorrect() {
        // Given
        String name = "Test House Type";
        HouseTypeDto houseTypeDto = new HouseTypeDto();

        // When
        houseTypeDto.setName(name);

        // Then
        Assertions.assertEquals(name, houseTypeDto.getName());
    }
}
