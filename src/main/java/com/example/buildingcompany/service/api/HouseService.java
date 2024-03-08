package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.House;

import java.util.List;

public interface HouseService {
    House addHouse(House house);
    void deleteHouse(long id);
    House getHouseById(long id);
    House editHouse(House house);
    List<House> getAllHouses();
}
