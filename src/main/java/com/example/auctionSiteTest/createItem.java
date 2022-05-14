package com.example.auctionSiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class createItem {

    WebDriver driver;

    @BeforeMethod
    public void  beforeStart() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://auctiontakaschool.herokuapp.com");
        System.out.println("Browser Start");

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys("");
        password.sendKeys("");
        login.click();

        WebElement navDropdown = driver.findElement(By.id("navbarDropdown"));
        WebElement addItem = driver.findElement(By.linkText("Create/Add"));

        navDropdown.click();
        addItem.click();

    }

    @AfterMethod
    public void tearDown()
    {
        if (driver != null) {
            driver.quit();
        }

        System.out.println("\nDriver Quit\n");


    }

    @Test()
    public void TC_03_createItem_validInformation()
    {

        //        As the server is down, i couldn't continue this.


    }
}
