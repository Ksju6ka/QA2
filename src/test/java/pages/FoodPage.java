package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage extends BasePage {

    protected  final String XPATH = ".//main[@class=\"row row-main\"]//div//a[.//h1[normalize-space()=\"%s\"]]";

    public FoodPage(WebDriver driver){
        super(driver);
    }

    public void openRecipe(String recipeName){
        WebElement recipeLink = getRecipeLink(recipeName);
        Assert.assertNotNull("Recipe link not found", recipeLink);
        super.click(recipeLink);
    }

    public void checkIfRecipeExists(String recipeName, String url){
        WebElement recipeLink = getRecipeLink(recipeName);
        Assert.assertNotNull(String.format("Recipe link not found on ingredient '%s'", url), recipeLink);
    }

    private WebElement getRecipeLink(String recipeName){
        String xpathText = String.format(this.XPATH, recipeName);
        By recipeXpath = By.xpath(xpathText);
        WebElement recipeLink = super.getElement(recipeXpath);
        return recipeLink;
    }
}
