package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.maven.ProjectMaven.datadriven.XLSXReader;
import com.pom.HomePage;
import com.pom.ProductPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;
import com.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	static String expectedDropDown;
	public static String expectedValue;
	SingleTonDesignPattern stp = new SingleTonDesignPattern(driver);

	@Given("^user Launch The Application Url\\.$")
	public void user_Launch_The_Application_Url() throws Throwable {
		String url = ConfigurationHelper.getInstance().getUrl();
		get(url);

	}

	@When("^user Select The Category From The Dropdown\\.$")
	public void user_Select_The_Category_From_The_Dropdown() throws Throwable {
		thread();
		expectedDropDown = XLSXReader.particularData("amazon", 2, 0);

		Select s = new Select(stp.getHomePage().getsearch1());
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			String actualDropDown = op.get(i).getText();
			if (expectedDropDown.equalsIgnoreCase(actualDropDown)) {
				s.selectByVisibleText(expectedDropDown);
				break;

			}

		}

	}

	@When("^user Enter The Product in Search Box$")
	public void user_Enter_The_Product_in_Search_Box() throws Throwable {
		expectedValue = XLSXReader.particularData("amazon", 2, 1);

		userInput(stp.getHomePage().getele(), expectedValue);
		thread();

	}

	@Then("^check On The Suggestions and Click On The Matching Suggestion\\.$")
	public void check_On_The_Suggestions_and_Click_On_The_Matching_Suggestion() throws Throwable {

		for (int i = 1; i < stp.getHomePage().getsuggestions().size(); i++) {
			WebElement ss = driver
					.findElement(By.xpath("//div[@class='autocomplete-results-container']/div[" + i + "]/div/div"));
			String actualValue = ss.getText();

			if (expectedValue.equalsIgnoreCase(actualValue)) {
				clickOnElement(ss);

				break;
			} else {
				continue;
			}

		}

	}

	@When("^user Check The Number Of Products Under Results$")
	public void user_Check_The_Number_Of_Products_Under_Results() throws Throwable {

		int size = stp.getProductPage().getMoreresults().size();
		System.out.println("The number of products on the more results is " + size);

	}

	@Then("^user Check The Number Of Products Under More Results$")
	public void user_Check_The_Number_Of_Products_Under_More_Results() throws Throwable {

		int size2 = stp.getProductPage().getResults().size();
		System.out.println("The number of products on the  results is " + size2);

	}

}
