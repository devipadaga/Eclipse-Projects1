Feature: feature to test Google search functionality

  Scenario: Validate Google Search is working
    Given browser is open
    And user is on google search page
    When user enter a text in search box
    And press enter
    Then user navigate to search results
