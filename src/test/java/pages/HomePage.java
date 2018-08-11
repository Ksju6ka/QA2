package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final By FOOD_MENU_LINK = By.xpath(".//nav[@class=\"headerMainNavigation headerSeparatedNav\"]/a[span[text() = \"Еда\"]]");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickFoodMenu(){
        WebElement link = super.getElement(FOOD_MENU_LINK);
        Assert.assertNotNull("Food menu link not found", link);
        super.click(link);
    }
}
