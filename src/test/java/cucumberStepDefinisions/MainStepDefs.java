package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MainStepDefs {

    @Then("temp is (.*)")
    public void check_temp(BigDecimal temp) {
        assertEquals("Wrong temp", temp, WeatherRequester.Response.main.temp);

    }

    @Then("pressure is (.*)")
    public void check_pressure(Integer pressure) {
        assertEquals("Wrong pressure", pressure, WeatherRequester.Response.main.pressure);
    }

    @Then("humidity is (.*)")
    public void check_humidity(Integer humidity) {
        assertEquals("Wrong humidity", humidity, WeatherRequester.Response.main.humidity);
    }

    @Then("temp_min is (.*)")
    public void check_temp_min(BigDecimal temp_min) {
        assertEquals("Wrong temp_min", temp_min, WeatherRequester.Response.main.temp_min);
    }

    @Then("temp_max is (.*)")
    public void check_temp_max(BigDecimal temp_max) {
        assertEquals("Wrong temp_max", temp_max, WeatherRequester.Response.main.temp_max);
    }
}


