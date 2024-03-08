package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.MaterialType;

import java.util.List;

public interface MaterialTypeService {
    MaterialType addMaterialType(MaterialType materialType);
    void deleteMaterialType(long id);
    MaterialType getMaterialTypeById(long id);
    MaterialType editMaterialType(MaterialType materialType);
    List<MaterialType> getAllMaterialTypes();
}
