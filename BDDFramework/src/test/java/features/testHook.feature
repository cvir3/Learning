Feature:  ApplicationLogin
  Background:
    When launch the browser from config variables
    And hit the home page url of banking site
# Before->Background->Scenario->After

  @SmokeTest @NetBaking
  Scenario: NetBanking login
    Given User is on NetBanking landing page
    When User login into application with "virenchauhan" and password "0953"
    Then Home Page is displayed
    And Cards are displayed

  @RegressionTest @TestQOPS
  Scenario Outline: Qaops login
    Given User is on NetBanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed

    And Cards are displayed
    Examples:
      | Username   | Password |
      | debituser  | test123  |
      | crebituser | vi213   |

