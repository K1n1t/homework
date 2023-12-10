Feature: login process
  Background: happy path for login
    Given user enters email as 'guest1@microworks.com' and password as 'Guest1!' and click signIn
    When user validates title of login page as 'ORDER DETAILS - Weborder'
    When user clicks on group order radio button and click on next button

Scenario: check with home location
  When is on group order page user verifies that 'My House' is selected
  Then user validates address '3137 3137 Laguna Street'
  And user enters notes for guests as 'take your shoes off man!'
  Then user enters emails for friends as 'test@test.com' and 'test@test.io'
  And user finally checks on create group order button
  Then user validates header is this 'View Group Order' and participant number 1

  Scenario: check office location
    When is on group order page user verifies that 'Office' is selected
    Then user validates address '2012 EMPIRE BLVD'
    And user enters notes for guests as 'put your shoes on dude!'
    Then user enters emails for friends as 'testuuu@test.com' and 'uuutest@test.io'
    And user finally checks on create group order button
    Then user validates header is this 'View Group Order' and participant number 1