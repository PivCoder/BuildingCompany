package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.HouseAllDto;
import com.example.buildingcompany.dto.HouseSlimDto;
import com.example.buildingcompany.model.House;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {HouseTypeMapper.class, MaterialTypeMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class HouseMapper {

    public abstract HouseAllDto toHouseAllDto(House house);

    public abstract HouseSlimDto toHouseSlimDto(House house);

    public abstract House toHouse(HouseAllDto houseAllDto);

    public abstract House toHouse(HouseSlimDto houseSlimDto);
}
