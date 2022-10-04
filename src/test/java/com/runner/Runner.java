package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;
import com.property.ConfigurationHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featureser\\amazon.feature", glue = "com.stepdefinition",plugin={"html:Report/HtmlReport1.html",
"junit:Report/XmlReport1.xml","json:Report/JsonReport1.json"})
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigurationHelper.getInstance().getBrowser();
	driver =	BaseClass.browserLaunch(browser);

	}

	@AfterClass
	public static void tearDown() {
		BaseClass.close();

	}

}
