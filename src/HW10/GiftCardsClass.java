package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardsClass extends BaseNopcommerce{

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
    public void testingGiftCardsLink () throws InterruptedException {
        WebElement giftCardsLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        giftCardsLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Gift Cards";

        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
