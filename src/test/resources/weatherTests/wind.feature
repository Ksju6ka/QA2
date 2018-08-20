Feature: Testing wind information
  Scenario: Wind information test
    When we getting weather from server
    Then speed is 4.1
    And deg is 80