package cucumberStepDefinisions;
import cucumber.api.java.en.When;

public class StepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();

    @When("we getting weather from server")
    public void get_weather() {
        weatherRequester.getWeather();
    }
}