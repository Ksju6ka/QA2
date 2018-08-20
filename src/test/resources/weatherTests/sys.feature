Feature: Testing sys information
  Scenario: Sys information test
    When we getting weather from server
    Then type is 1
    And sys_id is 5091
    And message is 0.0103
    And country is GB
    And sunrise is 1485762037
    And sunset is 1485794875




