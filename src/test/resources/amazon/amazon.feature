Feature: check title
#  Scenario: validate amazon title bases on hats
#    When user on amazon main page user searches for 'hats'
#    Then user validates that title is 'Amazon.com : hats'
#
#    Scenario: validate amazon title based on shoes
#      When user on amazon main page user searches for 'shoes'
#      Then user validates that title is 'Amazon.com : shoes'
#
#    Scenario: validate amazon title based on mouse
#      When user on amazon main page user searches for 'mouse'
#      Then user validates that title is 'Amazon.com : mouse'

  Scenario Outline: validate amazon title bases on hats
    When user on amazon main page user searches for '<items>'
    Then user validates that title is '<title>'

    Examples: test data for amazon
    |items|title|
    |hats |Amazon.com : hats|
    |shoes |Amazon.com : shoes|
    |mouse |Amazon.com : mouse|
    |t-shirt |Amazon.com : t-shirt|