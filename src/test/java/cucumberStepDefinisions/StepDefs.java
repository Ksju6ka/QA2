package cucumberStepDefinisions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class StepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();

    private Response response;

    @When("we getting weather from server")
    public void get_weather() {
        if(response != null)
        {
            return;
        }
        response = weatherRequester.getWeather();
    }

    @Then("all is (.*)")
    public void check_all(Integer all) {
        assertEquals("Wrong all", all, response.clouds.all);

    }

    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon) {
        assertEquals("Wrong LON", lon, response.coord.lon);
    }

    @Then("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        assertEquals("Wrong LAT", lat,response.coord.lat);
    }

    @Then("temp is (.*)")
    public void check_temp(BigDecimal temp) {
        assertEquals("Wrong temp", temp, response.main.temp);

    }

    @Then("pressure is (.*)")
    public void check_pressure(Integer pressure) {
        assertEquals("Wrong pressure", pressure, response.main.pressure);
    }

    @Then("humidity is (.*)")
    public void check_humidity(Integer humidity) {
        assertEquals("Wrong humidity", humidity, response.main.humidity);
    }

    @Then("temp_min is (.*)")
    public void check_temp_min(BigDecimal temp_min) {
        assertEquals("Wrong temp_min", temp_min, response.main.temp_min);
    }

    @Then("temp_max is (.*)")
    public void check_temp_max(BigDecimal temp_max) {
        assertEquals("Wrong temp_max", temp_max, response.main.temp_max);
    }

    @Then("base is (.*)")
    public void check_base(String base) {
        assertEquals("Wrong base", base, response.base);

    }

    @Then("visibility is (.*)")
    public void check_visibility(Integer visibility) {
        assertEquals("Wrong visibility", visibility, response.visibility);
    }

    @Then("dt is (.*)")
    public void check_dt(Long dt) {
        assertEquals("Wrong dt", dt, response.dt);
    }

    @Then("response_id is (.*)")
    public void check_response_id(Integer id) {
        assertEquals("Wrong id",id, response.id);
    }

    @Then("name is (.*)")
    public void check_name(String name) {
        assertEquals("Wrong name", name, response.name);
    }

    @Then("cod is (.*)")
    public void check_cod(Integer cod) {
        assertEquals("Wrong cod", cod, response.cod);
    }


    @Then("type is (.*)")
    public void check_type(Integer type) {
        assertEquals("Wrong type", type, response.sys.type);

    }

    @Then("sys_id is (.*)")
    public void check_id(Integer id) {
        assertEquals("Wrong id", id, response.sys.id);
    }

    @Then("message is (.*)")
    public void check_message(BigDecimal message) {
        assertEquals("Wrong message", message, response.sys.message);
    }

    @Then("country is (.*)")
    public void check_country(String country) {
        assertEquals("Wrong country", country, response.sys.country);
    }

    @Then("sunrise is (.*)")
    public void check_sunrise(Long sunrise) {
        assertEquals("Wrong sunrise", sunrise, response.sys.sunrise);
    }

    @Then("sunset is (.*)")
    public void check_sunset(Long sunset) {
        assertEquals("Wrong sunset", sunset, response.sys.sunset);
    }

    @Then("weather_id is (.*)")
    public void check_weather_id(Integer id) {
        assertEquals("Wrong ID", id, response.weather[0].id);
    }

    @Then("main is (.*)")
    public void check_main(String main) {
        assertEquals("Wrong main", main, response.weather[0].main);
    }

    @Then("description is (.*)")
    public void check_descr(String descr) {
        assertEquals("Wrong description", descr, response.weather[0].description);
    }

    @Then("icon is (.*)")
    public void check_icon(String icon) {
        assertEquals("Wrong icon", icon, response.weather[0].icon);
    }

    @Then("speed is (.*)")
    public void check_speed(BigDecimal speed) {
        assertEquals("Wrong speed", speed, response.wind.speed);

    }

    @Then("deg is (.*)")
    public void check_deg(Integer deg) {
        assertEquals("Wrong deg", deg, response.wind.deg);

    }

}