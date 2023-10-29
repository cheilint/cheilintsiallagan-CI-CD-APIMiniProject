package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class RegisterPage {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "auth/register";
    }

    ///POSITIVE
    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "cheilintsiallagan1290@gmail.com");
        requestBody.put("password", "Taurus24680");
        requestBody.put("fullname", "cheilint");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        restAssuredThat(response -> response.statusCode(200));
    }


    ///NEGATIVE
    @Step("I send POST HTTP request registerNeg1")
    public void sendPostHttpRequestRegisterNeg1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lalasyaaa92@gmail.com");
        requestBody.put("password", "Taurus2468");
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }


    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I send POST HTTP request registerNeg2")
    public void sendPostHttpRequestRegisterNeg2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "Taurus2468");
        requestBody.put("fullname", "cheilint");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request registerNeg3")
    public void sendPostHttpRequestRegisterNeg3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lalasyaaaa92@gmail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "cheilint");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request registerNeg4")
    public void sendPostHttpRequestRegisterNeg4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");
        requestBody.put("fullname", "cheilint");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

}