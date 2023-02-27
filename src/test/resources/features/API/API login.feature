@API
Feature: API login verify
  Scenario: verify login with valid credentials
    Given user logged in to Bookit API as a teacher
    When user sends GET request to "/api/users/me"
    Then status code should be 200
    And content type is "application/json"
    And role is "teacher"