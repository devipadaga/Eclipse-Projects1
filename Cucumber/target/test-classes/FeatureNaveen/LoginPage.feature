Feature: Login Page Feature

  Scenario: Login Page title
    Given user is on Login Page
    When user gets the title of the Page
    Then page title should be "Welcome: Mercury Tours"

  Scenario: Forgot Password Link
    Given user is on Login Page
    Then link should be displayed

  Scenario: Login with correct credentials
    Given user is on Login Page
    When user enters username "demo"
    And user enters password "demo123"
    And user clicks on Submit Button
    Then user gets the title of the Page
    And page title should be "Login: Mercury Tours"
