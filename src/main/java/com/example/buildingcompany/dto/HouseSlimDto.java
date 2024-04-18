package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class HouseSlimDto {

    @Positive
    @NotNull
    private Long id;

    @NotNull
    private HouseTypeDto houseType;

    @NotBlank
    private String name;

    @Positive
    @NotNull
    private double area;

    @NotBlank
    private String description;

    @NotBlank
    private String image;
}
