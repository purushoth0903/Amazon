package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public static WebDriver driver;

	@FindBy(xpath = "//span[text()='MORE RESULTS']//following::div[contains(@class,'sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16')]")
	private List<WebElement> moreresults;

	
	

	public ProductPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getMoreresults() {
		return moreresults;
	}

	@FindBy(xpath = "//span[text()='MORE RESULTS']//preceding::div[contains(@class,'sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16')]")
	private List<WebElement> results;

	public List<WebElement> getResults() {
		return results;
	}
}
