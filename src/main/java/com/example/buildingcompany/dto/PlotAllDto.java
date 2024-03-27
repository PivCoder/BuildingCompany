package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PlotAllDto {
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

    @NotNull
    double size;

    @NotNull
    boolean electricity;

    @NotNull
    boolean water;

    @Positive
    @NotNull
    double price;

    @NotBlank
    String images;
}
