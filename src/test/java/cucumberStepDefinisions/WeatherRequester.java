package cucumberStepDefinisions;

import model.Response;
import org.springframework.web.client.RestTemplate;

public class WeatherRequester {
    private final String URL = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

    public static Response Response;

    public void getWeather() {
        RestTemplate restTemplate = new RestTemplate();
        Response = restTemplate.getForEntity(URL, Response.class).getBody();
    }
}
