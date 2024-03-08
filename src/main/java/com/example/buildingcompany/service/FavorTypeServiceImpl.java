package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.FavorType;
import com.example.buildingcompany.repository.FavorTypeRepository;
import com.example.buildingcompany.service.api.FavorTypeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class FavorTypeServiceImpl implements FavorTypeService {
    FavorTypeRepository favorTypeRepository;

    @Autowired
    public void setFavorTypeRepository(FavorTypeRepository favorTypeRepository) {
        this.favorTypeRepository = favorTypeRepository;
    }

    @Override
    public FavorType addFavorType(FavorType favorType) {
        return favorTypeRepository.save(favorType);
    }

    @Override
    public void deleteFavorType(long id) {
        favorTypeRepository.deleteById(id);
    }

    @Override
    public FavorType getFavorTypeById(long id) {
        return favorTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public FavorType editFavorType(FavorType favorType) {
        return favorTypeRepository.save(favorType);
    }

    @Override
    public List<FavorType> getAllFavorTypes() {
        return favorTypeRepository.findAll();
    }
}
