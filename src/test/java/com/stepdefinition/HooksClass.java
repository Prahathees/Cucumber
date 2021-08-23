package com.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.ast.ScenarioOutline;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;

public class HooksClass  extends LibGlobal{
	
	
	
	
	@Before
	public void beforeSceario() {
		LibGlobal 	global = new LibGlobal();
		
		WebDriver driver = global.driver();
		global.url("https://adactinhotelapp.com/");
		global.maximize();
		global.implicitWait(100);
		
	}


	@After
	public void afterScenerio(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			String name = s.getName();
			s.embed(screenshotAs, name);
			
		}
		
		LibGlobal 	global = new LibGlobal();
		global.closeBrowser();
}









}
