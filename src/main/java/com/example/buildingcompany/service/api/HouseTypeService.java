package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.HouseType;

import java.util.List;

public interface HouseTypeService {
    HouseType addHouseType(HouseType houseType);
    void deleteHouseType(long id);
    HouseType getHouseTypeById(long id);
    HouseType editHouseType(HouseType houseType);
    List<HouseType> getAllHouseTypes();
}
