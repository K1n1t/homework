Feature:

  Scenario Outline:  negative login page
    When user is on main page and clicks login button
    Then and then clicks on continue with email and enters '<email>'
    And user provides '<password1>' and user reenter the '<password2>'
    Then user validates '<error message>'
    Examples: test data for tumblr
      | email          | password1 | password2 | error message                      |
      | 45sdfs@sda.com | 1         | 1         | Please choose a stronger password. |
