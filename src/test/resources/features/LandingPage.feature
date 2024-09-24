Feature: TMS Landing Page Test Validations

  Background:
    Given Open LandingPage Url

    Scenario Outline: User is on Landing Page Screen
      When Login using valid Credentials 
      And Clicks on TMS Logo
      And Click on Toggle
      And Click on Tenant and select '<Demo>' on dropdown
      And Click on Principal and select '<AutoDemoTest>' on dropdown
      Then Click on User Email and Click '<LogOut>' Button

      Examples:
        |UserName                   |Password     | Demo | AutoDemoTest | LogOut |
        |ishmael.direro@korridor.com|Ish@cyest#982|Demo  |AutoDemoTest  |LogOut  |
