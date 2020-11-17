package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegistrationFunctionality extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openMyBrowser(baseUrl);
    }

    @After
    public void closeBrowser() {
        closeMyBrowser();
    }

    @Test

    public void RegisterFunctionalityUsingMandatoryField() throws InterruptedException {
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();

        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.click();
        firstName.sendKeys("anna1");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.click();
        lastName.sendKeys("jones");

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.click();
        Random num = new Random();
        int n1 = num.nextInt(500);
        email.sendKeys("anna123jones"+n1+"@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("anna456jones123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.click();
        confirmPassword.sendKeys("anna456jones123");

        WebElement regButton = driver.findElement(By.xpath("//input[@id='register-button']"));
        regButton.click();

        WebElement regMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = regMessage.getText();
        String expectedMessage = "Your registration completed";

        Assert.assertEquals(actualMessage, expectedMessage);


    }
}

