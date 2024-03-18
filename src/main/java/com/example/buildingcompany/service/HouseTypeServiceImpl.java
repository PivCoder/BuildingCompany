package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.HouseType;
import com.example.buildingcompany.repository.HouseTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class HouseTypeServiceImpl {

    private final HouseTypeRepository houseTypeRepository;

    public HouseType saveHouseType(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }

    public void deleteHouseType(long id) {
        houseTypeRepository.deleteById(id);
    }

    public HouseType getHouseTypeById(long id) {
        return houseTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public HouseType updateHouseType(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }

    public List<HouseType> getAllHouseTypes() {
        return houseTypeRepository.findAll();
    }
}
