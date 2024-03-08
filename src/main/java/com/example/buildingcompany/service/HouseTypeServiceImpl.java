package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.HouseType;
import com.example.buildingcompany.repository.HouseTypeRepository;
import com.example.buildingcompany.service.api.HouseTypeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class HouseTypeServiceImpl implements HouseTypeService {

    HouseTypeRepository houseTypeRepository;

    @Autowired
    public void setHouseTypeRepository(HouseTypeRepository houseTypeRepository) {
        this.houseTypeRepository = houseTypeRepository;
    }

    @Override
    public HouseType addHouseType(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }

    @Override
    public void deleteHouseType(long id) {
        houseTypeRepository.deleteById(id);
    }

    @Override
    public HouseType getHouseTypeById(long id) {
        return houseTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public HouseType editHouseType(HouseType houseType) {
        return houseTypeRepository.save(houseType);
    }

    @Override
    public List<HouseType> getAllHouseTypes() {
        return houseTypeRepository.findAll();
    }
}
