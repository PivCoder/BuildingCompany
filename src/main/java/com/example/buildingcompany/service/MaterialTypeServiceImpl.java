package com.example.buildingcompany.service;

import com.example.buildingcompany.exception.ElementNotFoundException;
import com.example.buildingcompany.model.MaterialType;
import com.example.buildingcompany.repository.MaterialTypeRepository;
import com.example.buildingcompany.service.api.MaterialTypeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@Transactional
public class MaterialTypeServiceImpl implements MaterialTypeService {

    MaterialTypeRepository materialTypeRepository;

    @Autowired
    public void setMaterialTypeRepository(MaterialTypeRepository materialTypeRepository) {
        this.materialTypeRepository = materialTypeRepository;
    }

    @Override
    public MaterialType addMaterialType(MaterialType materialType) {
        return materialTypeRepository.save(materialType);
    }

    @Override
    public void deleteMaterialType(long id) {
        materialTypeRepository.deleteById(id);
    }

    @Override
    public MaterialType getMaterialTypeById(long id) {
        return materialTypeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException(" "));
    }

    @Override
    public MaterialType editMaterialType(MaterialType materialType) {
        return materialTypeRepository.save(materialType);
    }

    @Override
    public List<MaterialType> getAllMaterialTypes() {
        return materialTypeRepository.findAll();
    }
}
