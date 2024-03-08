package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.Favor;

import java.util.List;

public interface FavorService {
    Favor addFavor(Favor favor);
    void deleteFavor(long id);
    Favor getFavorById(long id);
    Favor editFavor(Favor favor);
    List<Favor> getAllFavors();
}
