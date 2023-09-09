
 Feature:  ApplicationLogin

   # Parameterization
   Scenario Outline: User Page default login
     Given User is on NetBanking landing page
     When User login into application with "<Username>" and password "<Password>"
     Then Home Page is displayed

     And Cards are displayed
     Examples:
       | Username   | Password |
       | debituser  | hello12  |
       | crebituser | lpo213   |