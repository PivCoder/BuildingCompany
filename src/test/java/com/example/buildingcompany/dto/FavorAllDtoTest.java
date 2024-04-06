package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.FavorMapper;
import com.example.buildingcompany.mapper.FavorMapperImpl;
import com.example.buildingcompany.mapper.FavorTypeMapper;
import com.example.buildingcompany.mapper.FavorTypeMapperImpl;
import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.model.enums.TypeOfTimeLimit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorAllDtoTest {

    private final FavorTypeMapper favorTypeMapper = new FavorTypeMapperImpl();

    private final FavorMapper favorMapper = new FavorMapperImpl(favorTypeMapper);

    @Test
    public void givenFavorAllDtoToFavor_whenMaps_thenCorrect() {
        // Given
        FavorAllDto favorAllDto = new FavorAllDto();
        favorAllDto.setId(1L);
        favorAllDto.setDescription("Test description");
        favorAllDto.setImage("/image");
        favorAllDto.setArea(100.0);
        favorAllDto.setPrice(250.10);
        favorAllDto.setNumberOfTimeUnits(5);
        favorAllDto.setTypeOfTimeLimit(TypeOfTimeLimit.DAY);
        favorAllDto.setImages("/images");

        FavorTypeDto favorTypeDto = new FavorTypeDto();
        favorTypeDto.setId(1L);
        favorTypeDto.setName("Test Favor Type");
        favorAllDto.setFavorType(favorTypeDto);

        // When
        Favor favor = favorMapper.toFavor(favorAllDto);

        // Then
        Assertions.assertEquals(favorAllDto.getId(), favor.getId());
        Assertions.assertEquals(favorAllDto.getDescription(), favor.getDescription());
        Assertions.assertEquals(favorAllDto.getImage(), favor.getImage());
        Assertions.assertEquals(favorAllDto.getArea(), favor.getArea());
        Assertions.assertEquals(favorAllDto.getPrice(), favor.getPrice());
        Assertions.assertEquals(favorAllDto.getNumberOfTimeUnits(), favor.getNumberOfTimeUnits());
        Assertions.assertEquals(favorAllDto.getTypeOfTimeLimit(), favor.getTypeOfTimeLimit());
        Assertions.assertEquals(favorAllDto.getImages(), favor.getImages());
        Assertions.assertEquals(favorTypeDto.getName(), favor.getFavorType().getName());
    }
}
