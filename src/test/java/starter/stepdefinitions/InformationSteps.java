package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.InformationPage;

public class InformationSteps {


    @Steps
    InformationPage user = new InformationPage();

    @Given("I set GET api endpoints user Information")
    public void setGetApiEndpointsUser() {
        user.setGetApiEndpointUser();
    }

    @Given("I have valid token {string}")
    public void haveValidToken(String token) {
        user = new InformationPage(token);
    }


    @When("I send GET HTTP request user2 Information")
    public void sendGetHttpRequestUser2() {
        user.sendGetHttpRequestUser2();
    }

    @Then("I receive valid HTTP response code 401 user")
    public void receiveValidHttp401User() {
        user.receiveValidHttp401User();
    }
}

