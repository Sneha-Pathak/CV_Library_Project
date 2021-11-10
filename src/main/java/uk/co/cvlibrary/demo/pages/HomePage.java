package uk.co.cvlibrary.demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.cvlibrary.demo.utility.Utility;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceField;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void sendTextToJobTitle(String jobTitle)
    {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter Job Title : " + jobTitleField.toString());
    }

    public void sendTextToLocation(String location)
    {
        sendTextToElement(locationField,location);
        log.info("Enter Location : " + locationField.toString());
    }

    public void selectDistance(String distance)
    {
        selectByValueFromDropDown(distanceField,distance);
        log.info("Select distance : " + distance.toString());
    }

    public void clickOnFindJobs()
    {
        clickOnElement(findJobsBtn);
        log.info("Clicking on find job button : " + findJobsBtn.toString());
    }
}
