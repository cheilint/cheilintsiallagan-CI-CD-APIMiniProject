package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProductPage {
    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I set POST api endpoints product")
    public String setPostApiEndpointProduct() {
        return url + "products";
    }


    @Step("I set GET api endpoints product3")
    public String setGetApiEndpointProduct3() {
        return url + "products/-8";
    }

    ///POSITIFFF
    @Step("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "XBOX1");
        requestBody.put("description", "For gaming");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointProduct());
    }

    ///NEGATIFFF
    @Step("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("description", "For gaming");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointProduct());
    }


    @Step("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        restAssuredThat(response -> response.statusCode(500));
    }


}