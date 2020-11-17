package homeworkWeek10Nopcommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerClass extends BaseNopcommerce{

   String baseUrl = "https://demo.nopcommerce.com/";

   @Before
    public void setUp () {
       openMyBrowser(baseUrl);
   }
       @After
       public void closeBrowser(){

       closeMyBrowser();
       }

       @Test
       public void testingComputerLink () throws InterruptedException {
           WebElement computerLink = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
           computerLink.click();

           Thread.sleep(2000);

           WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
           String actualMessage = message.getText();
           String expectedMessage = "Computers";

           Assert.assertEquals(expectedMessage,actualMessage);



       WebElement deskTest = driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]"));
       String actualText = deskTest.getText();
       deskTest.click();
       Thread.sleep(2000);
       WebElement deskText = driver.findElement(By.xpath("//h1[contains(text(),'Desktops')]"));
       String actualTest = deskText.getText();
       String expectedText = "Desktops";




       Assert.assertEquals(actualText,expectedText);

       }
   }





