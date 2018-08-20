package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SysStepDefs {
    @Then("type is (.*)")
    public void check_type(Integer type) {
        assertEquals("Wrong type", type, WeatherRequester.Response.sys.type);

    }

    @Then("sys_id is (.*)")
    public void check_id(Integer id) {
        assertEquals("Wrong id", id, WeatherRequester.Response.sys.id);
    }

    @Then("message is (.*)")
    public void check_message(BigDecimal message) {
        assertEquals("Wrong message", message, WeatherRequester.Response.sys.message);
    }

    @Then("country is (.*)")
    public void check_country(String country) {
        assertEquals("Wrong country", country, WeatherRequester.Response.sys.country);
    }

    @Then("sunrise is (.*)")
    public void check_sunrise(Long sunrise) {
        assertEquals("Wrong sunrise", sunrise, WeatherRequester.Response.sys.sunrise);
    }

    @Then("sunset is (.*)")
    public void check_sunset(Long sunset) {
        assertEquals("Wrong sunset", sunset, WeatherRequester.Response.sys.sunset);
    }

}
