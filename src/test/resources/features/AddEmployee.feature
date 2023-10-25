Feature: add employee scenario

  Background:
    When user enter admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @addemp @test
  Scenario: Adding one employee in the hrms system
    #Given user is navigated to HRMS application
   # When user enter admin username and password
    #And user clicks on login button
    #Then user is successfully logged in
   # When user clicks on PIM option
    #And user clicks on add employee option
    When user enters firstName middleName and lastName
    And user clicks on save button
    Then employee added successfully
    #Then user closes the browser


  @cucumber
  Scenario: Adding one employee using feature file
    #When user enter admin username and password
   # And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
   # And user clicks on add employee option
    When user enters  "michelle" and "diana" and "hurtado"
    And user clicks on save button
    Then employee added successfully


    @ddt
    Scenario Outline: adding multiple employees from feature files
      When user enters  "<firstName>" and "<middleName>" and "<lastName>"
      And user clicks on save button
      Then employee added successfully
      Examples:
        | firstName | middleName | lastName |
        |Valentina  | Di        | Santos   |
        |Nelson     | An         | Gonzalez |
        | Ana       | Sand       | Lopez    |


  @excel
  Scenario: Adding multiple employees from excel file
    When user adds multiple employees from excel using "Sheet1" and verify them

  @datatable
  Scenario: adding multiple employees from data table
    When user adds multiple employees from data table
      | firstName | middleName | lastName |
      |Valentina1  | Di        | Santos   |
      |Nelson2    | An         | Gonzalez |
      | Michelle  | Sand       | Hurtado    |
