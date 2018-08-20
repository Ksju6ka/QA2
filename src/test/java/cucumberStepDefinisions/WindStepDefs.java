package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WindStepDefs {
    @Then("speed is (.*)")
    public void check_speed(BigDecimal speed) {
        assertEquals("Wrong speed", speed, WeatherRequester.Response.wind.speed);

    }

    @Then("deg is (.*)")
    public void check_deg(Integer deg) {
        assertEquals("Wrong deg", deg, WeatherRequester.Response.wind.deg);

    }
}
