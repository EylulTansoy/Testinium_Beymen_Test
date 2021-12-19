package page;

import base.BasePage;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class ProductListPage extends BasePage {
    private final static Logger logger = Logger.getLogger(String.valueOf(ProductListPage.class));

    public ProductListPage(WebDriver driver) {
        super(driver);
    }
    public ProductListPage scrollDownInPage() throws InterruptedException {
        logger.info("Scroll down in page");
        super.scrollDown();
        Thread.sleep(7000);
        logger.info("Scroll downed in page");
        return this;
    }

    public ProductListPage clickShowMoreProducts() throws InterruptedException {
        logger.info("Click show more products button");
        super.click(Constants.SeleniumBy.SHOW_MORE);
        Thread.sleep(7000);
        logger.info("Clicked show more products button");
        return this;
    }
    public ProductListPage selectAProductAndRouteToPage(){
        logger.info("Select a product and route to page");
        List<WebElement> products = super.findElements(Constants.SeleniumBy.PRODUCT_ITEM_LIST);
        Random rand = new Random();
        WebElement product = products.get(rand.nextInt(products.size()));
        product.click();
        logger.info("Selected a product and route to page");
        return  this;
    }

}
