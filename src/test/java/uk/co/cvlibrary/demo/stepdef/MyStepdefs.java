package uk.co.cvlibrary.demo.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.cvlibrary.demo.pages.HomePage;
import uk.co.cvlibrary.demo.pages.VerificationPage;

public class MyStepdefs
{
    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {

    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String JobTitle)
    {
        homePage.sendTextToJobTitle(JobTitle);
    }

    @And("^I enter location\"([^\"]*)\"$")
    public void iEnterLocation(String Location) throws InterruptedException
    {
        Thread.sleep(5);
        homePage.sendTextToLocation(Location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String Distance) throws InterruptedException
    {
        Thread.sleep(10);
        homePage.selectDistance(Distance);
    }


    @And("^I click on Find Jobs button$")
    public void iClickOnFindJobsButton()
    {
        homePage.clickOnFindJobs();
    }

    @Then("^Verify I should be navigate to jobs \"([^\"]*)\" successfully$")
    public void verifyIShouldBeNavigateToJobsSuccessfully(String Jobs)
    {
        Assert.assertTrue(Jobs, new VerificationPage().getTextFromJobs1().contains(Jobs));
    }
}
