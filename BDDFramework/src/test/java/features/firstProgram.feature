
 Feature:  ApplicationLogin
   Scenario: Admin Page default login

     Given User is on NetBanking landing page
     When User login into application
     Then Home Page is displayed
     And Cards are displayed.