package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.baseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith (Cucumber.class)
@CucumberOptions( features =  "src\\test\\java\\com\\features\\zohoLogin.feature",
		glue = "com.stepDefinition", monochrome = true, 
		plugin={"pretty",
				"html:Report/HtmlReport1.html",
				"junit:Report/XmlReport.xml",
				"json:Report/JsonReport1.json"}		 )


public class RunnerZoho {
	
	public static WebDriver  driver;
	
	@BeforeClass
	
	public static void setUp() {

		driver = baseClass.browserLaunch("chrome");
	
					
	}
	
	@AfterClass
	
	public static void  teardown() {
		
		driver.close();
		
		

	}
	
	
	

}
