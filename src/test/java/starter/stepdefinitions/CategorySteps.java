package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.CategoryPage;

public class CategorySteps {

    @Steps
    CategoryPage categoryPage;

    @Given("I set POST api endpoints categories")
    public void setPostApiEndpointsf() {
        categoryPage.setPostApiEndpointCategories();
    }

    @Given("I set GET api endpoints categories")
    public void setGetApiEndpoints() {
        categoryPage.setGetApiEndpointCategories();
    }

    @Given("I set DEL api endpoints categories")
    public void setDelApiEndpoints() {
        categoryPage.setDelApiEndpointCategories();
    }


    @When("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        categoryPage.sendPostHttpRequestCategories();
    }

    @When("I send GET HTTP request categories")
    public void sentGetHttpRequestCategories() {
        categoryPage.sendGetHttpRequestCategories();
    }

    @When("I send GET HTTP request categoriesID")
    public void sendGetHttpRequestCategoriesID() {
        categoryPage.sendGetHttpRequestCategoriesID();
    }

    @When("I send DEL HTTP request categories")
    public void sendDelHttpRequestCategoriesDel() {
        categoryPage.sendDelHttpRequestCategories();
    }


    @Then("I receive valid HTTP response code 200 categories")
    public void receiveValidHttp200Categories() {
        categoryPage.receiveValidHttp200Categories();
    }





}
