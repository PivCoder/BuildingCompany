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
    Long id;

    @Positive
    @NotNull
    double length;

    @Positive
    @NotNull
    double width;

    @Positive
    @NotNull
    int numberOfFloors;

    @NotBlank
    String image;
}
