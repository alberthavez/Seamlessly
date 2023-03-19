@SEAMLES10-429 @wip
Feature: US-001 Login Functionality Automation-AMH

  Background:
    Given user is on the login-page

  @SEAMLES10-415
  Scenario: User can login with valid credentials by clicking on login button
    When user clicks to email input box and enter email "Employee140"
    And user clicks to password input box and enter password "Employee123"
    And Click Login button
    Then verify that user is on the dashboard
  @SEAMLES10-416
  Scenario: User can login with valid credentials by hitting enter key
    When user clicks to email input box and enter email "Employee140"
    And user clicks to password input box and enter password "Employee123" and user hits enter from the keyboard
    Then verify that user is on the dashboard
@SEAMLES10-419
  Scenario: User can not login with any invalid credentials
    When Invalid username should be entered "invalidUserName"
    And Invalid password should be entered "invalidPassword"
    And Click Login button
    Then verify that -Wrong username or password.- message is displayed
@SEAMLES10-417
  Scenario: User can not login with invalid username and valid password
    When Invalid username should be entered "employee140"
    And Invalid password should be entered "Employee123"
    And Click Login button
    Then verify that -Wrong username or password.- message is displayed
@SEAMLES10-418
  Scenario: User can not login with valid username and invalid password
    When user clicks to email input box and enter email "Employee140"
    And Invalid password should be entered "employee123"
    And Click Login button
    Then verify that -Wrong username or password.- message is displayed
@SEAMLES10-420
  Scenario: Verify that user can not login with empty password and correct username
    When user clicks to email input box and enter email "Employee140"
    And Invalid password should be entered ""
    And Click Login button
    Then verify that -please fill out this field- message is displayed
@SEAMLES10-421
  Scenario: Verify that user can not login with empty username and correct password
    When Invalid username should be entered ""
    And user clicks to password input box and enter password "Employee123"
    And Click Login button
    Then verify that -please fill out this field- message is displayed on usernamebox
@SEAMLES10-422
  Scenario: User can not login with empty username and empty password
    When Invalid username should be entered ""
    And Invalid password should be entered ""
    And Click Login button
    Then verify that -please fill out this field- message is displayed
@SEAMLES10-423
  Scenario: User can see the password in a form of dots by default
    When user enters email "Employee140" and password "Employee123"
    Then password must be seen as dots
@SEAMLES10-424
  Scenario: User can see the password explicitly if needed
    When user enters email "Employee140" and password "Employee123"
    And click to the eye button
    Then user should see the password explicitly
@SEAMLES10-425
  Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset Password" button on the next page after clicking on forget password link
    When user click to forgot password link
    Then user must see Reset password button
@SEAMLES10-426
  Scenario: User can see valid placeholders on Username and Password fields
    When user must see valid place holders on Username
    Then user must see valid place holders on Password









