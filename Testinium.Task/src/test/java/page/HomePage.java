package page;

import base.BasePage;
import constants.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class HomePage extends BasePage
{
    private final static Logger logger = Logger.getLogger(String.valueOf(HomePage.class));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage checkHomePageTitle()
    {
        logger.info("Check home page title");
        String title = super.driver.getTitle();
        Assert.assertEquals(Constants.Helper.TITLE, title);
        logger.info("Home page title is equal");
        return this;
    }

    public HomePage checkCustomerButton()
    {
        logger.info("Check home page customer button");
        WebElement element = super.findElement(Constants.SeleniumBy.CUSTOMER);
        logger.info("Home page has customer button");
        return this;
    }

    public HomePage checkMyFavoritesButton()
    {
        logger.info("Check home page my favorites button");
        WebElement element = super.findElement(Constants.SeleniumBy.FAVORITE);
        logger.info("Home page has my favorites button");
        return this;
    }

    public HomePage checkBasketButton()
    {
        logger.info("Check home page basket button");
        WebElement element = super.findElement(Constants.SeleniumBy.BASKET);
        logger.info("Home page has basket button");
        return this;
    }

    public HomePage searchKeywordAndEnter() throws InterruptedException
    {
        logger.info("Enter a search 'pantolan'");
        super.writeTextToInputAndPressEnter(Constants.SeleniumBy.SEARCH_INPUT, "pantolan");
        Thread.sleep(4000);
        logger.info("Entered pantolan in search input");
        return this;
    }
}
