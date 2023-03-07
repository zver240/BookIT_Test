@API
Feature: Show all graduates
  @graduates
  Scenario: print names of graduates
    Given user logged in to Bookit API as a teacher
    When user sends GET request to "/api/batches"
    Then status code should be 200
    And content type is "application/json"
    And all graduate names are displayed