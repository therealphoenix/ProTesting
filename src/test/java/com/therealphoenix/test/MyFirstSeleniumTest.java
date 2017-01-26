package com.therealphoenix.test;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by Hp on 21.01.2017.
 */
public class MyFirstSeleniumTest {

    @Test
    public void startWebDriver()  {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:/Java/Chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://protesting.ru/");
        Assert.assertTrue("Title should start with protesting",
                driver.getTitle().startsWith("Про"));

        driver.close();
        driver.quit();
    }
}
