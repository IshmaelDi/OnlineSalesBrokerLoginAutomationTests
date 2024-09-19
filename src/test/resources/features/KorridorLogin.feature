Feature: As a User I want to Validate Korridor Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched Korridor Platform
    When Driver Captures UserName and Password
    And Driver click LogIn
    And Driver switch to select company profile '<CompanyName>'
    And Driver click confirm button
    And Driver Read IMPORTANT NOTICE
    And Driver click Ok button

    # Dash Board navigation
    And Driver click New Once off Order Button
    And Select '<Driver>', '<Truck>, '<Trailer Reg>' and '<Country>'from Drop List
    Then Click Continue Butoon



    Examples:
      |CompanyName           |Driver     |Truck                      |
      |TEST COMPANY (PTY) LTD|1321321 (Generic Generic )|ABB76543 (Volvo 2010 FB667)|