Feature: Login feature for cleartrip

  #DataTable for UserDetails
  Scenario: Successful Login
    Given User is on Home Page
    When User clicks on Login Button
    And User enters Email and Password
      | Email                     | passWord     |
      | Chandamamakajal@gmail.com | Chandamama1@ |
    And clicks Login Button
    And user clicks Not now Button
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User clicks My account
    And clicks Sign out
    Then user come back to Home Page
