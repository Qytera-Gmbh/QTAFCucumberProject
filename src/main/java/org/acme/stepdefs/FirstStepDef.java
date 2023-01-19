package org.acme.stepdefs;

import de.qytera.qtaf.testng.context.QtafTestNGContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FirstStepDef extends QtafTestNGContext {

    @Given("Launch the browser")
    public void launchTheBrowser() {
        driver.get("https://www.qytera.de");
    }

    @Then("Enter {string} in the search text box")
    public void enterStringInSearchBox(String string) {
        System.out.println("Search box: " + string);
    }

    @Then("Select the first result")
    public void selectTheFirstResult() {
        Assert.assertEquals(1, 1);
    }
}