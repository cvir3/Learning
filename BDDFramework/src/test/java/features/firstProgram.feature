
 Feature:  ApplicationLogin
   Scenario: Admin Page default login

     Given User is on NetBanking landing page
     When User login into application with "admin" and password "1234"
     Then Home Page is displayed
     And Cards are displayed

   #Reusable code

   Scenario: User Page default login
     Given User is on NetBanking landing page
     When User login into application with "viren" and password "0953"
     Then Home Page is displayed
     And Cards are displayed