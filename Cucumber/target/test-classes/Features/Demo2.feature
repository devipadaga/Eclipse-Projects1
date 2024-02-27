Feature: Registration in Mercury Flights

  Background: 
    Given: I've a valid set of data and access


  #DataTable for UserDetails
  @Registration
  Scenario: Single user Registration Process
    When Registration Page Display
    Then Enter valid data
      | Username        | tutorial |
      | Password        | tutorial |
      | confirmPassword | tutorial |
    Then click on submit
    Then Click Signoff
    And Close
