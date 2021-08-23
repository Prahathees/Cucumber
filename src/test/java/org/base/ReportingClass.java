package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void jVMReporting(String json) {
		
		File file = new File("C:\\Users\\Dell\\eclipse-workspace\\CucumberTool\\Report Generation");
		Configuration configuration = new Configuration(file, "Adactin");
		configuration.addClassifications("Platform", "Win-10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint", "34");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
		
	

	
	
	}

}
