package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.FavorType;

import java.util.List;

public interface FavorTypeService {
    FavorType addFavorType(FavorType favorType);
    void deleteFavorType(long id);
    FavorType getFavorTypeById(long id);
    FavorType editFavorType(FavorType favorType);
    List<FavorType> getAllFavorTypes();
}
