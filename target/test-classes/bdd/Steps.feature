Feature: Test feature

  Scenario Outline: Test scenario
    When I sent <booking> message to the Kafka Topic
    Then the message is stored in mongoDB
    Examples:
      | booking  |
      | BASIC    |