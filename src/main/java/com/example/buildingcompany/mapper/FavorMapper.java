package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.FavorAllDto;
import com.example.buildingcompany.dto.FavorSlimDto;
import com.example.buildingcompany.model.Favor;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = FavorTypeMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class FavorMapper {

    public abstract FavorAllDto toFavorAllDto(Favor favor);

    public abstract FavorSlimDto toFavorSlimDto(Favor favor);

    public abstract Favor toFavor(FavorAllDto favorAllDto);

    public abstract Favor toFavor(FavorSlimDto favorSlimDto);
}
