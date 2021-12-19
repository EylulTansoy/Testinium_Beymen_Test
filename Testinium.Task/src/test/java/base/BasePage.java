package base;

import org.openqa.selenium.*;

import java.util.List;

public abstract class BasePage
{
    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElement(By by) {
        return driver.findElement(by);
    }

    protected List<WebElement> findElements(By by){
        return driver.findElements(by);
    }
    protected List<WebElement> findElements(WebElement element,By by){
        return element.findElements(by);
    }
    protected void click(By by)
    {
        findElement(by).click();
    }

    protected void writeTextToInputAndPressEnter(By by, String text)
    {
        findElement(by).clear();
        findElement(by).sendKeys(text);
        findElement(by).sendKeys(Keys.ENTER);
    }

    protected void scrollDown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
