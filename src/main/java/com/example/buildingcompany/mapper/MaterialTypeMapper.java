package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.MaterialTypeDto;
import com.example.buildingcompany.model.MaterialType;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring-boot", injectionStrategy = InjectionStrategy.FIELD)
public abstract class MaterialTypeMapper {

    public abstract MaterialTypeDto toMaterialTypeDto(MaterialType materialType);

    public abstract MaterialType toMaterialType(MaterialTypeDto materialTypeDto);
}
