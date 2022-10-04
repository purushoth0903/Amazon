package com.maven.ProjectMaven.datadriven;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.HomePage;
import com.pom.ProductPage;

public class Amazon extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

	
		driver = browserLaunch("chrome");
		HomePage hp = new HomePage(driver);
		ProductPage pp = new ProductPage(driver);
		get("https://www.amazon.in/");

		implicitWait();
		String expectedDropDown = XLSXReader.particularData("amazon", 2, 0);

		String expectedValue = XLSXReader.particularData("amazon", 2, 1);
		//WebElement search = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(hp.getsearch1());
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			String actualDropDown = op.get(i).getText();
			if (expectedDropDown.equalsIgnoreCase(actualDropDown)) {
				s.selectByVisibleText(expectedDropDown);
				break;

			}

		}
	//	WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		userInput(hp.getele(), expectedValue);
		thread();
	//	List<WebElement> suggestions = driver
			//	.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		for (int i = 1; i < hp.getsuggestions().size(); i++) {

			//WebElement ss = driver
				//	.findElement(By.xpath("//div[@class='autocomplete-results-container']/div[" + i + "]/div/div"));
			String actualValue = hp.getSs().getText();

			if (expectedValue.equalsIgnoreCase(actualValue)) {
				clickOnElement(hp.getSs());

				break;
			} else {
				continue;
			}

		}

	//	List<WebElement> moreResults = driver
			//	.findElements(By.xpath("//span[text()='MORE RESULTS']//following::div[contains(@class,'sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16')]"));
		int size = pp.getMoreresults().size();
		System.out.println("The number of products on the more results is " + size);

		//List<WebElement> results = driver.findElements(By.xpath("//span[text()='MORE RESULTS']//preceding::div[contains(@class,'sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16')]"));
		int size2 = pp.getResults().size();
		System.out.println("The number of products on the  results is " + size2);

	}

}
