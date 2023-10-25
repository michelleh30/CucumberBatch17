Feature: Login scenarios

  @Sprint1 @michelle @regression @test123
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    When user enter admin username and password
    And user clicks on login button
    Then user is successfully logged in
    #Then user closes the browser



