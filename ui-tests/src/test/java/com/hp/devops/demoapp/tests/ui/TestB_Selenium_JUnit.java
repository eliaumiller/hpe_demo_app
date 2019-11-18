package com.hp.devops.demoapp.tests.ui;/**
 * Created with IntelliJ IDEA.
 * User: belozovs
 * Date: 12/7/14
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.abcioana-malinaaasd
 *
 */

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestB_Selenium_JUnit {

    static private TestData testData;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testData = TestData.generate();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        testData.getDriver().quit();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testUIcaseC() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
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
    public void testUIcaseD() {
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

}
