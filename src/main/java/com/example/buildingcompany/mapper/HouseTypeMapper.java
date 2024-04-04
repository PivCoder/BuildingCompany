package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.HouseTypeDto;
import com.example.buildingcompany.model.HouseType;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class HouseTypeMapper {

    public abstract HouseTypeDto toHouseTypeDto(HouseType houseType);

    public abstract HouseType toHouseType(HouseTypeDto houseTypeDto);
}
