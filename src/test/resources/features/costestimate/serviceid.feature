Feature: When I create costEstimate, service id should not be null

  Scenario: Service id should not be null
    Given costEstimate details are finalised
    When I create costestimate with null service id
    Then failure message should be returned
    And  status code should be 400

  Scenario: Service id should not be null
    Given costEstimate details are finalised
    When I create costestimate with not null  service id
    Then success message should be returned
    And  status code should be 202
