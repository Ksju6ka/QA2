package cucumberStepDefinisions;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class ResponseStepDefs {

    @Then("base is (.*)")
    public void check_base(String base) {
        assertEquals("Wrong base", base, WeatherRequester.Response.base);

    }

    @Then("visibility is (.*)")
    public void check_visibility(Integer visibility) {
        assertEquals("Wrong visibility", visibility, WeatherRequester.Response.visibility);
    }

    @Then("dt is (.*)")
    public void check_dt(Long dt) {
        assertEquals("Wrong dt", dt, WeatherRequester.Response.dt);
    }

    @Then("response_id is (.*)")
    public void check_response_id(Integer id) {
        assertEquals("Wrong id",id, WeatherRequester.Response.id);
    }

    @Then("name is (.*)")
    public void check_name(String name) {
        assertEquals("Wrong name", name, WeatherRequester.Response.name);
    }

    @Then("cod is (.*)")
    public void check_cod(Integer cod) {
        assertEquals("Wrong cod", cod, WeatherRequester.Response.cod);
    }
}
