Feature: Product

  As a user
  I want to see the product on store
  So that I can make see product list

  @TC.AllProduct.1
  Scenario: Get all products
    Given I set a GET endpoints
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200 OK
    And I received valid data for all product details

  @TC.CreateProduct.1
  Scenario: POST - Add new product product
    Given I set POST api endpoints product
    When I send POST HTTP request product
    Then I receive valid HTTP response code 200 product

  @TC.CreateProduct.2
  Scenario: POST - Add new product without fill name
    Given I set POST api endpoints product
    When I send POST HTTP request product2
    Then I receive valid HTTP response code 500 product

  @TC.ProductID.1
  Scenario: Get product by ID
    Given I set a GET endpoints by ID 85525
    When I send HTTP GET to the request
    Then I receive valid HTTP response code 200 ID
    And I received valid data for single product details by ID 85551

@TC.ProductID.2
  Scenario: Get product by invalid ID
    Given I set a GET endpoints by ID -8
    When I send HTTP GET to the request
    Then I receive valid HTTP response code 200 ID

@TC.DelProduct.1
  Scenario: DELETE - DELETE Product
    Given I set DELETE api endpoints product
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

@TC.ProductRat.1
  Scenario: Get product ratings
    Given I set a GET rating endpoints
    When I send a HTTP GET to the request
    Then I receive valid HTTP response code is 200 OK
    And I received valid data for rating product

  @TC.Comment.1
  Scenario: Get product comments
    Given I set a GET comment endpoints
    When I send a HTTP GET request for comment products
    Then I receive valid comment HTTP response code is 200 OK
    And I received valid data for comment products


