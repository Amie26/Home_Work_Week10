package homeworkWeek10Nopcommerce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JewelryClass extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser(baseUrl);
    }

    public void closeBrowser (){
        closeMyBrowser();
    }
    @Test
    public void testingJewelryLink () throws InterruptedException {
        WebElement jewelryLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        jewelryLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Jewelry";

        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
