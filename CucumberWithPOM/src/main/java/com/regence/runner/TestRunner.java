package com.regence.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\iliaz\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\CucumberWithPOM\\src\\main\\java\\com\\regence\\features\\Regence.feature",
glue= {"com.regence.stepDefinitions"},
format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
monochrome = true,
strict = true,
dryRun=false)
//tags= {"~@SmokeTest" , "@RegressionTest"}
//OR: tags={"@SmokeTest , @RegressionTest"} -- execute all the tests tagged as @SmokeTest or @RegressionTest
//AND: tags= {"@SmokeTest" , "@RegressionTest"} -- execute all test cases tagged as @SmokeTest or @RegressionTest
//How to ignore: tags= {"~@SmokeTest" , "@RegressionTest"}--It will ignore the @SmokeTest
public class TestRunner {

}
