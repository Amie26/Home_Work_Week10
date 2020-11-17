package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BooksClass extends BaseNopcommerce{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser(baseUrl);
    }
    @After
    public void closeBrowser(){
        closeMyBrowser();
    }
    @Test
    public void testingBooksLink () throws InterruptedException {
        WebElement booksLink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        booksLink.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = message.getText();
        String expectedMessage = "Books";

        Assert.assertEquals(expectedMessage,actualMessage);


    }




}
