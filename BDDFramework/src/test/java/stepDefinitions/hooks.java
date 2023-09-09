package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before("@NetBanking")
    public void netBankingSetup()
    {
        System.out.println("**************************************************************");
        System.out.println("setup the entries in NetBanking database");
    }

    @After
    public void tearDown()
    {
        System.out.println("Clear the entries");
    }

    @Before("@TestQOPS")
    public void testqaopsSetup()
    {
        System.out.println("setup the entries in Qaops database");
    }
}
