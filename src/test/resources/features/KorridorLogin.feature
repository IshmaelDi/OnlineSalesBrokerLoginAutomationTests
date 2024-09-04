Feature: As a User I want to Validate Korridor Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched Korridor Platform
    When Driver Captures UserName and Password
    And Driver click LogIn
    And Driver switch to select company profile '<CompanyName>'
    And Driver click confirm button
    And Driver Read IMPORTANT NOTICE
    Then Driver click Ok button

    Examples:
      |CompanyName|
      |TEST COMPANY (PTY) LTD|