package com.hp.devops.demoapp.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 03/12/15
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 * THIS IS XANDER
 */
public class TestSuiteA_TestNG_Selenium {

    TestData data;

    private void setUp() {
        data = TestData.generate();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        setUp();
    }

    @Test(groups = {"Group_A"})
    public void testCase1() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (data.isMusicApp()) {
            query = data.getDriver().findElement(By.id("bandsList"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = data.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test
    public void testCase2() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (data.isMusicApp()) {
            query = data.getDriver().findElement(By.id("totalVotes"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = data.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test(groups = {"Group_A"})
    public void testCase3() {
        System.out.println("Proudly  running  test " + Thread.currentThread().getStackTrace()[1]);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        data.getDriver().quit();
    }
}