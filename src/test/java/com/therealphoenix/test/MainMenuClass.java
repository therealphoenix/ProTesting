package com.therealphoenix.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Hp on 26.01.2017.
 */
public class MainMenuClass {

    static final String MAIN = "//*[@id='mainmenu']/ul/li/a[text()='Главная']";
    static final String QA = "//*[@id='mainmenu']/ul/li/a[text()='Обеспечение Качества']";
    static final String TESTING = "//*[@id='mainmenu']/ul/li/a[text()='Тестирование']";
    static final String AUTOMATION = "//*[@id='mainmenu']/ul/li/a[text()='Автоматизация']";
    static final String SERVICES = "//*[@id='mainmenu']/ul/li/a[text()='Сервис и Услуги']";
    static final String CONTACTS = "//*[@id='mainmenu']/ul/li/a[text()='Контакт']";
    static final String NEWS = "//*[@id='mainmenu']/ul/li/a[text()='Новости']";



    private WebDriver webDriver;

    public MainMenuClass(WebDriver webDriver) {
        this.webDriver = webDriver;

    }

    public void goToPage( String destination){
        WebElement webElement = webDriver.findElement(By.xpath(destination));
        webElement.click();

    }
}
