package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

//TODO уточнить по поводу этажности
//TODO в картинках выделить одну, для демонстрации в витрине

@Data
public class PlanningSlimDto {

    @Positive
    @NotNull
    private Long id;

    @Positive
    @NotNull
    private double length;

    @Positive
    @NotNull
    private double width;

    @Positive
    @NotNull
    private int numberOfFloors;

    @NotBlank
    private String image;
}
