package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.FavorMapper;
import com.example.buildingcompany.mapper.FavorTypeMapper;
import com.example.buildingcompany.model.Favor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorDtoTest {

    FavorMapper favorMapper;
    FavorTypeMapper favorTypeMapper;

    @Test
    public void givenFavorToFavorSlimDto_whenMaps_thenCorrect() {
        FavorSlimDto favorSlimDto = new FavorSlimDto();
        favorSlimDto.setId(1L);
        FavorTypeDto favorTypeDto = new FavorTypeDto();
        favorTypeDto.setName("test favor type dto");
        favorSlimDto.setFavorType(favorTypeDto);
        favorSlimDto.setDescription("des");
        favorSlimDto.setImage("/images");

        Favor favor = favorMapper.toFavor(favorSlimDto);

        //Assertions.assertEquals(favorSlimDto.getId(), favor.getId());
        Assertions.assertEquals(favorTypeMapper.toFavorType(favorSlimDto.getFavorType()), favor.getFavorType());
        Assertions.assertEquals(favorSlimDto.getDescription(), favor.getDescription());
    }

    @Test
    public void givenFavorToFavorAllDto_whenMaps_thenCorrect() {

    }
}
