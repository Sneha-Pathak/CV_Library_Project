package uk.co.cvlibrary.demo;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.cvlibrary.demo.basepage.BasePage;
import uk.co.cvlibrary.demo.propertyreader.PropertyReader;
import uk.co.cvlibrary.demo.utility.Utility;

import java.io.IOException;

public class Hooks extends BasePage
{
    @Before
    public void openBrowser()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("QA Tester","Sneha Pathak");
    }
    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
