package test;

import base.BaseSelenium;
import org.junit.Before;
import org.junit.Test;
import page.BasketPage;
import page.HomePage;
import page.ProductListPage;
import page.ProductPage;

public class BeymentTest extends BaseSelenium
{
    HomePage homePage;
    ProductListPage productListPage;
    ProductPage productPage;
    BasketPage basketPage;
    @Before
    public void before()
    {
        homePage = new HomePage(super.driver);
        productListPage = new ProductListPage(super.driver);
        productPage=new ProductPage(super.driver);
        basketPage=new BasketPage(super.driver);
    }

    @Test
    public void test() throws InterruptedException
    {
        homePage
                .checkHomePageTitle()
                .checkCustomerButton()
                .checkMyFavoritesButton()
                .checkBasketButton()
                .searchKeywordAndEnter();

        productListPage
                .scrollDownInPage()
                .clickShowMoreProducts()
                .selectAProductAndRouteToPage();

        productPage
                .selectASize()
                .findToProductPrice()
                .addToBasket()
                .clickToBasketButton();

        basketPage
                .productPriceInBasket()
                .incrementProduct()
                .checkProductTotalCount()
                .removeProduct()
                .emptyBasket();
    }
}
