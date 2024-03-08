package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Favor;
import com.example.buildingcompany.repository.FavorRepository;
import com.example.buildingcompany.service.api.FavorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class FavorServiceImpl implements FavorService {
    FavorRepository favorRepository;

    @Autowired
    public void setFavorRepository(FavorRepository favorRepository) {
        this.favorRepository = favorRepository;
    }

    @Override
    public Favor addFavor(Favor favor) {
        return favorRepository.save(favor);
    }

    @Override
    public void deleteFavor(long id) {
        favorRepository.deleteById(id);
    }

    @Override
    public Favor getFavorById(long id) {
        return favorRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public Favor editFavor(Favor favor) {
        return favorRepository.save(favor);
    }

    @Override
    public List<Favor> getAllFavors() {
        return favorRepository.findAll();
    }
}
