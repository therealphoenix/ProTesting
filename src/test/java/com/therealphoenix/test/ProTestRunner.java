package com.therealphoenix.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Hp on 22.01.2017.
 */
public class ProTestRunner {


    @Test
    public void MainMenuClassTest() {

        System.setProperty(
                "webdriver.chrome.driver",
                "D:/Java/Chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://protesting.ru/");

        MainMenuClass mainMenuClass = new MainMenuClass(driver);
        mainMenuClass.goToPage(MainMenuClass.QA);
        mainMenuClass.goToPage(MainMenuClass.TESTING);
        mainMenuClass.goToPage(MainMenuClass.AUTOMATION);
        mainMenuClass.goToPage(MainMenuClass.SERVICES);
        mainMenuClass.goToPage(MainMenuClass.CONTACTS);
        mainMenuClass.goToPage(MainMenuClass.NEWS);
        mainMenuClass.goToPage(MainMenuClass.MAIN);

        System.out.println("Route is over!");

        driver.close();
        driver.quit();


    }


    @Test
    public void moveToContactPage() {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:/Java/Chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://protesting.ru/");

        //MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage mainPage1 = new MainPage(driver);
        mainPage1.goToContact();

//        mainPage.linkList = driver.findElements(By.tagName("a"));
//        mainPage.moveToContact();

        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
//        contactPage.contactList = driver.findElements(By.tagName("a"));
        contactPage.goToContact();

        ContactContact contactContact = PageFactory.initElements(driver, ContactContact.class);
        contactContact.faceBookList = driver.findElements(By.tagName("a"));
        contactContact.imageList = driver.findElements(By.cssSelector("img[alt]"));


        Assert.assertTrue("Facebook link have to be here", contactContact.isFacebookList());
        Assert.assertTrue("Image should be at page", contactContact.isImageList());


        System.out.println("И Леха такой молодой, и юный октябрь впереди!");

        // WebElement element = driver.findElement(By.cssSelector("a[href*='contact']")); - почему я не могу найти так?
        // element.submit();

        driver.close();
        driver.quit();
    }
}



