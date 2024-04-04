package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.FavorMapper;
import com.example.buildingcompany.mapper.FavorMapperImpl;
import com.example.buildingcompany.mapper.FavorTypeMapper;
import com.example.buildingcompany.mapper.FavorTypeMapperImpl;
import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.model.enums.TypeOfTimeLimit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FavorDtoTest {

    FavorMapper favorMapper = new FavorMapperImpl(new FavorTypeMapperImpl());

    FavorTypeMapper favorTypeMapper = new FavorTypeMapperImpl();

    @Test
    public void givenFavorToFavorSlimDto_whenMaps_thenCorrect() {
        FavorSlimDto favorSlimDto = new FavorSlimDto();
        favorSlimDto.setId(1L);
        FavorTypeDto favorTypeDto = new FavorTypeDto();
        favorTypeDto.setName("test favor type dto");
        favorSlimDto.setFavorType(favorTypeDto);
        favorSlimDto.setDescription("des");
        favorSlimDto.setImage("/image");

        Favor favor = favorMapper.toFavor(favorSlimDto);

        Assertions.assertEquals((Object) favorSlimDto.getId(), favor.getId());
        Assertions.assertEquals(favorTypeMapper.toFavorType(favorSlimDto.getFavorType()).getName(), favor.getFavorType().getName());
        Assertions.assertEquals(favorSlimDto.getDescription(), favor.getDescription());
        Assertions.assertEquals(favorSlimDto.getImage(), favor.getImage());
    }

    @Test
    public void givenFavorToFavorAllDto_whenMaps_thenCorrect() {
        FavorAllDto favorAllDto = new FavorAllDto();
        favorAllDto.setId(1L);
        FavorTypeDto favorTypeDto = new FavorTypeDto();
        favorTypeDto.setName("test favor type dto");
        favorAllDto.setFavorType(favorTypeDto);
        favorAllDto.setDescription("des");
        favorAllDto.setImage("/image");
        favorAllDto.setArea(250.10);
        favorAllDto.setPrice(250.10);
        favorAllDto.setNumberOfTimeUnits(5);
        favorAllDto.setTypeOfTimeLimit(TypeOfTimeLimit.DAY);
        favorAllDto.setImages("/images");

        Favor favor = favorMapper.toFavor(favorAllDto);

        Assertions.assertEquals((Object) favorAllDto.getId(), favor.getId());
        Assertions.assertEquals(favorTypeMapper.toFavorType(favorAllDto.getFavorType()).getName(), favor.getFavorType().getName());
        Assertions.assertEquals(favorAllDto.getDescription(), favor.getDescription());
        Assertions.assertEquals(favorAllDto.getImage(), favor.getImage());
        Assertions.assertEquals(favorAllDto.getArea(), favor.getArea());
        Assertions.assertEquals(favorAllDto.getPrice(), favor.getPrice());
        Assertions.assertEquals(favorAllDto.getNumberOfTimeUnits(), favor.getNumberOfTimeUnits());
        Assertions.assertEquals(favorAllDto.getTypeOfTimeLimit(), favor.getTypeOfTimeLimit());
        Assertions.assertEquals(favorAllDto.getImages(), favor.getImages());
    }
}
