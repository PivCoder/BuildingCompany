package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Assortment;
import com.example.buildingcompany.repository.AssortmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.NoSuchElementException;

//TODO доделать методы во всех сервисах под DTO
@Service
@Validated
@RequiredArgsConstructor
public class AssortmentServiceImpl {

    private final AssortmentRepository assortmentRepository;

    public void deleteAssortment(long id) {
        assortmentRepository.deleteById(id);
    }

    public Assortment getAssortmentById(long id) {
        return assortmentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("id = " + id));
    }

    public List<Assortment> getAllAssortment() {
        return assortmentRepository.findAll();
    }

}
