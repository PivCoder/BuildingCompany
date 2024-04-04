package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.FavorTypeDto;
import com.example.buildingcompany.model.FavorType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class FavorTypeMapper {

    public abstract FavorTypeDto toFavorTypeDto(FavorType favorType);

    public abstract FavorType toFavorType(FavorTypeDto favorTypeDto);
}
