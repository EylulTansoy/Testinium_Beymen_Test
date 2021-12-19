package page;

import base.BasePage;
import constants.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.print.DocFlavor;
import java.util.logging.Logger;

public class BasketPage extends BasePage
{
    private final static Logger logger = Logger.getLogger(String.valueOf(BasketPage.class));

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage productPriceInBasket()
    {
        logger.info("Add to basket");
        WebElement productPrice = super.findElement(Constants.SeleniumBy.PRODUCT_PRICE_IN_BASKET);
        String price = productPrice.getText();
        Assert.assertEquals(Constants.Helper.PRODUCT_PRICE, price);
        logger.info("Added to basket");
        return this;
    }

    public BasketPage incrementProduct() throws InterruptedException
    {
        logger.info("incrementProduct");
        WebElement totalSelectElement = super.findElement(Constants.SeleniumBy.PRODUCT_TOTAL_SELECT);
        Select totalProduct = new Select(totalSelectElement);
        totalProduct.selectByValue("2");
        Thread.sleep(4000);
        logger.info("incrementProduct");
        return this;
    }

    public BasketPage checkProductTotalCount()
    {
        logger.info("checkProductTotalCount");

        WebElement productPrice = super.findElement(Constants.SeleniumBy.PRODUCT_PRICE_IN_BASKET);
        String price = productPrice.getText();

        Assert.assertFalse(Constants.Helper.PRODUCT_PRICE.equals(price));
        logger.info("checkProductTotalCount");
        return this;
    }

    public BasketPage removeProduct() throws InterruptedException
    {
        logger.info("removeProduct");
        super.click(Constants.SeleniumBy.BASKET_REMOVE);
        Thread.sleep(4000);
        logger.info("removeProduct");
        return this;
    }

    public BasketPage emptyBasket()
    {
        logger.info("removeProduct");
        super.findElement(Constants.SeleniumBy.EMPTY_BASKET);
        logger.info("removeProduct");
        return this;
    }
}
