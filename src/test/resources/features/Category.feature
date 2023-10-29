Feature: Categories

  As a user
  I want to create new category
  So that I can make more category


  @TC.CreateCategory.1
  Scenario: POST - Create a category
    Given I set POST api endpoints categories
    When I send POST HTTP request categories
    Then I receive valid HTTP response code 200 categories


    @TC.CategoryID.1
  Scenario: GET - Get categories by ID
    Given I set GET api endpoints categories
    When I send GET HTTP request categoriesID
    Then I receive valid HTTP response code 200 categories


    @TC.Category.1
  Scenario: GET - Get all categories
    Given I set GET api endpoints categories
    When I send GET HTTP request categories
    Then I receive valid HTTP response code 200 categories


    @TC.DeleteCategory.1
  Scenario: DEL - Delete a category with ID
    Given I set DEL api endpoints categories
    When I send DEL HTTP request categories
    Then I receive valid HTTP response code 200 categories

