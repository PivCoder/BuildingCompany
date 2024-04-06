package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.HouseMapper;
import com.example.buildingcompany.mapper.HouseMapperImpl;
import com.example.buildingcompany.mapper.HouseTypeMapper;
import com.example.buildingcompany.mapper.HouseTypeMapperImpl;
import com.example.buildingcompany.mapper.MaterialTypeMapper;
import com.example.buildingcompany.mapper.MaterialTypeMapperImpl;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.model.enums.PercentageOfReadiness;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseAllDtoTest {

    private final HouseTypeMapper houseTypeMapper = new HouseTypeMapperImpl();
    private final MaterialTypeMapper materialTypeMapper = new MaterialTypeMapperImpl();
    private final HouseMapper houseMapper = new HouseMapperImpl(houseTypeMapper, materialTypeMapper);

    @Test
    public void givenHouseAllDtoToHouse_whenMaps_thenCorrect() {
        // Given
        HouseAllDto houseAllDto = new HouseAllDto();
        houseAllDto.setId(1L);
        houseAllDto.setName("Test House");
        houseAllDto.setDescription("Test description");
        houseAllDto.setImage("/image");
        houseAllDto.setArea(100.0);
        houseAllDto.setNumberOfFloors(2);
        houseAllDto.setPercentageOfReadiness(PercentageOfReadiness.FINISHED);
        houseAllDto.setImages("/images");

        HouseTypeDto houseTypeDto = new HouseTypeDto();
        houseTypeDto.setId(1L);
        houseTypeDto.setName("Test House Type");
        houseAllDto.setHouseType(houseTypeDto);

        MaterialTypeDto materialTypeDto = new MaterialTypeDto();
        materialTypeDto.setId(1L);
        materialTypeDto.setName("Test Material Type");
        houseAllDto.setMaterialType(materialTypeDto);

        // When
        House house = houseMapper.toHouse(houseAllDto);

        // Then
        Assertions.assertEquals(houseAllDto.getId(), house.getId());
        Assertions.assertEquals(houseAllDto.getName(), house.getName());
        Assertions.assertEquals(houseAllDto.getDescription(), house.getDescription());
        Assertions.assertEquals(houseAllDto.getImage(), house.getImage());
        Assertions.assertEquals(houseAllDto.getArea(), house.getArea());
        Assertions.assertEquals(houseAllDto.getNumberOfFloors(), house.getNumberOfFloors());
        Assertions.assertEquals(houseAllDto.getPercentageOfReadiness(), house.getPercentageOfReadiness());
        Assertions.assertEquals(houseAllDto.getImages(), house.getImages());
        Assertions.assertEquals(houseTypeDto.getName(), house.getHouseType().getName());
        Assertions.assertEquals(materialTypeDto.getName(), house.getMaterialType().getName());
    }
}
