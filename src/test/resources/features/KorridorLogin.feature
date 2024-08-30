Feature: Korridor Platform Log In Page.

  Scenario Outline: Korridor User Credentials
    Given User logs in with valid Credentials
    When User Captures '<UserName>' and '<Password>'
    And User Click LogIn Button
#    And There will be a pop window for company profile selction
#    And Click to select '<Company Name>' from drop down list
#    Then Click Confirm Button

    Examples:
      | UserName | Password |Company Name|
      | Ncane    | qpPcAK7x |TEST COMPANY (PTY) LTD|