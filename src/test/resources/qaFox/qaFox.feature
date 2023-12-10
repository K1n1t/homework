Feature: login functionality

  Scenario Outline: negative scenario test for login functionality
    Given user is on main page of qa fox user click on my account and clicks login
    Then  user is on  login page and validates title '<title>'
    And user enters '<email>' and then '<password>' and click on ligin button and validate '<errorMessage>'
    Examples: test data for qa fox
      | email           | password    | errorMessage                                                                                     | title         |
      | test@pp.com     | dfs3243     | Warning: No match for E-Mail Address and/or Password.                                            | Account Login |
      | te32st@pp.com   | 23443       | Warning: No match for E-Mail Address and/or Password.                                            | Account Login |
      | te24st@pp.com   | 2343243     | Warning: No match for E-Mail Address and/or Password.                                            | Account Login |
      | t2e24st@pp.com  |             | Warning: No match for E-Mail Address and/or Password.                                            | Account Login |
      | t6e24swt@pp.com | vsdvdvsd    | Warning: No match for E-Mail Address and/or Password.                                            | Account Login |
      |                 | vsdvd423vsd | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. | Account Login |
