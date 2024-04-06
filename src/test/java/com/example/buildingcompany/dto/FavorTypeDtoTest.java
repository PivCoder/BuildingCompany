package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorTypeDtoTest {

    @Test
    public void givenFavorTypeDto_whenSetName_thenCorrect() {
        // Given
        String name = "Test Favor Type";
        FavorTypeDto favorTypeDto = new FavorTypeDto();

        // When
        favorTypeDto.setName(name);

        // Then
        Assertions.assertEquals(name, favorTypeDto.getName());
    }
}
