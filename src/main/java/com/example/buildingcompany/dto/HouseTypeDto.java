package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class HouseTypeDto {
    @NotBlank
    String name;
}
