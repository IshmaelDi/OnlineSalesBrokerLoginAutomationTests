Feature: As a driver of Korridor Platform I want to validate Switch Company Profile Pop Up/Alert functionality

  @smokeTest
  Scenario: Validate Switch Company Profile Pop Up/Alert selection
    Given Driver driver has switched to company profile
    And  Driver select "company name" from list

      |CompanyName           |
      |TEST COMPANY (PTY) LTD|

    When Driver click confirm
    And Driver read "IMPORTANT NOTICE"
    Then Driver click Ok









#    And There will be a pop window for company profile selction
#    And Click to select '<Company Name>' from drop down list
#    Then Click Confirm Button

#    Examples:
#      | UserName | Password | Company Name           |
#      | Ncane    | qpPcAK7x | TEST COMPANY (PTY) LTD |