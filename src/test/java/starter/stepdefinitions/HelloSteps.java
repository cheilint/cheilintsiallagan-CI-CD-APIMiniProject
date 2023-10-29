package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.HelloPage;

public class HelloSteps {

    @Steps
    HelloPage helloPage;

    @Given("I set GET api endpoints hello")
    public void setGetApiEndpointHello() {
        helloPage.setGetApiEndpointHello();
    }

    @When("I send GET HTTP request hello")
    public void sendGetHttpRequestHello() {
        helloPage.sendGetHttpRequestHello();
    }

    @Then("I receive valid HTTP response code 200 OK")
    public void receiveValidHttp200Rating() {
        helloPage.receiveValidHttp200Hello();
    }
}
