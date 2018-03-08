package com.alwindoss.sw.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.alwindoss.sw"},
        features = ".",
        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@complete"}
)
public class AllTests {
}