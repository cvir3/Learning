
Feature:  ApplicationLogin

  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with viren and password 0953
    Then Home Page is displayed
    And Cards are displayed

  Scenario Outline: User Page default login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | Username   | Password |
      | debituser  | hello12  |
      | crebituser | lpo213   |


# Note For Regex:-
#   If you a normal word, it could be integer float or any data type your test now will still pass.
#   Even if there are no double quotes, you can still have double quotes. Also you can have string, integer, whatever because in the step definition what ever (.+) receive here accept it.
