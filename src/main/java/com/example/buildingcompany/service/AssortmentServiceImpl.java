package com.example.buildingcompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.repository.AssortmentRepository;
import com.example.buildingcompany.service.api.AssortmentService;

//TODO описать данный класс
@Service
public class AssortmentServiceImpl implements AssortmentService {
    @Autowired
    private AssortmentRepository assortmentRepository;

    @Override
    public Assortment addAssortment(Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

    @Override
    public void deleteAssortment(long id) {
        assortmentRepository.deleteById(id);
    }

    @Override
    public Optional<Assortment> getAssortmentById(long id) {
        return assortmentRepository.findById(id);
    }

    @Override
    public Assortment editAssortment(Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

    @Override
    public List<Assortment> getAllAssortment() {
        return assortmentRepository.findAll();
    }

}
