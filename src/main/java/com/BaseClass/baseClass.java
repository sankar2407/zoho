package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {

	public static WebDriver driver = null;

	public static void userInput(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\eclipse-workspace\\Selenium_11july\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox"))

		{
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void sleep(int msec) throws InterruptedException {

		Thread.sleep(msec);

	}

	public static void printText(WebElement element) {
		String text = element.getText();

		System.out.println(text);
	}

	public static void isEnabled(WebElement element) {

		boolean check = element.isEnabled();
		System.out.println(check);

	}

	public static void clear(WebElement element) {

		element.clear();

	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void printTitle() {

		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
	}
	
	public static void printUrl() {
String currentUrl = driver.getCurrentUrl();

System.out.println(currentUrl);
	}
	
	public static void navigateTo(String Url) {
		
		driver.navigate().to(Url);
		

	}
	
	public static void NavigateBFR(String Navigate) {

		
		 if (Navigate.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}
		else if (Navigate.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
			
		}
	else if (Navigate.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
	}}

	
	public static void screenShot(String path) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

}
