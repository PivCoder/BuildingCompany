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
    private Long id;

    @NotNull
    private FavorTypeDto favorType;

    @NotBlank
    private String description;

    @NotBlank
    private String image;

    @Positive
    @NotNull
    private double area;

    @Positive
    @NotNull
    private double price;

    @Positive
    @NotNull
    private int numberOfTimeUnits;

    @NotNull
    private TypeOfTimeLimit typeOfTimeLimit;

    @NotBlank
    private String images;
}
