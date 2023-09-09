Feature:  ApplicationLogin
  Scenario: Admin Page default login

    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

   #Reusable code
  @SmokeTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "viren" and password "0953"
    Then Home Page is displayed
    And Cards are displayed

  @RegressionTest
  Scenario Outline: Qaops User Page default login
    Given User is on NetBanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed

    And Cards are displayed
    Examples:
      | Username   | Password |
      | debituser  | hello12  |
      | crebituser | lpo213   |

  @SmokeTest @RegressionTest
  Scenario: User Page default Sign Up
    Given User is on Practice landing page
    When User Signup into application
      | Viren |
      | Chauhan |
      | qaops@gmail.com |
      | 9898098980 |
    Then Home Page is displayed
    And Cards are displayed

#    Note:- If you want to run tags wise code add so add tags in the feature file and put the code in the TestNGRunner code.
#    If you want to run only SmokeTesting, Regression, UI, MobileTesting. set the tags as @SmokeTest or If you want to run
#    Smoke and Regresstion add and key word @SmokeTest and Regression, Or If you don't want to smoketest add not keyword before the @
#    not @SmokeTest.
#    You can use and, or, not
#
#  @CucumberOptions(features="src/test/java/features",
#  glue="stepDefinitions",monochrome = true, tags = "@SmokeTest")
#  public class TestNGRunner extends AbstractTestNGCucumberTests {
#  }
