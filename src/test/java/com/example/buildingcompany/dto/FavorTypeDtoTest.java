package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.FavorTypeMapper;
import com.example.buildingcompany.mapper.FavorTypeMapperImpl;
import com.example.buildingcompany.model.FavorType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorTypeDtoTest {
    private final FavorTypeMapper favorTypeMapper = new FavorTypeMapperImpl();

    @Test
    public void givenFavorTypeDto_whenSetName_thenCorrect() {

        // Given
        String name = "Test Favor Type";
        FavorTypeDto favorTypeDto = new FavorTypeDto();

        // When
        favorTypeDto.setName(name);

        FavorType favorType = favorTypeMapper.toFavorType(favorTypeDto);

        // Then
        Assertions.assertEquals(favorType.getName(), favorTypeDto.getName());
    }
}
