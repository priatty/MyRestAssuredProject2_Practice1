package com.Get_StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_FeatureFile/mybasicfeaturefile.feature"},
		glue={"com.Get_StepDefinition"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
		}
		)


public class MybasicRunner {

}
