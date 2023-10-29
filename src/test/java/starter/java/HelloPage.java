package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class HelloPage {
    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I set GET api endpoints hello")
    public String setGetApiEndpointHello() {
        return url + "hello";
    }

    @Step("I send GET HTTP request hello")
    public void sendGetHttpRequestHello() {
        SerenityRest.given().get(setGetApiEndpointHello());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void receiveValidHttp200Hello() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

