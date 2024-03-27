package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FavorSlimDto {

    @Positive
    @NotNull
    Long id;

    @NotNull
    FavorTypeDto favorType;

    @NotBlank
    String description;

    @NotBlank
    String image;
}
