Feature: Home Page Feature

  Background: 
    Given user has already logged into Application
      | username | password |
      | demo     | demo123  |

  Scenario: Home Page Title
    Given user is on Home Page
    When user gets the title of the page
    Then title of the page should be "Login: Mercury Tours"

  Scenario: Filght Page
    Given user is on Home Page
    When user click on Link Flights
    And click on RadioButton
