package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void userGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void clearOnElement(WebElement element) {
		element.clear();

	}

	public static void attributeOfElement(WebElement element, String value) {
		element.getAttribute(value);

	}

	public static void elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	public static void elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// takescreenshot
	public static void takeAScreenshot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\purushoth\\eclipse-workspace\\FacebookProject\\Screenshot\\" + value + ".png");
		FileUtils.copyFile(source, dest);
	}

	public static WebDriver browserLaunch(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\purushoth\\eclipse-workspace\\Selenium\\Chromenewdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("gecko")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\purushoth\\eclipse-workspace\\Selenium\\Chromenewdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\purushoth\\eclipse-workspace\\Selenium\\Chromenewdriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();

		return driver;
		
	}

	public static void thread() throws InterruptedException {
		Thread.sleep(3000);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void get(String value) {
		driver.get(value);

	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void printUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void printPageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

	// wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void fluentWait() {
		Wait wait1 = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(Exception.class);

	}

	// alert
	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static void confirmAlert(String alert) {
		Alert a1 = driver.switchTo().alert();
		if (alert.equalsIgnoreCase("ok")) {
			a1.accept();
		} else if (alert.equalsIgnoreCase("cancel")) {
			a1.dismiss();

		}

	}

	public static void promptAlert(String value, String value1) {
		if (value.equalsIgnoreCase("yes")) {
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			System.out.println(text);
			a.sendKeys(value1);
			a.accept();

		} else if (value.equalsIgnoreCase("no")) {
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			System.out.println(text);
			a.sendKeys(value1);
			a.dismiss();

		}

	}

	// navigation methods
	public static void navigationMethodsTo(String value) {
		driver.navigate().to(value);

	}

	public static void navigationMethodsBack() {
		driver.navigate().back();

	}

	public static void navigationMethodsForward() {
		driver.navigate().forward();

	}

	public static void navigationMethodsRefresh() {
		driver.navigate().refresh();

	}
	// actions

	public static void actions(String value, WebElement element) {
		if (value.equalsIgnoreCase("click")) {
			Actions ac = new Actions(driver);
			ac.click().perform();

		} else if (value.equalsIgnoreCase("doubleclick")) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).perform();

		} else if (value.equalsIgnoreCase("rightclick")) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();

		} else if (value.equalsIgnoreCase("clickandhold")) {
			Actions ac = new Actions(driver);
			ac.clickAndHold(element).perform();

		} else if (value.equalsIgnoreCase("movetoelement")) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();

		} else {
			System.out.println("invalid options");
		}

	}

	public static void dragAndDrop(WebElement source, WebElement destination) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination).perform();

	}

	// robot
	public static void robot(String value) throws AWTException {

		if (value.equalsIgnoreCase("down")) {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		} else if (value.equalsIgnoreCase("ENTER")) {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		} else {
			System.out.println("invalid option");
		}

	}
	// frame

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frameParent() {
		driver.switchTo().parentFrame();
	}

	public static void frameMainPage(WebElement element) {
		driver.switchTo().defaultContent();
	}

	// select drop down
	public static void select(WebElement element, String select, String value) {
		if (select.equals("value")) {
			Select s = new Select(element);
			s.selectByValue(value);

		} else if (select.equals("text")) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		} else if (select.equals("number")) {
			Select s = new Select(element);
			int num = Integer.parseInt(value);
			s.selectByIndex(num);
		} else {
			System.out.println("invalid option");
		}

	}

	public static void deselect(WebElement element, String deselect, String value) {
		if (deselect.equals("value")) {
			Select s = new Select(element);
			s.deselectByValue(value);

		} else if (deselect.equals("text")) {
			Select s = new Select(element);
			s.deselectByVisibleText(value);
		} else if (deselect.equals("number")) {
			Select s = new Select(element);
			int num = Integer.parseInt(value);
			s.deselectByIndex(num);
		} else if (deselect.equals("deselect")) {
			Select s = new Select(element);
			s.deselectAll();

		} else {
			System.out.println("invalid option");
		}

	}

	public static void selectMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void selectMultipleOptions(WebElement element, String value) {
		if (value.equalsIgnoreCase("options")) {
			Select s = new Select(element);
			s.getOptions();

		} else if (value.equalsIgnoreCase("alloptions")) {
			Select s = new Select(element);
			s.getAllSelectedOptions();

		} else if (value.equalsIgnoreCase("firstselectedoptions")) {
			Select s = new Select(element);
			s.getFirstSelectedOption();

		} else {
			System.out.println("invalid options");
		}
	}

	// javascriptexceutor
	public static void javaScriptScrollUpDown(int a, int b) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(a,b)");

	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void javaScriptScrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView;", element);

	}
}
