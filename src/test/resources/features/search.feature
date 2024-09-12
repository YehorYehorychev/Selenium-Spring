Feature: Google search

  Scenario Outline: I need to search on google.com website
    Given I am on the google page
    When I enter "<keyword>" as a keyword
    And I click on the search button
    Then I should see at least "<count>" results

    Examples:
    | keyword     | count       |
    | selenium    | 2           |
    | java        | 5           |
    | Spring      | 7           |