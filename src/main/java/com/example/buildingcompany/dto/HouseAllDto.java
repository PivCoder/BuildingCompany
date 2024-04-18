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
    private Long id;

    @NotNull
    private HouseTypeDto houseType;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String image;

    @NotNull
    private MaterialTypeDto materialType;

    @Positive
    @NotNull
    private double area;

    @Positive
    @NotNull
    private int numberOfFloors;

    @NotNull
    private PercentageOfReadiness percentageOfReadiness;

    @NotBlank
    private String images;
}
