import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.FoodPage;
import pages.HomePage;
import pages.RecipePage;

public class Homework1 {

    private final String HOME_PAGE = "http://rus.delfi.lv";
    private final String RECIPE_NAME = "Сочный свиной шашлык в быстром маринаде с лимонной кислотой";

    @Test
    public void Test(){
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.openPage(HOME_PAGE);
        homePage.clickFoodMenu();

        FoodPage foodPage = new FoodPage(driver);
        foodPage.openRecipe(RECIPE_NAME);

        RecipePage recipePage = new RecipePage(driver);
        recipePage.checkIngredients(RECIPE_NAME);
    }
}
