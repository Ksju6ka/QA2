Feature: Testing weather info
  Scenario: Weather test
    When we getting weather from server
    Then weather_id is 300
    And main is Drizzle
    And description is light intensity drizzle
    And icon is 09d