Feature: Korridor Log In Page.

  Scenario Outline: Korridor User Credentials
    Given User logs in with valid Credentials
    When User Captures '<UserName>' and '<Password>'
    Then User Click LogIn Button

    Examples:
      | UserName | Password     |
      | Ncane    | qpPcAK7x |