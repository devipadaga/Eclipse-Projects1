Feature: To book Flight in cleartrip

  Scenario: Book one way flight
    Given user browse to cleartrip
    And user is on search results
    And Select country as India
    When user clicks one way radio button
    And Selects from station and To Station
    And select Daparture Date
    And Selects No of adults and children
    And clicks on Search flights
    Then user gets list of Available Flights
    And user choose the appropriate airline within budget 5000
