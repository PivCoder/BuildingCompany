package com.example.buildingcompany.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaterialTypeDtoTest {

    @Test
    public void givenMaterialTypeDto_whenSetName_thenCorrect() {
        // Given
        String name = "Test Material Type";
        MaterialTypeDto materialTypeDto = new MaterialTypeDto();

        // When
        materialTypeDto.setName(name);

        // Then
        Assertions.assertEquals(name, materialTypeDto.getName());
    }
}
