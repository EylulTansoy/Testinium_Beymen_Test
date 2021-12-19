package base;

import constants.Constants;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseSelenium
{
    protected static WebDriver driver;

    @BeforeClass
    public static void initSelenium()
    {
        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.navigate().to(Constants.Configuration.URL);
    }

    @AfterClass
    public static void downSelenium()
    {
        //driver.quit();
    }
}
