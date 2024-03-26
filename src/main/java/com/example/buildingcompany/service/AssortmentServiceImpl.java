package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
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

    public Assortment saveAssortment(Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

    public void deleteAssortment(long id) {
        assortmentRepository.deleteById(id);
    }

    public Assortment getAssortmentById(long id) {
        return assortmentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("id = " + id));
    }

    public Assortment updateAssortment(Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

    public List<Assortment> getAllAssortment() {
        return assortmentRepository.findAll();
    }

}
