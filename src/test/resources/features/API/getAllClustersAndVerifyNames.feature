@API
Feature: Get my cluster names
  @cluster
  Scenario Outline: API cluster POJO verification
    Given user logged in to Bookit API as a teacher
    When user sends GET request to "/api/clusters/my"
    Then status code should be 200
    And content type is "application/json"
    And cluster name is "<namesFromCluster>"
    Examples:
    |namesFromCluster|
    |kilimanjaro     |
    |half dome       |
    |denali          |
    |meru            |
