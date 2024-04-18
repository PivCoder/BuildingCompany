package com.example.buildingcompany;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite of All DTO Tests")
@SelectPackages("com.example.buildingcompany.dto")
public class DtoTestSuite {
    // Этот класс используется только для аннотаций
}
