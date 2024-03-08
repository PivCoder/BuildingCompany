package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.repository.AssortmentRepository;
import com.example.buildingcompany.service.api.AssortmentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

//TODO доделать методы
@Service
@Validated
@Transactional
public class AssortmentServiceImpl implements AssortmentService {
    AssortmentRepository assortmentRepository;

    @Autowired
    public void setAssortmentRepository(AssortmentRepository assortmentRepository) {
        this.assortmentRepository = assortmentRepository;
    }

    @Override
    public Assortment addAssortment(Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

    @Override
    public void deleteAssortment(long id) {
        assortmentRepository.deleteById(id);
    }

    @Override
    public Assortment getAssortmentById(long id) {
        return assortmentRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
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
