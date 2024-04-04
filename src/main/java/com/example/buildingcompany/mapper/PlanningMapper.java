package com.example.buildingcompany.mapper;

import com.example.buildingcompany.dto.PlanningSlimDto;
import com.example.buildingcompany.model.Planning;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PlanningMapper {

    public abstract PlanningSlimDto toPlanningSlimDto(Planning planning);

    public abstract Planning toPlanning(PlanningSlimDto planningSlimDto);
}
