Feature:  Web Order Functionality

#  Scenario: Positive scenario to create order functionality
#    When user is on login page user provides 'Tester' for username and 'test' for password and cliks on loginBtn
#    Then user chooses 'ScreenSaver' from the dropdown and provde quantity as '10'
#    And user provides price as 10 and discount as 20
#    Then user provides total number as '100'
#    And user enters their name es 'Kuba Abdy' and street address as 'River Rd 34242'
#    Then user enter city as 'Chitown' and state as 'Oshington' and zip as '21344'
#    And user clicks on visa and provides card number as '12343223112' and expiration '10/27'
#    And user finally clicks on process button

#  Scenario Outline: for smartbear
#    When user is on login page user provides '<username>' for username and '<password>' for password and cliks on loginBtn
#    Then user chooses '<productName>' from the dropdown and provde quantity as '<quantity>'
#    And user provides price as 10 and discount as 20
#    Then user provides total number as '<total>'
#    And user enters their name es '<name>' and street address as '<address>'
#    Then user enter city as '<city>' and state as '<state>' and zip as '<zipCode>'
#    And user clicks on visa and provides card number as '<cc>' and expiration '<expiration>'
#    And user finally clicks on process button
#
#    Examples: test data for smartbear
#      | username | password | productName | quantity | total | name      | address  | city    | state     | zipCode | cc             | expiration |
#      | Tester   | test     | ScreenSaver | 200      | 55    | Kuba Abdi | River Rd | Chitown | Oshington | 60656   | 23124414456643 | 12/25      |
#      | Tester   | test     | ScreenSaver | 200      | 55    | Kuba Abdi | River Rd | Chitown | Oshington | 60656   | 23124414456643 | 12/25      |
#      | Tester   | test     | ScreenSaver | 200      | 55    | Kuba Abdi | River Rd | Chitown | Oshington | 60656   | 23124414456643 | 12/25      |
#      | Tester   | test     | ScreenSaver | 200      | 55    | Kuba Abdi | River Rd | Chitown | Oshington | 60656   | 23124414456643 | 12/25      |

  Scenario: positive scenario for smartBear
    When user is on login page and enters username and password as clicks on login
      | username | Tester |
      | password | test   |
    Then user chooses product and specifies quantity
      | product  | ScreenSaver |
      | quantity | 5           |
    And user enters price as five and discount as twenty
      | price    | 5   |
      | discount | 100 |
    Then user enters total as
      | total | 300 |
    And user enters name and address as
      | name    | Kuba     |
      | address | river rd |
    Then user enters state city zipcode as follows
      | state   | IL      |
      | city    | Chitown |
      | zipCode | 12312   |
    And user clicks on visa radio enters cc followed by its expiration date as
      | cc         | 353453423234 |
      | expiration | 10/27        |
    Then user clicks on process button
    |successMessage|

