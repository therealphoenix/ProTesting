package com.therealphoenix.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Hp on 22.01.2017.
 */

//Mistakes
// incapsulation ( getter + setter ) в конструктор это класса можно подавать вебдрайвер


public class MainPage {
    //    List<WebElement> linkList;
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;

    }


    public void goToContact() {
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Контакт']"));
        webElement.click();


    }


    //*[@id="mainmenu"]/ul/li/a[text()='Контакт']

//    public void moveToContact() {
//        //now traverse over the list and check
//        for (int i = 0; i < linkList.size(); i++) {
//            if (linkList.get(i).getAttribute("href").contains("contact")) {
//                linkList.get(i).click();
//                break;
//            }
//        }

    // }

}
