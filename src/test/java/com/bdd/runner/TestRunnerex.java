package com.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions ( features = {"src/test/java/features/login.feature"},
                 dryRun = !true,
                 glue = "step",
		        monochrome = true,
		        snippets = SnippetType.CAMELCASE
		        
		
		)

public class TestRunnerex extends AbstractTestNGCucumberTests {

}
