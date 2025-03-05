Feature: Booking

  Scenario Outline: Validate whether consumed message is stored in MongoDB or not
    When I sent <booking> message to the Kafka Topic
    Then the message is stored in mongoDB
    Examples:
      | booking  |
      | BASIC    |