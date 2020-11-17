package homeworkWeek10Nopcommerce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFailed extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
       openMyBrowser(baseUrl);

    }
    @After
    public void setUpClose () {
        closeMyBrowser();
    }

    @Test
    public void verifyInvalidCredentials() throws InterruptedException {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        Thread.sleep(2000);
    //String ExpectedMessage = "Welcome, Please Sign In!";
   // WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    //String ActualMessage = message.getText();
      //  Assert.assertEquals(ExpectedMessage, ActualMessage);

WebElement emailField = driver.findElement(By.id("Email"));
emailField.click();
emailField.sendKeys("amie265@gmail.com");

WebElement passwordField = driver.findElement(By.name("Password"));
passwordField.click();
passwordField.sendKeys("abcd123");

WebElement loginBtn = driver.findElement(By.xpath("//input[@value = 'Log in']"));
loginBtn.click();

WebElement errorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
String actualErrorMessage = errorMsg.getText();

String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
        "No customer account found";

Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }

}

