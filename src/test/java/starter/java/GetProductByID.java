package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set a GET endpoints by ID 85551")
    public String setGetIDEndpoints() {
        return url + "products/85551";

    }

    @Step("I send HTTP GET to the request")
    public void getIDHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setGetIDEndpoints());

    }

    @Step("I receive valid HTTP response code 200 ID")
    public void IReceiveValidHTTPGetResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for single product details by ID 85551")
    public void validDataID() {
        restAssuredThat(response -> response.body("data.ID", equalTo(85551)));
    }

    //Negative
    @Step("I set a GET endpoints by ID -8")
    public String setGetIDEndpointsID() {
        return url + "products/-8";

    }


    @Step("I receive valid HTTP response code 500 ID")
    public void IReceiveValidHTTPGetResponse500() {
        restAssuredThat(response -> response.statusCode(500));
    }
}



