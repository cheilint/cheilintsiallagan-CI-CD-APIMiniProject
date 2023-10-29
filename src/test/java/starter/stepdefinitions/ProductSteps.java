package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.*;

public class ProductSteps {
    @Steps
    ProductPage productPage;

    @Steps
    GetAllProductPage getAllProductPage;

    @Steps
    GetProductByID getProductByID;

    @Steps
    DeleteProduct deleteProduct;

    @Steps
    GetProductRating getProductRating;

    @Steps
    ProductComments getProductComments;

    @Given("I set a GET endpoints")
    public void setGetEndpoints(){getAllProductPage.setGetEndpoints();}

    @Given("I set POST api endpoints product")
    public void setPostApiEndpointsProduct() {
        productPage.setPostApiEndpointProduct();
    }

    @Given("I set GET api endpoints product3")
    public void setGetApiEndpointsProduct3() {
        productPage.setGetApiEndpointProduct3();
    }

    @Given("I set a GET endpoints by ID 85525")
    public void setGetIDEndpoints(){getProductByID.setGetIDEndpoints();}

    @Given("I set a GET endpoints by ID -8")
    public void setGetIDEndpointsID(){getProductByID.setGetIDEndpointsID();}




    @When("I send HTTP GET request")
    public void getHttpRequest(){getAllProductPage.getHttpRequest();}

    @When("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        productPage.sendPostHttpRequestProduct();
    }
    @When("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        productPage.sendPostHttpRequestProduct2();
    }



    @Then("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200(){getAllProductPage.HttpResponse200();}

    @Then("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        productPage.receiveValidHttp200Product();
    }

    @Then("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        productPage.receiveValidHttp500Product();
    }


    @And("I received valid data for all product details")
    public void validData(){getAllProductPage.validData();}


    @When("I send HTTP GET to the request")
    public void getIDHTTPrequest(){getProductByID.getIDHttpRequest();}
    @Then("I receive valid HTTP response code 200 ID")
    public void IReceiveValidHTTPGetResponse200(){getProductByID.IReceiveValidHTTPGetResponse200();}
    @And("I received valid data for single product details by ID 85551")
    public void validDataID(){getProductByID.validDataID();}
    @Then("I receive valid HTTP response code 500 ID")
    public void IReceiveValidHTTPGetResponse500(){getProductByID.IReceiveValidHTTPGetResponse500();}


    @Given("I set DELETE api endpoints product")
    public void iSetDELETEApiEndpointsProduct() {
        deleteProduct.iSetDELETEApiEndpointsProduct();
    }
    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        deleteProduct.iSendDELETEHTTPRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        deleteProduct.iReceiveValidHTTPResponseCode();
    }


    @Given("I set a GET rating endpoints")
    public void setGetRatingEndpoints(){getProductRating.setGetRatingEndpoints();}
    @When("I send a HTTP GET to the request")
    public void HTTPGetRequest(){getProductRating.HTTPGetRequest();}
    @Then("I receive valid HTTP response code is 200 OK")
    public void HTTPResponse200(){getProductRating.HTTPResponse200();}
    @And("I received valid data for rating product")
    public void validDataRating(){getProductRating.validDataRating();}

    @Given("I set a GET comment endpoints")
    public void setValidCommentEndpoints(){getProductComments.setValidCommentEndpoints();}
    @When("I send a HTTP GET request for comment products")
    public void commentGetHTTPRequest(){getProductComments.commentGetHTTPRequest();}
    @Then("I receive valid comment HTTP response code is 200 OK")
    public void HTTPCommentResponse200(){getProductComments.HTTPCommentResponse200();}
    @And("I received valid data for comment products")
    public void validCommentData(){getProductComments.validCommentData();}


}