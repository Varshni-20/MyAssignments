

Feature: Salesforce account creation


  Scenario: Create a new account in Salesforce
    Given Launch the browser and load the url
    When Enter the username as 'dilip@testleaf.com'
    And Enter the password as 'testleaf@2024'
    And Click on Login button
    Then click on toggle menu button from left corner
    And select Sales from app launcher
    And click on Accounts tab
    And click on New button
    And enter your name as account name
    And select Ownership as Public
    And click Save
    Then I should see the account name your name in the account list
