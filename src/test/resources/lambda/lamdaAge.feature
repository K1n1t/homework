Feature: Age and ascending, descending functionalities
  Scenario: Validate age is more than thirty and up
    Given user is on main page and clicks on table Sort and search
    Then user is in sorting page and validate that ages are above thirty
#    And user clicks on next page button and validate all pages in that way
#    Then user stores names and positions as a key and age as a value in LinkedHashMap
    And user closes the window


    Scenario: Validate names are in ascending and descending order
      When user is in main page user click on sort link
      Then user validates that names are in ascending order
      And user validates that names are descending order