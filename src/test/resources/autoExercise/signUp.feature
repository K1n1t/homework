Feature: Sing up functionality

  Scenario: Happy Path
    Given user is on main page and provides username and email and clicks signUp
    When user in on signUp page user verifies that user is on signUp page
    Then user checks mr radio and provides full name
    And use verifies entered email and provides password
    Then user provides their birthdate
    And user enters first and last name
    Then user enters adress and chooses their country
    And user rpovides state and city
    Then user enters zipcode and phone number
    And user click on create button
    Then finally verifies account created message
