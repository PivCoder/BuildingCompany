package com.example.buildingcompany.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FavorTypeDto {

    @NotBlank
    String name;
}
