Feature: login page validate

  Scenario: positive scenario for Luma
    Given user in main page and clicks create an account page
    Then user in create account page and fill up name and last name
      | name     | Kanat        |
      | lastName | Berdimuratov |
    And use create email and password and confirms the password
      | email           | kanat123@gmail.com |
      | password        | 123asd!@#          |
      | confirmPassword | 123asd!@#          |
    Then finally user clicks createAnAccount button and validate success message
      | successMsg | Thank you for registering with Main Website Store. |


