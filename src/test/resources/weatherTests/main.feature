Feature: Testing weather main information
  Scenario: Main coordinates test
    When we getting weather from server
    Then temp is 280.32
    And pressure is 1012
    And humidity is 81
    And temp_min is 279.15
    And temp_max is 281.15
