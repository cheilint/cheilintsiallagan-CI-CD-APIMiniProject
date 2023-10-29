Feature: Login

  As a user
  I want to see the homepage
  So that I can request to the api endpoints to login


  @TC.Login.1
  Scenario: POST - Login with valid data
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200 login

  @TC.Login.2
  Scenario: POST - Login with empty email
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg1
    Then I receive valid HTTP response code 400 login

  @TC.Login.3
  Scenario: POST - Login wrong password
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg2
    Then I receive valid HTTP response code 400 login

  @TC.Login.4
  Scenario: POST - Login with empty body parameter
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg3
    Then I receive valid HTTP response code 400 login

  @TC.Login.5
  Scenario: POST - Login wrong password
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg4
    Then I receive valid HTTP response code 400 login

