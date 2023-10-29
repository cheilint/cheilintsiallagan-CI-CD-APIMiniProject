package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;



public class InformationPage {

    protected String url = "https://altashop-api.fly.dev/api/";
    protected String token;

    public InformationPage() {
    }

    public InformationPage(String token) {
        this.token = token;
    }

    @Step("I set GET api endpoints user Information")
    public String setGetApiEndpointUser() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP request user2 Information")
    public void sendGetHttpRequestUser2() {
        SerenityRest.given().get(setGetApiEndpointUser());
    }

    @Step("I receive valid HTTP response code 401 user")
    public void receiveValidHttp401User() {
        restAssuredThat(response -> response.statusCode(401));
    }
}