package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;


public class MainSteps {
    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User landed on netbanking page");
        //throw new io.cucumber.java.PendingException();
    }

//        @When("User login into application with {string} and password {string}")
//        public void user_login_into_application_with_and_password(String username, String password) {
//            // Write code here that turns the phrase above into concrete actions
//            System.out.println(username + " and password is " + password );
//
//        }

    /* This is for Regex pattern */
    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username + " and password is " + password );
        /* If you don't provide this cap ^ symbol and dollar symbol. It could not identify that as a regex pattern. */
    }

    /* This is for Data Driven*/
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Practice landing page");
        Assert.assertTrue(false);
    }
    /* This is for Data Driven*/
    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Home page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Cards are displayed");
    }

    /* This is for background test */
    @Given("setup the entries in the database")
    public void setupEntries(){
        System.out.println("************************");
        System.out.println("setup the entries in the database");
    }

    @When("launch the browser from config variables")
    public void launchBrowser(){
        System.out.println("launch the browser from config variables");
    }

    @When("hit the home page url of banking site")
    public void hitURl(){
        System.out.println("hit the home page url of banking site");
    }
}
