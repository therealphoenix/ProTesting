package com.therealphoenix.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Hp on 24.01.2017.
 */
public class ContactPage {
    private WebDriver webDriver;

    public ContactPage (WebDriver webDriver) {
        this.webDriver = webDriver;

    }

    public void goToContact() {
        WebElement webElement =
               webDriver.findElement(By.xpath("//*[@id='leftside']/p/a[contains(text(),'Вопросы')]"));
        webElement.click();

    }
//*[@id="leftside"]/p/a[contains(text(),'Вопросы')]

}
