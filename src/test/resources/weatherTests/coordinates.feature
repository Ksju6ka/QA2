Feature: Testing coordinates for weather
  Scenario: Coordinates test
    When we getting weather from server
    Then lon is -0.13
    And lat is 51.51

  Scenario: Clouds information test
    When we getting weather from server
    Then all is 90

  Scenario: Main coordinates test
    When we getting weather from server
    Then temp is 280.32
    And pressure is 1012
    And humidity is 81
    And temp_min is 279.15
    And temp_max is 281.15

  Scenario: Response information test
    When we getting weather from server
    Then base is stations
    And visibility is 10000
    And dt is 1485789600
    And response_id is 2643743
    And name is London
    And cod is 200

  Scenario: Sys information test
    When we getting weather from server
    Then type is 1
    And sys_id is 5091
    And message is 0.0103
    And country is GB
    And sunrise is 1485762037
    And sunset is 1485794875

  Scenario: Weather test
    When we getting weather from server
    Then weather_id is 300
    And main is Drizzle
    And description is light intensity drizzle
    And icon is 09d

  Scenario: Wind information test
    When we getting weather from server
    Then speed is 4.1
    And deg is 80