import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiTest {
    private final String ARTICLE = "Буффон, Мхитарян, Златан... Звезды, которых мы не увидим на ЧМ-2018 в России";
    private final String HOME_PAGE = "http://www.rus.delfi.lv";
    private final By ARTICLE_ELEMENTS = By.cssSelector("a.top2012-title,a.article-title");

    public DelfiTest() {
    }

    @Test
    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(HOME_PAGE);

        List<WebElement> elements = driver.findElements(ARTICLE_ELEMENTS);
        WebElement articleElement = null;

        for(WebElement we: elements){
            String x = we.getText();
            if(x.equals(ARTICLE)){
                articleElement = we;
                break;
            }
        }

        Assert.assertNotNull(articleElement);
    }
}
