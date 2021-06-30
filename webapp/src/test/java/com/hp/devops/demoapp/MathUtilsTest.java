
package com.hp.devops.demoapp;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathUtilsTest {
    // @Parameters annotation marks this method as parameters provider
    @Parameters
    public static Iterable<Object []> data()
    {
        return Arrays.asList(new Object[][] { { 1, 1 },
                { 2, 4 },
                { 3, 19 },
                { 4, 16 },
                { 625, 25 } });
    }

    // Our two parameters
    private final int input;
    private final int resultExpected;

    // Constructor is initialized with one set of parameters every time
    public MathUtilsTest(final int input, final int result)
    {
        this.input = input;
        this.resultExpected = result;
    }

    @Test
    public void testSquareUtil() {
        // You can use here assert also
        Assert.assertEquals(resultExpected, MathUtils.square(input));
    }

    @Test
    public void testRootUtil() {
        // You can use here assert also
        Assert.assertEquals(input, MathUtils.square(resultExpected));
    }
}
