Feature: As a User I want to Validate TMS Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched TMS Platform
    When Driver Captures UserName and Password
    And Driver should be redirected to dashboard
    And Click Orders Button on My Work
    And Click Create Order Button
    And Enter '<OrderId>' and '<PONumber>'
    And Select '<Customer>', '<Route>', '<Product>', Capture '<ProductDescription>', select '<DeliveryType>' and Capture '<Quantity>'
    And Enter '<CollectionDate>', '<DeliveryDate>' and '<SlotTime>'
    Then Click SaveButton


    Examples:
      | OrderId | PONumber | Customer | Route | Product | ProductDescription | DeliveryType | Quantity | CollectionDate | DeliveryDate | SlotTime |
      |TMS001   |TMS002    |TMSTestCustomer - Peter Ferraira|000002 - TMSRoute|Product|TMSP|DeliveryType|20|2024-09-22  |2024-09-22    |01:30     |





