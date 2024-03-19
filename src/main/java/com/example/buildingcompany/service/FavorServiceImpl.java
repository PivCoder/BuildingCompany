package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.repository.FavorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class FavorServiceImpl {

    private final FavorRepository favorRepository;

    public Favor saveFavor(Favor favor) {
        return favorRepository.save(favor);
    }

    public void deleteFavor(long id) {
        favorRepository.deleteById(id);
    }

    public Favor getFavorById(long id) {
        return favorRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public Favor updateFavor(Favor favor) {
        return favorRepository.save(favor);
    }

    public List<Favor> getAllFavors() {
        return favorRepository.findAll();
    }
}
