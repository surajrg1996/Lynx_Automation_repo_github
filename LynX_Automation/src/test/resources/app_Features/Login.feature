Feature: Login to Lynx

  Scenario: Login page UI validation
    Given User is on login page
    Then Verify Title
    And Verfiy Username field
    And Verify Password field
    And Verify forget password hyperlink
    And Verify Login button
    Then User should redirect to SSO Login
    And Verify SSO Email field
    And Verify SSO Password Field
    And Verify SSO forget password hyperlink
    And verify SSO Login button

  Scenario: Login to Lynx
    Given Redirect to Home Page
    Then Login to application
