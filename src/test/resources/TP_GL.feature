Feature: test
  Scenario: S1
    When  ADD Function 1,2
    Then  ADD Function Test

  Scenario: S2
    When   FACT Function  1
    Then   FACT Function Test


  Scenario: S3
    When  PSO Function "<String>" "<String>"
    Then  PSO Function Test

  Scenario: S4
    When  ADD_BIN Function 1 ,2
    Then  ADD_BIN Function Test

  Scenario: S5
    When  MUL Function1 ,2
    Then  MUL Function Test