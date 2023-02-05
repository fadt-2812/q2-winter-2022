package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    @Given("city ID is: {long}")
    public void set_city_id(long id) {

    }

    @When("we are requesting weather forecast")
    public void reguest_weather() {


    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params) {

    }

    @Then("timezone information is:")
    public void check_timezone(Map<String, String> params) {

    }

    @Then("current sun and temperature forecast data is:")
    public void check_sun(Map<String, String> params) {

    }

    @Then("current air and precipitation forecast data is:")
    public void check_air(Map<String, String> params) {

    }

    @Then("current weather group Nr.{int} data is:")
    public void check_weather_group(int index, Map<String, String > params) {

    }

    @Then("minute forecast weather data is:")
    public void check_minute(Map<String, String> params) {

    }

    @Then("hourly temperature forecast data is:")
    public void check_hourly_temperature(Map<String, String> params) {

    }

    @Then("hourly air and precipitation forecast data is:")
    public void check_hourly_air(Map<String, String> params) {

    }

    @Then("daily forecast sun and moon data is:")
    public void check_daily_sun(Map<String, String> params) {

    }

    @Then("daily temperature forecast data is:")
    public void check_daily_temperature(Map<String, String> params) {

    }

    @Then("daily human perception temperature forecast data is:")
    public void check_daily_feels_like(Map<String, String> params) {

    }

    @Then("daily atmospheric air forecast data is:")
    public void check_daily_atmospheric(Map<String, String> params) {

    }

    @Then("daily precipitation forecast data is:")
    public void check_daily_precipitation(Map<String, String> params) {

    }

    @Then("following alerts received:")
    public void check_alert(int index, Map<String, String > params) {

    }

    @Then("tags for an alert are:")
    public void check_tags(int index, List<String> tags>) {

    }

}

