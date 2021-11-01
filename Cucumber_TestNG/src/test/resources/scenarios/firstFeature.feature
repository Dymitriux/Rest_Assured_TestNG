Feature: First test feature

  Scenario: First test scenario

    Given user connect to "people" endpoint
    And user execute GET for id 5
    Then user log response result
