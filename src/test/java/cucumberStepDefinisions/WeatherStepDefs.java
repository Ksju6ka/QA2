package cucumberStepDefinisions;

import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

public class WeatherStepDefs {

    @Then("weather_id is (.*)")
    public void check_id(Integer id) {
        assertEquals("Wrong ID", id, WeatherRequester.Response.weather[0].id);
    }

    @Then("main is (.*)")
    public void check_main(String main) {
        assertEquals("Wrong main", main, WeatherRequester.Response.weather[0].main);
    }

    @Then("description is (.*)")
    public void check_descr(String descr) {
        assertEquals("Wrong description", descr, WeatherRequester.Response.weather[0].description);
    }

    @Then("icon is (.*)")
    public void check_icon(String icon) {
        assertEquals("Wrong icon", icon, WeatherRequester.Response.weather[0].icon);
    }
}
