Feature: Alta Shop

  @Login @NormalPositive @LoginSuccess
    Scenario: User can success to login
    Given user on the home page
    When user click button login
#    And user on the login page
    And user input the valid email "eka222@gmail.com"
    And user input the valid password "123456"
    And user click login button
#    Then user see "Enormous Cotton Computer" text on the home page

  @Login @NormalNegative @LoginFailed
    Scenario: User can't login with invalid email and invalid password
    Given user on the home page
    When user click button login
    And user input invalid email "invalidmail"
    And user input invalid password "invalidpassword"
    Then user click login button
#    Then user see this "record not found" alert message invalid account

  @HomePage @NormalPositive @SeeDetailsProduct
    Scenario: User can see details product
    Given user logged on AltaShop with email "eka222@gmail.com" and password "123456"
    And user click detail button on a product Enormous Cotton Computer
#    And user on the detail page "Enormous Cotton Computer"

  @HomePage @NormalPositive @BuyTheProduct
    Scenario: User can buy the product
    Given user login on AltaShop with email "eka222@gmail.com" and password "123456"
    When user click buy button on a product Enormous Cotton Computer
    And user click cart button
    And user click add the product
    Then user click button purchase

  @HomePage @NormalPositive @Transaction
    Scenario: User can see the transaction page
    Given user login on AltaShop with email "eka222@gmail.com" and password "123456"
    When user click button profile
    Then user click transaction button

  @HomePage @NormalPositive @LogOut
    Scenario: User can logout from AltaShop
    Given user login on AltaShop with email "eka222@gmail.com" and password "123456"
    When user click profile button
    Then user click logout button
