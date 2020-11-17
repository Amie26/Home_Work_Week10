package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DigitalDownloadsClass extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser (baseUrl);
    }
    @After
    public void closeBrowser(){
        closeMyBrowser();
    }
    @Test
    public void testingDigitalDownloadsLink () throws InterruptedException {
        WebElement digitalDownloadsLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        digitalDownloadsLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Digital downloads";

        Assert.assertEquals(expectedMessage,actualMessage);








    }




}
