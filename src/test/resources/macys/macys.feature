Feature: Currency and location
  Scenario: Change country and currency
    Given user is on main page and scrolls all the way down and clicks on current location
    Then user chooses 'United Kingdom' and chooses 'British Pounds'
    And user clicks on save and continue button

