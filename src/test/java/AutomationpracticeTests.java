import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutomationpracticeTests {
    private final String SITE_ADDRESS = "http://automationpractice.com/index.php";

    @Test
    public void CartTest() {
        final String color = "Orange";

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(SITE_ADDRESS);

        By menuXpath = By.xpath("//div[@id='block_top_menu']/ul/li/a[@title='Dresses']");
        WebElement menu = driver.findElement(menuXpath);
        Assert.assertNotNull("Menu item with name Dresses not found", menu);

        menu.click();

        String filterXpathText = String.format("//div[@id='layered_block_left']//label/a[text()='%s']", color);
        By filterXpath = By.xpath(filterXpathText);
        WebElement orangeCheckbox;

        for(int i = 0; i < 2; i++){
            orangeCheckbox = driver.findElement(filterXpath);
            Assert.assertNotNull(color + " checkbox not found", orangeCheckbox);

            orangeCheckbox.click();

            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layered_block_left")));
        }

        By productsXpath = By.xpath("//ul[@class='product_list grid row']/li");
        List<WebElement> items = driver.findElements(productsXpath);
        Assert.assertTrue("Product items not found", items != null && !items.isEmpty());

        By addToCartBtnXpath = By.xpath("//div[@class='right-block']//a/span[text()='Add to cart']");
        Actions actions = new Actions(driver);
        WebElement addToCartBtn;

        for(WebElement we: items){
            actions.moveToElement(we);
            addToCartBtn = we.findElement(addToCartBtnXpath);
            Assert.assertNotNull("Add to cart button not found", addToCartBtn);

            addToCartBtn.click();
        }

        int a = 1;
    }
}
