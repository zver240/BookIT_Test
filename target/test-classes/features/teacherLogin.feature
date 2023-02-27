@Regression
Feature: Teacher login
  @qa1 @qa2
  Scenario: Using teacher credentials, log in into the bookIt application
    Given user navigates to bookIt application
    When user logs in
    Then user is on bookIt home page