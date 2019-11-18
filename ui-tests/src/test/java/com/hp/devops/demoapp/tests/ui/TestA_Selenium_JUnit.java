package com.hp.devops.demoapp.tests.ui;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 25/11/14
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 * test raluca 12345git
 * testDan1234 a
 */
public class TestA_Selenium_JUnit {

    static private TestData testData;

    @BeforeClass
    static public void beforeAll() {
        testData = TestData.generate();
    }

    @Test
    public void testUIcaseA() {
        System.out.println("Proudly  running  test   " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if(testData.isMusicApp()){
            query = testData.getDriver().findElement(By.id("bandsList"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Category(SpecialTests.class)
    @Test
    public void testUIcaseB() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if(testData.isMusicApp()){
            query = testData.getDriver().findElement(By.id("totalVotes"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test
    public void testUIcaseAlwaysPass() {
        System.out.println("Proudly  running test " + Thread.currentThread().getStackTrace()[1]);
        Assert.assertTrue(true);
    }

    @AfterClass
    static public void afterAll() {
        testData.getDriver().quit();
    }
}
