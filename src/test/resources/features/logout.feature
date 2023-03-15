
@SEAMLES10-430 @wip
Feature: US-002 Log out Functionality Automation-AMH


  Background: user has logged in
    Given user is on the login-page
    When user enters valid email "Employee140" and password "Employee123"
    Then user clicks to login button

@SEAMLES10-427
  Scenario: User can log out and ends up in login page
    When  click to the profilePicture button on the right corner of the dashboard
    And click to logout button
    Then verify that user is on the login-page

@SEAMLES10-428
  Scenario: User can not go to home page again by clicking step back button after successfully logged out
    When  click to the profilePicture button on the right corner of the dashboard
    And click to logout button
    And verify that user is on the login-page
    And click to step back btn
    Then verify that user is on the login-page