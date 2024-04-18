package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.FavorTypeDto;
import com.example.buildingcompany.model.FavorType;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring-boot", injectionStrategy = InjectionStrategy.FIELD)
public abstract class FavorTypeMapper {

    public abstract FavorTypeDto toFavorTypeDto(FavorType favorType);

    public abstract FavorType toFavorType(FavorTypeDto favorTypeDto);
}
