Feature: Amazon search

  @tag1
  Scenario: Amazon search using inline data
    Given user launches the browser
    And user navigates to amazon website
    When user searches "iphone 14" and clicks SearchBar
    Then user navigates to SearchResults

  @tag2
  Scenario Outline: Amazon search
    Given user launches the browser
    And user navigates to amazon website
    When user searches "<list>" and clicks SearchBar
    Then user navigates to SearchResults

    Examples: 
      | list      |
      | iphone 14 |
      | apple     |
