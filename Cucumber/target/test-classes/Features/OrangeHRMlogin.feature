Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open and enters url
    And user  on login page
    When enters <username> and <password>
    Then user is on homepage

    Examples: 
      | username | password |
      | tutorial | tutorial |
