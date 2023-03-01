@API
Feature: Get all campuses
  @campuses
  Scenario: list all available campuses
    Given user logged in to Bookit API as a teacher and user sends GET request to "/api/clusters/my"
    Then status is 200
    And contentType is "application/json"
    And id is 11235
    And name is "dark-side"
    And first element of nameArray is "kilimanjaro"
