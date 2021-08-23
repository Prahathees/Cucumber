package com.runner;

import org.base.ReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources"}, glue = {"com.stepdefinition"},monochrome=true,plugin= {"pretty",
		"json:C:\\Users\\Dell\\eclipse-workspace\\CucumberTool\\Report Generation\\report.json"})

public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		ReportingClass.jVMReporting("C:\\Users\\Dell\\eclipse-workspace\\CucumberTool\\Report Generation\\report.json");
	}

}
