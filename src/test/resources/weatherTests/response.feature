Feature: Testing response information
  Scenario: Response information test
    When we getting weather from server
    Then base is stations
    And visibility is 10000
    And dt is 1485789600
    And response_id is 2643743
    And name is London
    And cod is 200