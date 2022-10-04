package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	public  WebDriver driver;
	
	
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public HomePage getHomePage() {
		 HomePage hp = new HomePage(driver);
return hp;
	}
	
	
	public ProductPage getProductPage() {
		 ProductPage pp = new ProductPage(driver);
return pp;
	}

}
