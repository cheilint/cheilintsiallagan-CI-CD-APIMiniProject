Feature: User Information

  As a user
  I want to see user information
  So that I can see user information


@TC.Info.1
  Scenario: GET - Get user information without token
    Given I set GET api endpoints user Information
    When I send GET HTTP request user2 Information
    Then I receive valid HTTP response code 401 user
