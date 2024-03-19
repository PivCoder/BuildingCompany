package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.MaterialType;
import com.example.buildingcompany.repository.MaterialTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class MaterialTypeServiceImpl {

    private final MaterialTypeRepository materialTypeRepository;

    public MaterialType saveMaterialType(MaterialType materialType) {
        return materialTypeRepository.save(materialType);
    }

    public void deleteMaterialType(long id) {
        materialTypeRepository.deleteById(id);
    }

    public MaterialType getMaterialTypeById(long id) {
        return materialTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    public MaterialType updateMaterialType(MaterialType materialType) {
        return materialTypeRepository.save(materialType);
    }

    public List<MaterialType> getAllMaterialTypes() {
        return materialTypeRepository.findAll();
    }
}
