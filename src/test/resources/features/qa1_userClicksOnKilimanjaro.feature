@Regression
Feature: kilimanjaro click
  @qa1
  Scenario: user clicks on kilimanjaro link
    Given user navigates to bookIt application
    And user logs in
    And user is on bookIt home page
    And user clicks on kilimanjaro link
    Then user navigates to schedule kilimanjaro page