package com.mf.testng.test.rest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DProvider {
    @DataProvider(name = "data provider")
    @Parameters
    public static Object[][] dpMethod() {
        return new Object[][]{ { 1, 1 },{ 2, 4 },{ 3, 19 },{ 4, 16 },{ 5, 25 } };

    }
}