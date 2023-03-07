@RegressionTestNG
Feature: Bookit Title Verification
  @Login
  Scenario: user logs in and the title is verified
    Given user opens Bookit application
    When user logs in as a teacher in qa1
    When user is on Bookit application home page
    Then title is "bookit"
  @Schedule
    Scenario: user checks my schedule
      Given user opens Bookit application
      When user logs in as a teacher in qa1
      When user is on Bookit application home page
      When user clicks on schedule, my
      Then user is My on schedule page