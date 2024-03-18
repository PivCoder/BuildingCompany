package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.FavorType;
import com.example.buildingcompany.repository.FavorTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class FavorTypeServiceImpl {

    private final FavorTypeRepository favorTypeRepository;

    public FavorType saveFavorType(FavorType favorType) {
        return favorTypeRepository.save(favorType);
    }

    public void deleteFavorType(long id) {
        favorTypeRepository.deleteById(id);
    }

    public FavorType getFavorTypeById(long id) {
        return favorTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public FavorType updateFavorType(FavorType favorType) {
        return favorTypeRepository.save(favorType);
    }

    public List<FavorType> getAllFavorTypes() {
        return favorTypeRepository.findAll();
    }
}
