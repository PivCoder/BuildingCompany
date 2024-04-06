package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.FavorMapper;
import com.example.buildingcompany.mapper.FavorMapperImpl;
import com.example.buildingcompany.mapper.FavorTypeMapper;
import com.example.buildingcompany.mapper.FavorTypeMapperImpl;
import com.example.buildingcompany.model.Favor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorSlimDtoTest {

    private final FavorTypeMapper favorTypeMapper = new FavorTypeMapperImpl();

    private final FavorMapper favorMapper = new FavorMapperImpl(favorTypeMapper);

    @Test
    public void givenFavorSlimDtoToFavor_whenMaps_thenCorrect() {
        // Given
        FavorSlimDto favorSlimDto = new FavorSlimDto();
        favorSlimDto.setId(1L);
        favorSlimDto.setDescription("Test description");
        favorSlimDto.setImage("/image");

        FavorTypeDto favorTypeDto = new FavorTypeDto();
        favorTypeDto.setId(1L);
        favorTypeDto.setName("Test Favor Type");
        favorSlimDto.setFavorType(favorTypeDto);

        // When
        Favor favor = favorMapper.toFavor(favorSlimDto);

        // Then
        Assertions.assertEquals(favorSlimDto.getId(), favor.getId());
        Assertions.assertEquals(favorSlimDto.getDescription(), favor.getDescription());
        Assertions.assertEquals(favorSlimDto.getImage(), favor.getImage());
        Assertions.assertEquals(favorTypeDto.getName(), favor.getFavorType().getName());
    }
}
