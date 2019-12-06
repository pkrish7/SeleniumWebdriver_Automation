package com.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/preethykrishnamoorthy/Documents/Selenium/SeleniumWebdriver_Automation/IB_Automation/src/main/java/com/Features/LoginPage.feature",
        glue= "/Users/preethykrishnamoorthy/Documents/Selenium/SeleniumWebdriver_Automation/IB_Automation/src/main/java/com/StepDefinitions/LoginPage.java",
        format = {"pretty", "html:test-output", "json:ison_output/cucumber.json"},
        strict = true
)

public class TestRunner {
}
