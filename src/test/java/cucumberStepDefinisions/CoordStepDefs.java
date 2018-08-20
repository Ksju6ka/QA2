package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CoordStepDefs {

    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon) {
        assertEquals("Wrong LON", lon, WeatherRequester.Response.coord.lon);
    }

    @Then("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        assertEquals("Wrong LAT", lat, WeatherRequester.Response.coord.lat);
    }
}
