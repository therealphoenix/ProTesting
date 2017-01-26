package com.therealphoenix.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Hp on 24.01.2017.
 */
public class ContactContact {
    private WebDriver webDriver;

    public ContactContact(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //*[@id="content"]/div/a[@href='https://www.facebook.com/%D0%9F%D1%80%D0%BE%D0%A2%D0%B5%D1%81%D1%82%D0%B8%D0%BD%D0%B3-688283944516204/#']
    //*[@id="content"]/div/a

    public boolean checkFacebookLink() {

        WebElement webElement =
                webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/a[@href='https://www.facebook.com/%D0%9F%D1%80%D0%BE%D0%A2%D0%B5%D1%81%D1%82%D0%B8%D0%BD%D0%B3-688283944516204/#']"));
        return webElement.getClass() != null;

    }

    public boolean checkTheImage() {
        WebElement webElement = webDriver.findElement(By.cssSelector("img[alt]"));
        return webElement.getClass() != null;


    }


}
