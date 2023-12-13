Feature: login page validate

  Scenario: positive scenario for Luma
    Given user in main page validates title and clicks contact us link
      | title | Automation Exercise |
    Then user verifies get in touch header
      | header | Get In Touch |
    And user fill up the page
      | name    | Kanat                |
      | email   | kanat123@gmail.com   |
      | subject | button               |
      | text    | you guys are awesome |
    Then user upload the file and clicks submit button
      | file | /Users/kanatberdimuratov/Desktop |
    And user validates the text from pop up and accept it
      | popUptext | Press OK to proceed! |
    Then user validates success message and clicks on home button
      | successMessage | Success! Your details have been submitted successfully. |
    And user validates home page
    |title|Automation Exercise|
