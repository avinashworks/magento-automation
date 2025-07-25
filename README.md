Project Title
Magento Account Automation Suite

Overview
This project automates the account creation and login functionalities on the Magento test site, using BDD methodology and the Page Object Model. The suite is implemented with Selenium WebDriver and Java (you can mention Cucumber, TestNG, or Behave as per your stack).

Repository Structure

/features         # BDD feature files (Gherkin)
/stepdefinitions    # Step definitions (Java)
/pages            # Page Object classes
/runners           # Test runners
/utils      # base class 
/TestCases_MagentoAccount.xlsx  # Excel documentation of cases
/bdd_automation_REC.mp4
README.md
pom.xml           # Maven config (if using Maven)

Test Cases
See TestCases_MagentoAccount.xlsx for a full list of documented scenarios, including:

Account registration (valid/invalid)
Login (valid/invalid)
Error handling
Negative and edge cases

BDD Scenarios
features/register_login.feature
Contains Gherkin scenarios for account registration and login.

Example:

text
Scenario: Successful Account Registration
  Given the user is on the Magento homepage
  When the user navigates to the registration page
  And enters valid registration details
  Then an account is created and success message is shown
  
Proof of Execution

For video: bdd_automation_REC.mp4

