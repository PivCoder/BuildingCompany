package com.example.buildingcompany.dto;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite of All DTO Tests")
@SelectClasses({
        FavoriteTest.class,
        FavorDtoTest.class,
        FavorSlimDtoTest.class,
        FavorTypeDtoTest.class,
        HouseAlIDtoTest.class,
        HouseSlimDtoTest.class,
        HouseTypeDtoTest.class,
        MaterialTypeDtoTest.class,
        PlanningSlimDtoTest.class,
        PlotAllDtoTest.class,
        PlotSlimDtoTest.class
})
public class AllDtoTestsSuite {
    // Этот класс используется только для аннотаций
}
