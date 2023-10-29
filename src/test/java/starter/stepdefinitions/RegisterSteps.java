package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Given("I set POST api endpoints register")
    public void setPostApiEndpointsRegister() {
        registerPage.setPostApiEndpointRegister();
    }

    @When("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        registerPage.sendPostHttpRequestRegister();
    }

    @Then("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        registerPage.receiveValidHttp200Register();
    }

    @When("I send POST HTTP request registerNeg1")
    public void sendPostHttpRequestRegisterNeg1() {
        registerPage.sendPostHttpRequestRegisterNeg1();
    }

    @When("I send POST HTTP request registerNeg2")
    public void sendPostHttpRequestRegisterNeg2() {
        registerPage.sendPostHttpRequestRegisterNeg2();
    }

    @When("I send POST HTTP request registerNeg3")
    public void sendPostHttpRequestRegisterNeg3() {
        registerPage.sendPostHttpRequestRegisterNeg3();
    }

    @When("I send POST HTTP request registerNeg4")
    public void sendPostHttpRequestRegisterNeg4() {
        registerPage.sendPostHttpRequestRegisterNeg4();
    }

    @Then("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        registerPage.receiveValidHttp400Register();
    }
}

