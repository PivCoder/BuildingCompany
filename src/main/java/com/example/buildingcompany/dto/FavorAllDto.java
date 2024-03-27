package com.example.buildingcompany.dto;

import com.example.buildingcompany.model.enums.TypeOfTimeLimit;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FavorAllDto {
    @Positive
    @NotNull
    Long id;

    @NotNull
    FavorTypeDto favorType;

    @NotBlank
    String description;

    @NotBlank
    String image;

    @Positive
    @NotNull
    double area;

    @Positive
    @NotNull
    double price;

    @Positive
    @NotNull
    int numberOfTimeUnits;

    @NotNull
    TypeOfTimeLimit typeOfTimeLimit;

    @NotBlank
    String images;
}
