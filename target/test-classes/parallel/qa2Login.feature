@RegressionTestNG
Feature: login in qa2
@printmap
  Scenario: login as a different teacher from qa2
    Given user opens Bookit application
    When user logs in as a teacher in qa1
    When user is on Bookit application home page
    Then user prints each roomName from map