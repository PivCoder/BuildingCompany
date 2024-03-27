package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PlotSlimDto {

    @Positive
    @NotNull
    Long id;

    @NotBlank
    String name;

    @NotBlank
    String address;

    @NotBlank
    String description;

    @NotBlank
    String image;
}
