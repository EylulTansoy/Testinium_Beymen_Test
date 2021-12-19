package constants;

import org.openqa.selenium.By;

public class Constants
{
    public class Configuration
    {
        public static final String URL = "https://www.beymen.com";
    }

    public class Helper
    {
        public static final String TITLE = "Beymen.com – Lifestyle Destination";
        public static String PRODUCT_PRICE;

    }

    public class SeleniumBy
    {
        public static final By CUSTOMER = By.xpath("//a[@title='Hesabım']");
        public static final By FAVORITE = By.xpath("//a[@title='Favorilerim']");
        public static final By BASKET = By.xpath("//a[@title='Sepetim']");
        public static final By SEARCH_INPUT = By.xpath("//input[@placeholder='Ürün, Marka Arayın']");
        public static final By SHOW_MORE = By.id("moreContentButton");
        public static final By PRODUCT_ITEM_LIST = By.className("o-productList__itemWrapper");
        public static final By PRODUCT_SIZE_CONTAINER = By.id("sizes");
        public static final By PRODUCT_SIZE_LIST = By.className("m-variation__item");
        public static final By ADD_TO_BASKET = By.id("addBasket");
        public static final By PRODUCT_PRICE = By.id("priceNew");
        public static final By PRODUCT_PRICE_IN_BASKET = By.className("m-productPrice__salePrice");
        public static final By PRODUCT_TOTAL_SELECT = By.id("quantitySelect0");
        public static final By BASKET_REMOVE = By.id("removeCartItemBtn0");
        public static final By EMPTY_BASKET = By.id("emtyCart");
    }
}
