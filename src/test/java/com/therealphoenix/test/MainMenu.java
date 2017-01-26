package com.therealphoenix.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Hp on 25.01.2017.
 */
public enum MainMenu {



    MAIN(By.xpath(""), "Главная"),
    QA(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Обеспечение качества']"),"Обеспечение качества"),
    TESTING(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Тестирование']"),"Тестирование"),
    AUTOMATION(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Автоматизация']"),"Автоматизация"),
    SERVICES(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Сервис']"),"Сервис"),
    CONTACTS(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Контакт']"),"Контакты"),
    NEWS(By.xpath("//*[@id='mainmenu']/ul/li/a[text()='Новости']"),"Новости"),;

    MainMenu(By by, String description) {
    }



   }



