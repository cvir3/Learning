Feature:  ApplicationLogin


  Scenario: User Page default Sign Up

    Given User is on Practice landing page
    When User Signup into application
      | Viren |
      | Chauhan |
      | qaops@gmail.com |
      | 9898098980 |
    Then Home Page is displayed
    And Cards are displayed