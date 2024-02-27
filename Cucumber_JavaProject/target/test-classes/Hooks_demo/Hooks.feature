Feature: check Login Functionality

	@smoke
  Scenario: 
    Given user is on Login Page
    When user enters username and password
    And clicks on LoginButton
    Then user navigates into thE Home Page

	@smoke
  Scenario: 
    Given user is on Login Page
    When user enters username and password
    And clicks on LoginButton
    Then user navigates into thE Home Page
