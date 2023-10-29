Feature: Register

  As a user
  I want to create new account
  So that I can login

  @TC.Register.1
  Scenario: POST - Register with valid data
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 200 register

  @TC.Register.2
  Scenario: POST - Register without fullname
    Given I set POST api endpoints register
    When I send POST HTTP request registerNeg1
    Then I receive valid HTTP response code 400 register

  @TC.Register.3
  Scenario: POST - Register without email
    Given I set POST api endpoints register
    When I send POST HTTP request registerNeg2
    Then I receive valid HTTP response code 400 register

  @TC.Register.4
  Scenario: POST - Register without password
    Given I set POST api endpoints register
    When I send POST HTTP request registerNeg3
    Then I receive valid HTTP response code 400 register

  @TC.Register.5
  Scenario: POST - Register a new account by blank Email and Password field
    Given I set POST api endpoints register
    When I send POST HTTP request registerNeg4
    Then I receive valid HTTP response code 400 register

