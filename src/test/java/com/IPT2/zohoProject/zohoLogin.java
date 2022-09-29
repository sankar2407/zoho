package com.IPT2.zohoProject;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.baseClass;
import com.pom.LoginPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;

public class zohoLogin extends baseClass {

	public static WebDriver driver;

	public static void Browserlaunch() {

	//	driver = browserLaunch("chrome");

	}

	public static void login() throws IOException, Throwable {
		
		String browser = ConfigurationHelper.getInstance().getBrowser();

		//LoginPage lp = new LoginPage(driver);
		
		driver = browserLaunch(browser);
		
		SingleTonDesignPattern sdp = new SingleTonDesignPattern(driver);
		String url = ConfigurationHelper.getInstance().getUrl();

//		driver.get("https://google.com");

		launchUrl(url);

		// driver.get("https://www.zoho.com/login.html");

		//WebElement signup = driver.findElement(By.xpath("//a[@href=\"signup.html\"]"));

	
		
		clickOnElement(sdp.getLoginPage().getSignup());

//		String email = excelRead.getData("zoho", 2, 2);

		// WebElement emailid = driver.findElement(By.id("emailfield"));

		String us = ConfigurationHelper.getInstance().getUserName();
		
		userInput(sdp.getLoginPage().getEmail(), us);

		//String passWord = excelRead.getData("zoho", 4, 2);

		// WebElement passwrd = driver.findElement(By.id("password"));

		String ps = ConfigurationHelper.getInstance().getPassword();
		
		userInput(sdp.getLoginPage().getPasswrd(), ps);

		// WebElement terms =
		// driver.findElement(By.xpath("//span[@id=\"signup-termservice\"]"));

		clickOnElement(sdp.getLoginPage().getTerms());

		sleep(4000);
		
		// WebElement signUp = driver.findElement(By.id("signupbtn"));

		clickOnElement(sdp.getLoginPage().getSignupbtn());

		
		
	}

//	public static void screenShots() throws IOException {
//
//		TakesScreenshot ts =  (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\zohoProject\\screenshot\\loginscreen2.png");
//		FileUtils.copyFile(source, destination);
//		
//	}

	public static void main(String[] args) throws Throwable {

		Browserlaunch();
		login();
		
	//	NavigateBFR("back");
		//NavigateBFR("forward");
		//NavigateBFR("refresh");
		screenShot("C:\\Users\\hp\\eclipse-workspace\\zohoProject\\screenshot\\loginscreen2.png");

	}

}
