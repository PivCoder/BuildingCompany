package com.example.buildingcompany.dto;

import com.example.buildingcompany.mapper.HouseTypeMapper;
import com.example.buildingcompany.mapper.HouseTypeMapperImpl;
import com.example.buildingcompany.model.HouseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTypeDtoTest {

    private final HouseTypeMapper houseTypeMapper = new HouseTypeMapperImpl();

    @Test
    public void givenHouseTypeDto_whenSetName_thenCorrect() {
        // Given
        String name = "Test House Type";
        HouseTypeDto houseTypeDto = new HouseTypeDto();

        // When
        houseTypeDto.setName(name);
        HouseType houseType = houseTypeMapper.toHouseType(houseTypeDto);

        // Then
        Assertions.assertEquals(houseType.getName(), houseTypeDto.getName());
    }
}
