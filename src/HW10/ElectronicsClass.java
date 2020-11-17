package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;

public class ElectronicsClass extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser(baseUrl);
    }

    @After
    public void closeBrowser (){
        closeMyBrowser();
    }

    @Test
    public void testingElectronicsLink () throws InterruptedException {
        WebElement electronicsLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        electronicsLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Electronics";

        Assert.assertEquals(expectedMessage,actualMessage);

        WebElement cameraTest = driver.findElement(By.xpath("//body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
        String actualText = cameraTest.getText();
        cameraTest.click();

        Thread.sleep(2000);

        WebElement cameraText = driver.findElement(By.xpath("//h1[contains(text(),'Camera & photo')]"));
        String actualTest = cameraText.getText();
        String expectedText = "Camera & photo";

        Assert.assertEquals(actualText,expectedText);

    }

}
