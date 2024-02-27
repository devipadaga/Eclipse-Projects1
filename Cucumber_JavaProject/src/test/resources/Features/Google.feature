Feature: feature to test GoogleSearch

  Scenario: Validate google search is working
    Given browser is open
    And user is on search page
    When user enters the text
    And clicks enter
    Then user navigates to the search results page
