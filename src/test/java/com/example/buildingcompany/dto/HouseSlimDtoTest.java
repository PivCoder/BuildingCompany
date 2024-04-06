package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.HouseMapper;
import com.example.buildingcompany.mapper.HouseMapperImpl;
import com.example.buildingcompany.mapper.HouseTypeMapper;
import com.example.buildingcompany.mapper.HouseTypeMapperImpl;
import com.example.buildingcompany.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseSlimDtoTest {

    private final HouseTypeMapper houseTypeMapper = new HouseTypeMapperImpl();

    private final HouseMapper houseMapper = new HouseMapperImpl(houseTypeMapper);

    @Test
    public void givenHouseSlimDtoToHouse_whenMaps_thenCorrect() {
        HouseSlimDto houseSlimDto = new HouseSlimDto();
        houseSlimDto.setId(1L);
        houseSlimDto.setName("Test House");
        houseSlimDto.setArea(100.0);
        houseSlimDto.setDescription("Test description");
        houseSlimDto.setImage("test.jpg");

        HouseTypeDto houseTypeDto = new HouseTypeDto();
        houseTypeDto.setId(1L);
        houseTypeDto.setName("Test House Type");
        houseSlimDto.setHouseType(houseTypeDto);

        House house = houseMapper.toHouse(houseSlimDto);

        Assertions.assertEquals(houseSlimDto.getId(), house.getId());
        Assertions.assertEquals(houseSlimDto.getName(), house.getName());
        Assertions.assertEquals(houseSlimDto.getArea(), house.getArea());
        Assertions.assertEquals(houseSlimDto.getDescription(), house.getDescription());
        Assertions.assertEquals(houseSlimDto.getImage(), house.getImage());
        Assertions.assertEquals(houseTypeDto.getName(), house.getHouseType().getName());
    }
}
