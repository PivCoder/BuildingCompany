package com.example.buildingcompany.dto;

import com.example.buildingcompany.model.enums.PercentageOfReadiness;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class HouseAllDto {
    @Positive
    @NotNull
    Long id;

    @NotNull
    HouseTypeDto houseType;

    @NotBlank
    String name;

    @NotBlank
    String description;

    @NotBlank
    String image;

    @NotNull
    MaterialTypeDto materialType;

    @Positive
    @NotNull
    double area;

    @Positive
    @NotNull
    int numberOfFloors;

    @NotNull
    PercentageOfReadiness percentageOfReadiness;

    @NotBlank
    String images;
}
