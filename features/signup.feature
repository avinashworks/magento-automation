Feature: Account Creation and Login

  Scenario: User creates account and signs in
    Given User is on the Magento homepage
    When User navigates to create account page
    And User fills out the registration form
    Then Account should be created successfully
    And User should be able to login with the new credentials

