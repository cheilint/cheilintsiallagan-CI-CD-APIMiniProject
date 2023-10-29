Feature: Hello

  As a user
  I want to get hello
  So that I can see hello

  @TC.Index.1
  Scenario: GET - Get hello
    Given I set GET api endpoints hello
    When I send GET HTTP request hello
    Then I receive valid HTTP response code 200 OK