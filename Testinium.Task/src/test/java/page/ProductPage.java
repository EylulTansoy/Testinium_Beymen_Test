package page;

import base.BasePage;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class ProductPage extends BasePage {
    private final static Logger logger = Logger.getLogger(String.valueOf(ProductPage.class));

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage selectASize() {
        logger.info("Select a size and add to basket");
        WebElement sizesContainer = super.findElement(Constants.SeleniumBy.PRODUCT_SIZE_CONTAINER);
        List<WebElement> sizes = super.findElements(sizesContainer, Constants.SeleniumBy.PRODUCT_SIZE_LIST);
        List<WebElement> hasSizes = new ArrayList<WebElement>();
        for (WebElement size : sizes) {
            boolean isDisabled = size.getAttribute("class").contains("disabled");
            if (!isDisabled) {
                hasSizes.add(size);
            }
        }
        Random rand = new Random();
        WebElement product = hasSizes.get(rand.nextInt(hasSizes.size()));
        product.click();

        logger.info("Selected a size and added to basket");
        return this;
    }

    public ProductPage findToProductPrice() {
        logger.info("find to product price");
        WebElement priceElement = super.findElement(Constants.SeleniumBy.PRODUCT_PRICE);
        Constants.Helper.PRODUCT_PRICE = priceElement.getText();
        logger.info("found to product price");
        return this;
    }

    public ProductPage addToBasket() {
        logger.info("Add to basket");
        super.click(Constants.SeleniumBy.ADD_TO_BASKET);
        logger.info("Added to basket");
        return this;
    }

    public ProductPage clickToBasketButton() throws InterruptedException {
        logger.info("click to basket button");
        super.click(Constants.SeleniumBy.BASKET);
        Thread.sleep(4000);

        logger.info("click to basket button");
        return this;
    }
}