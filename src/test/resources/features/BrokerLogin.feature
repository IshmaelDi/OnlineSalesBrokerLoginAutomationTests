Feature: Broker Logs In.

  Scenario Outline: Broker Access.
    Given Broker logs in with valid Credentials.
    When Broker captures '<BrokerCode>', '<Password>' and click Login Button.
    And Switch to Product Selection '<Product>' and enter '<LeadNumber>' and click loginButton.'
    And Navigate to Member details to complete required details '<Title>', '<Name>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And Enter '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds additional Member '<ExtendedMemberTitle>','<ExtendedMemeberNames>','<ExtendedMemberSurname>','<ExtendedMemberGender>','<ExtendedMemberDOB>', '<Relation>'.
    And User adds beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | BrokerCode | Password     | Product | LeadNumber | Title | Name    | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation | education                            | FicaDeclaration1 | FicaDeclaration2 |
      | i2124      | Password2023 | XS      | Ba5643646  | Mr    | Lwandle | Duma    | 8001019310085 | 0832002639   | 12345 Test    | 1205       | 18,000 - 25,000 | Technician | Post-graduate (Honours, Masters etc) | yes              | yes              |