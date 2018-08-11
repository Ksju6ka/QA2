package pages;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        if (!url.contains("http://")&& !url.contains("https://")){

            url = "http://" + url;
        }

        try{
            driver.get(url);
        }
        catch (Exception e){
            Assert.fail(String.format("Address '%s' is not found", url));
        }
    }

    public List<WebElement> getElements(By locator) {
        Assert.assertFalse("No elements found", driver.findElements(locator).isEmpty());
        return driver.findElements(locator);
    }

    public WebElement getElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public void click(WebElement element){
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        String href = element.getAttribute("href");

        Assert.assertTrue("href attribute is empty",href != null && href != "");

        openPage(href);
    }
}