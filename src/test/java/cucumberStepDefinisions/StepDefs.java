package cucumberStepDefinisions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class StepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();

    @When("we getting weather from server")
    public void get_weather() {
        weatherRequester.getWeather();
    }

    @Then("all is (.*)")
    public void check_all(Integer all) {
        assertEquals("Wrong all", all, WeatherRequester.Response.clouds.all);

    }

    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon) {
        assertEquals("Wrong LON", lon, WeatherRequester.Response.coord.lon);
    }

    @Then("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        assertEquals("Wrong LAT", lat, WeatherRequester.Response.coord.lat);
    }

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

    @Then("weather_id is (.*)")
    public void check_weather_id(Integer id) {
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

    @Then("speed is (.*)")
    public void check_speed(BigDecimal speed) {
        assertEquals("Wrong speed", speed, WeatherRequester.Response.wind.speed);

    }

    @Then("deg is (.*)")
    public void check_deg(Integer deg) {
        assertEquals("Wrong deg", deg, WeatherRequester.Response.wind.deg);

    }

}