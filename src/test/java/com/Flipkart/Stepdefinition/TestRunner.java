package com.Flipkart.Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                    glue= "com.Flipkart.Stepdefinition",
                    monochrome=true,
                      plugin="html:target",
                        	dryRun=false,
                        	tags={} )

public class TestRunner {

}
