package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FavorSlimDto {

    @Positive
    @NotNull
    private Long id;

    @NotNull
    private FavorTypeDto favorType;

    @NotBlank
    private String description;

    @NotBlank
    private String image;
}
