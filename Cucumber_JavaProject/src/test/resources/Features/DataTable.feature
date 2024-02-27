Feature: Login Action

  #DataTable for UserDetails
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | userName | passWord |
      | Admin    | admin123 |
      | XYZ      | xyz123   |
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully
