package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.MaterialTypeMapper;
import com.example.buildingcompany.mapper.MaterialTypeMapperImpl;
import com.example.buildingcompany.model.MaterialType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaterialTypeDtoTest {
    private final MaterialTypeMapper materialTypeMapper = new MaterialTypeMapperImpl();

    @Test
    public void givenMaterialTypeDto_whenSetName_thenCorrect() {
        // Given
        String name = "Test Material Type";
        MaterialTypeDto materialTypeDto = new MaterialTypeDto();

        // When
        materialTypeDto.setName(name);
        MaterialType materialType = materialTypeMapper.toMaterialType(materialTypeDto);

        // Then
        Assertions.assertEquals(materialType.getName(), materialTypeDto.getName());
    }
}
