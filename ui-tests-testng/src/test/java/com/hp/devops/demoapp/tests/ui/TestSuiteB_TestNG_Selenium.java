package com.hp.devops.demoapp.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User:  gullery
 * Date: 03/11/14
 * Time: 15:50
 * To change this template use File | Settings | File Templates
 */
public class TestSuiteB_TestNG_Selenium {

    private TestData data;


    private void setUP() {

        data = TestData.generate();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        setUP();
    }

    @Test(groups = {"Group_B"})
    public void testCaseA() {
        System.out.println("Proudly   running   test " + Thread.currentThread().getStackTrace()[1]);
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
    public void testCaseB() {
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

    @Test(groups = {"Group_B"})
    public void testCaseC() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
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