package com.Get_DataTable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_DataTable/Get_DataTableFeatureFile.feature"},
		glue={"com.Get_DataTable"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
		}
		)


public class Get_DataTable_Runner {

}
