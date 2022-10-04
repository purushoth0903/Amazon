package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchDropdownBox")
	private WebElement search1;

	public WebElement getsearch1() {
		return search1;
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement ele;

	public WebElement getele() {
		return ele;
	}

	@FindBy(xpath = "//div[@class='autocomplete-results-container']/div")
	private List<WebElement> suggestions;

	public List<WebElement> getsuggestions() {
		return suggestions;

	}

	@FindBy(xpath = "//div[@class='autocomplete-results-container']/div[\" + i + \"]/div/div")
	private WebElement ss;

	public WebElement getSs() {
		return ss;
	}

}
