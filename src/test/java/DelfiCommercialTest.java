import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DelfiCommercialTest {
    private final String SITE_ADDRESS = "http://rus.delfi.lv/";
    private final By COMMERCIAL_BLOCK = By.name("adoContainer_pjpoiqnovrwpoxkiqtimujir");

    @Test
    public void delfiComercialTest(){



        System.setProperty("webdriver.gecko.driver", "c:/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(SITE_ADDRESS);


        List<WebElement> listOfElements = new ArrayList<WebElement>();
        listOfElements = driver.findElements(COMMERCIAL_BLOCK);
        Assert.assertTrue("No Commercial Found", !listOfElements.isEmpty());

    }
  //
}
