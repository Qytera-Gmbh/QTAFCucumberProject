package org.acme.stepdefs;

import de.qytera.qtaf.cucumber.listener.QtafCucumberHooks;
import io.cucumber.java.*;

/**
 * This class listens to cucumber hooks and produces logs
 */
public class TestListener extends QtafCucumberHooks {
    @Before
    public void onBeforeScenario(Scenario scenario) {
        beforeScenario(scenario);
    }

    @After
    public void onAfterScenario(Scenario scenario) {
        afterScenario(scenario);
    }

    @BeforeStep
    public void onBeforeStep(Scenario scenario) {
        beforeStep(scenario);
    }

    @AfterStep
    public void onAfterStep(Scenario scenario) {
        afterStep(scenario);
    }
}