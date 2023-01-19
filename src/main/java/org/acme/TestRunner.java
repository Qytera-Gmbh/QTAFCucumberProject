package org.acme;

import de.qytera.qtaf.cucumber.context.QtafTestNGCucumberContext;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Main class to execute Cucumber Tests
 */
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"org.acme.stepdefs"},
        tags = "",
        plugin = {"pretty"}
)
public class TestRunner extends QtafTestNGCucumberContext {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}