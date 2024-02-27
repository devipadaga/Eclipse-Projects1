package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature_Tags",
glue= {"StepDefinitions"},
tags= "@smoke or @regression and not @important",
dryRun=true,
monochrome=true,
plugin = {"json:target/cucumber.json"})



public class TestRunner_Tags {

}
