package uk.co.cvlibrary.demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.cvlibrary.demo.utility.Utility;

public class VerificationPage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Software Tester jobs in London')]")
    WebElement verifySoftwareTesterJob1;

    public String getTextFromJobs1()
    {
        log.info("Verify Job Title : " + verifySoftwareTesterJob1.toString());
        return getTextFromElement(verifySoftwareTesterJob1);
    }

    @FindBy(xpath = "//h1[contains(text(),'Automation Tester jobs in HA0 3DJ')]")
    WebElement verifySoftwareTesterJob2;

    public String getTextFromJobs2()
    {
        log.info("Verify Job Title : " + verifySoftwareTesterJob2.toString());
        return getTextFromElement(verifySoftwareTesterJob2);
    }

}
