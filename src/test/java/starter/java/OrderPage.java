package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class OrderPage {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints order")
    public String setPostApiEndpointOrder() {
        return url + "orders";
    }

    @Step("I set GET api endpoints order")
    public String setGetApiEndpointOrder() {
        return url + "orders";
    }

    @Step("I set GET api endpoints order ID")
    public String setGetApiEndpointOrderID() {
        return url + "orders/12376";
    }



    @Step("I send POST HTTP request order")
    public void sendPostHTTPRequestOrder() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 85531);
        requestBody.put("quantity", 2);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkNoZWlsaW50IiwiRW1haWwiOiJsYWxhc3lhYTkyQG1haWwuY29tIn0.Zkv-EJSa4TYjdbRL7yr9xwa2y0cOy11pViLFYn50xbs").get(setGetApiEndpointOrder()).then().statusCode(200);
    }


    @Step("I send GET HTTP request order")
    public void sendGetHttpRequestOrder() {
        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkNoZWlsaW50IiwiRW1haWwiOiJsYWxhc3lhYTkyQG1haWwuY29tIn0.Zkv-EJSa4TYjdbRL7yr9xwa2y0cOy11pViLFYn50xbs").get(setGetApiEndpointOrder()).then().statusCode(200);
    }

    @Step("I send GET HTTP request order2")
    public void sendGetHttpRequestOrder2() {
        SerenityRest.given().get(setGetApiEndpointOrder());
    }

    @Step("Then I receive valid HTTP response code 401 order")
    public void receiveValidHttp401Order() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        restAssuredThat(response -> response.statusCode(200));
    }
}