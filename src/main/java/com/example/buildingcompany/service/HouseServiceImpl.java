package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class HouseServiceImpl {

    private final HouseRepository houseRepository;

    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    public void deleteHouse(long id) {
        houseRepository.deleteById(id);
    }

    public House getHouseById(long id) {
        return houseRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public House updateHouse(House house) {
        return houseRepository.save(house);
    }

    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }
}
