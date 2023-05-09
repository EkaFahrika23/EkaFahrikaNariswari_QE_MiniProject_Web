Feature: Alta Shop

  @Register @NormalPositive @RegisterSuccess
    Scenario: User can success to register
    Given user on the register page
    When user input valid Nama Lengkap "Eka Fahrika"
    And user input valid email "eka222@gmail.com"
    And user input valid password "123456"
    Then user click register button

#  @Register @NormalNegative @RegisterFailed
#    Scenario: User can't register with invalid email
#    Given user on the register page
#    When user input fullname "Eka Fahrika"
#    And user input with invalid email "invalidemaileka"
#    And user input password "12345678"
#    Then user click register button