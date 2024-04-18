package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FavorTypeDto {
    @Positive
    @NotNull
    private Long id;

    @NotBlank
    private String name;
}
