package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CloudsStepDefs {
    @Then("all is (.*)")
    public void check_all(Integer all) {
        assertEquals("Wrong all", all, WeatherRequester.Response.clouds.all);

    }
}
