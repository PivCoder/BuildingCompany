package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PlotAllDto {

    @Positive
    @NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String address;

    @NotBlank
    private String description;

    @NotBlank
    private String image;

    @NotNull
    private double size;

    @NotNull
    private boolean electricity;

    @NotNull
    private boolean water;

    @Positive
    @NotNull
    private double price;

    @NotBlank
    private String images;
}
