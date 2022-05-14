package com.example.auctionSiteTest;

import io.qameta.allure.testng.TestInstanceParameter;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class signUp {
    WebDriver driver;




    @BeforeMethod
    public void  beforeStart() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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
    public void TC_01_SignUp_ValidInformation()
    {
        WebDriverWait wait = new WebDriverWait(driver,45);
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

//      Need to change the username everytime.
//      we can also check the test case TC_01_02, TC_01_05, TC_01_08, TC_01_10 here by changing the username, email & password in different valid format.

        username.sendKeys("softwrd04");
        email.sendKeys("shahriar12@gmail.com");
        pass.sendKeys("ltd123456");
        conf_pass.sendKeys("ltd123456");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();

//        If the registration is successful then it will redirect to the login page.

        Assert.assertEquals(driver.getCurrentUrl(),"http://auctiontakaschool.herokuapp.com/login/");


        System.out.println("Sign Up Completed.");


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

        username.sendKeys(" ");
        email.sendKeys(" ");
        pass.sendKeys(" ");
        conf_pass.sendKeys(" ");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


//      If the sign up is not complete then it will remain in the sign up page.
        Assert.assertEquals(driver.getCurrentUrl(),"http://auctiontakaschool.herokuapp.com/register/");


    }
//    @Test()
//    public void TC_01_2_SignUp_UsernameValidInformation()
//    {
//        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
//        signUp.click();
//
//        WebElement username = driver.findElement(By.id("id_username"));
//        WebElement email = driver.findElement(By.id("id_email"));
//        WebElement pass = driver.findElement(By.id("id_password1"));
//        WebElement conf_pass = driver.findElement(By.id("id_password2"));
//
//        username.sendKeys("");
//        email.sendKeys("");
//        pass.sendKeys("");
//        conf_pass.sendKeys("");
//
//        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
//        reg_acc.click();
//
//
//    }
    @Test()
    public void TC_01_3_SignUp_UserNameInValidInformation()
    {
        WebDriverWait wait = new WebDriverWait(driver,45);
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("  ..   =+ ");
        email.sendKeys("shahriar12@gmail.com");
        pass.sendKeys("ltd123456");
        conf_pass.sendKeys("ltd123456");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)")));

        WebElement message = driver.findElement(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)"));
        message.getText();

//      Get the validation message if it works perfectly.

        Assert.assertEquals(message.getText(),"Enter a valid username. This value may contain only letters, numbers, and @/./+/-/_ characters.");

    }
    @Test()
    public void TC_01_4_SignUp_EmailInValidInformation()
    {
//        I didn't get any email validation on the system.

        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("softwrd04");
        email.sendKeys("shr@gmailcom");
        pass.sendKeys("ltd123456");
        conf_pass.sendKeys("ltd123456");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();




    }
//    @Test()
//    public void TC_01_5_SignUp_EmailValidInformation()
//    {
//
////      I didn't get any email validation on the system.
//
//        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
//        signUp.click();
//
//        WebElement username = driver.findElement(By.id("id_username"));
//        WebElement email = driver.findElement(By.id("id_email"));
//        WebElement pass = driver.findElement(By.id("id_password1"));
//        WebElement conf_pass = driver.findElement(By.id("id_password2"));
//
//        username.sendKeys("");
//        email.sendKeys("");
//        pass.sendKeys("");
//        conf_pass.sendKeys("");
//
//        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
//        reg_acc.click();
//
//
//    }
    @Test()
    public void TC_01_6_SignUp_PasswordInvalidLimitDataInformation()
    {
        WebDriverWait wait = new WebDriverWait(driver,45);


        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("softwr");
        email.sendKeys("shr12@gmail.com");
        pass.sendKeys("ltd123");
        conf_pass.sendKeys("ltd123");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)")));

        WebElement message = driver.findElement(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)"));
        message.getText();

//      Get the This password is too short validation message if it works perfectly.

        Assert.assertEquals(message.getText(),"This password is too short. It must contain at least 8 characters.");






    }
    @Test()
    public void TC_01_7_SignUp_PasswordInvalidCommonNumbersInformation()
    {
        WebDriverWait wait = new WebDriverWait(driver,45);

        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("softwr");
        email.sendKeys("");
        pass.sendKeys("12345678");
        conf_pass.sendKeys("12345678");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();


        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)")));

        WebElement message = driver.findElement(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)"));
        message.getText();

//      Get the This password is too short validation message if it works perfectly.

        Assert.assertEquals(message.getText(),"This password is too common.");



    }
//    @Test()
//    public void TC_01_8_SignUp_PasswordValidInformation()
//    {
//        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
//        signUp.click();
//
//        WebElement username = driver.findElement(By.id("id_username"));
//        WebElement email = driver.findElement(By.id("id_email"));
//        WebElement pass = driver.findElement(By.id("id_password1"));
//        WebElement conf_pass = driver.findElement(By.id("id_password2"));
//
//        username.sendKeys("");
//        email.sendKeys("");
//        pass.sendKeys("");
//        conf_pass.sendKeys("");
//
//        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
//        reg_acc.click();
//
//
//    }


    @Test()
    public void TC_01_9_SignUp_PasswordInvalidNotMatchInformation()
    {
        WebDriverWait wait = new WebDriverWait(driver,45);

        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement username = driver.findElement(By.id("id_username"));
        WebElement email = driver.findElement(By.id("id_email"));
        WebElement pass = driver.findElement(By.id("id_password1"));
        WebElement conf_pass = driver.findElement(By.id("id_password2"));

        username.sendKeys("softwrd");
        email.sendKeys("");
        pass.sendKeys("ltd123456");
        conf_pass.sendKeys("ltd12345");

        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
        reg_acc.click();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)")));

        WebElement message = driver.findElement(By.cssSelector("div.container.h-100:nth-child(1) div.d-flex.justify-content-center.h-100 div.user_card ul.errorlist:nth-child(3) li:nth-child(1) ul.errorlist > li:nth-child(1)"));
        message.getText();

//      Get the password didn't match validation message if it works perfectly.

        Assert.assertEquals(message.getText(),"The two password fields didn’t match.");



    }


//    @Test()
//    public void TC_01_10_SignUp_PasswordMatchValidInformation()
//    {
//        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
//        signUp.click();
//
//        WebElement username = driver.findElement(By.id("id_username"));
//        WebElement email = driver.findElement(By.id("id_email"));
//        WebElement pass = driver.findElement(By.id("id_password1"));
//        WebElement conf_pass = driver.findElement(By.id("id_password2"));
//
//        username.sendKeys("");
//        email.sendKeys("");
//        pass.sendKeys("");
//        conf_pass.sendKeys("");
//
//        WebElement reg_acc = driver.findElement(By.cssSelector(".btn"));
//        reg_acc.click();
//
//
//    }




}
