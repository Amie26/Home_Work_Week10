package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LoginSuccessful extends BaseNopcommerce{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openMyBrowser(baseUrl);
    }

    @After
    public void closeWebsite (){
        closeMyBrowser();
    }

    @Test
    public void verifyValidCredentials() throws InterruptedException {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        Thread.sleep(2000);
//Finding the login link and to click  on login link element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.click();

        emailField.sendKeys("mary123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.click();
        passwordField.sendKeys("password123");
//finding the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value = 'Log in']"));
        loginBtn.click();
//Expected message
        WebElement loginMsg = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        String actualLoginMessage = loginMsg.getText();

        String expectedloginMessage = "Welcome to our store";

        Assert.assertEquals(expectedloginMessage,actualLoginMessage);
//Asserting expected message and actual message
    }

    }

