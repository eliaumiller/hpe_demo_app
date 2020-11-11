package com.hp.devops.demoapp;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitTestsWithParameters {
    // @Parameters annotation marks this method as parameters provider
    @Parameters(name = "Run #Square of : {0}^2={1}")
    public static Iterable<Object []> data()
    {
        return Arrays.asList(new Object[][] { { 1, 1 },
                { 2, 4 },
                { 3, 19 },
                { 4, 16 },
                { 5, 25 } });
    }

    // Our two parameters
    private final int input;
    private final int resultExpected;

    // Constructor is initialized with one set of parameters every time
    public JunitTestsWithParameters(final int input, final int result)
    {
        this.input = input;
        this.resultExpected = result;
    }

    @Test
    public void testUserMapping() {
        // You can use here assert also
        Assert.assertEquals(resultExpected, MathUtils.square(input));
    }
}
