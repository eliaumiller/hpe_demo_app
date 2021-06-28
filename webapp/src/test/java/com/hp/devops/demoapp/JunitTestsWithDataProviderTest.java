
package com.hp.devops.demoapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JunitTestsWithDataProviderTest {

    // Our two parameters
    //private final int input;
    //private final int resultExpected;

    // Constructor is initialized with one set of parameters every time
//    public JunitTestsWithDataProviderTest(final int input, final int result)
//    {
//        this.input = input;
//        this.resultExpected = result;
//    }

    @Test(dataProvider = "data provider" , dataProviderClass = DProvider.class, alwaysRun = true, timeOut = 1500000, priority = 1)
    public void testSquareUtilDP(int resultExpected, int input) {
        // You can use here assert also
        Assert.assertEquals(resultExpected, MathUtils.square(input));
    }

    @Test(dataProvider = "data provider" , dataProviderClass = DProvider.class, alwaysRun = true, timeOut = 1500000, priority = 1)
    public void testRootUtilDP(int input,int resultExpected) {
        // You can use here assert also
        Assert.assertEquals(input, MathUtils.square(resultExpected));
    }
}
