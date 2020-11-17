package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApparelClass extends BaseNopcommerce{

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
    public void testingApparelLink () throws InterruptedException {
        WebElement apparelLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        apparelLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Apparel";

        Assert.assertEquals(expectedMessage,actualMessage);

        WebElement shoesTest = driver.findElement(By.xpath("//body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
        String actualText =  shoesTest.getText();
        shoesTest.click();

        Thread.sleep(2000);

        WebElement shoesText = driver.findElement(By.xpath("//h1[contains(text(),'Shoes')]"));
        String actualTest = shoesText.getText();
        String expectedText = "Shoes";

        Assert.assertEquals(expectedText,actualText);


    }

}
