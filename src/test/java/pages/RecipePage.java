package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RecipePage extends FoodPage {
    private final By INGREDIENTS_XPATH = By.xpath(".//div[@class=\"ingredients elevated\"]//div[@class=\"ing-list-item\"]/a");

    public RecipePage(WebDriver driver) {
        super(driver);
    }

    public void checkIngredients(String recipeName){
        List<WebElement> ingredients = super.getElements(INGREDIENTS_XPATH);
        List<String> hrefs = new ArrayList<String>();

        for (WebElement we : ingredients){
            hrefs.add(we.getAttribute("href"));
        }

        boolean checkResult;
        for(String h : hrefs) {
            super.openPage(h);
            super.checkIfRecipeExists(recipeName, h);
        }
    }
}
