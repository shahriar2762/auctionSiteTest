package com.example.auctionSiteTest;

import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.*;

public class signUp {
    WebDriver driver;

    @BeforeTest
    public void  beforeTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://auctiontakaschool.herokuapp.com");
        System.out.println("Browser Start");

    }
    @Test()
    public void TC_01_SignUp_ValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }

    @Test()
    public void TC_01_1_SignUp_emptyData()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_2_SignUp_UsernameValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_3_SignUp_UserNameInValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_4_SignUp_EmailInValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_5_SignUp_EmailValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_6_SignUp_PasswordInValidLimitDataInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_7_SignUp_PasswordInValidCommonNumbersInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_8_SignUp_PasswordValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }@Test()
    public void TC_01_9_SignUp_PasswordInValidNotMatchInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }
    @Test()
    public void TC_01_10_SignUp_PasswordMatchValidInformation()
    {
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("");
        email.sendKeys("");
        pass.sendKeys("");
        conf_pass.sendKeys("");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


    }

    @AfterTest
    public void tearDown()
    {

    }


}
