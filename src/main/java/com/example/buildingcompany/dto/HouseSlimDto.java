package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class HouseSlimDto {

    @Positive
    @NotNull
    Long id;

    @NotNull
    HouseTypeDto houseType;

    @NotBlank
    String name;

    @Positive
    @NotNull
    double area;

    @NotBlank
    String description;

    @NotBlank
    String image;
}
