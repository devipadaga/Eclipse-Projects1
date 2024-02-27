Feature: Verify HomePage Functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And user clicks enter
    Then user navigates to HomePage

  Scenario: Check Logout Link
    
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: Verify Quick Launch Toolbar is present
 
    When user clicks on DashBoard Link
    Then quick launch toolbar is displayed
