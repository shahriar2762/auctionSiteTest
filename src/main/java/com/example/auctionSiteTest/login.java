package com.example.auctionSiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
    WebDriver driver;

    @BeforeMethod
    public void  beforeStart() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://auctiontakaschool.herokuapp.com");
        System.out.println("Browser Start");

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
    public void TC_02_Login_ValidInformation()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys("shahriar");
        password.sendKeys("shr123456");
        login.click();

//      As the server is down, i couldn't check the assertion.

    }

    @Test()
    public void TC_02_1_Login_UsernamePasswordInvalidInformation()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys("shah");
        password.sendKeys("shr1234567891");
        login.click();

        //      As the server is down, i couldn't check the assertion.


    }

    @Test()
    public void TC_02_2_Login_EmptyPasswordInValidInformation()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys("shahriar");
        password.sendKeys(" ");
        login.click();

//        As the server is down, i couldn't check the assertion.


    }

    @Test()
    public void TC_02_3_Login_PasswordInvalidInformation()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys("shahriar");
        password.sendKeys("sh1456");
        login.click();

        //        As the server is down, i couldn't check the assertion.


    }

    @Test()
    public void TC_02_4_Login_EmptyInformation()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.cssSelector(".btn"));

        username.sendKeys(" ");
        password.sendKeys(" ");
        login.click();

        //        As the server is down, i couldn't check the assertion.


    }
}
