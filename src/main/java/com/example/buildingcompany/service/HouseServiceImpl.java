package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.House;
import com.example.buildingcompany.repository.HouseRepository;
import com.example.buildingcompany.service.api.HouseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class HouseServiceImpl implements HouseService {
    HouseRepository houseRepository;

    @Autowired
    public void setHouseRepository(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public House addHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    public void deleteHouse(long id) {
        houseRepository.deleteById(id);
    }

    @Override
    public House getHouseById(long id) {
        return houseRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public House editHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }
}
