package homeworkWeek10Nopcommerce;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseNopcommerce {
    public WebDriver driver;

public void openMyBrowser (String baseUrl){
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NONE);
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(baseUrl);

}

public void closeMyBrowser() {

  //  driver.quit();
    }

}
