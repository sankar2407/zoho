package com.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.BaseClass.baseClass;
import com.IPT2.zohoProject.excelRead;
import com.Runner.RunnerZoho;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionZoho extends baseClass {

	public static WebDriver driver = RunnerZoho.driver;
	@Given("User Launch The Chrome Browser")
	public void user_Launch_The_Chrome_Browser() {
		 
				driver.manage().window().maximize();

	}

	@When("User open Zoho HomePage")
	public void user_open_Zoho_HomePage() {
		
		driver.get("https://www.zoho.com/login.html");
	}

	@Then("User click to Sign in button")
	public void user_click_to_Sign_in_button() {

		driver.findElement(By.xpath("//a[@href=\"signup.html\"]")).click();
	}

	@Given("User Enter Mail id in UserId TextBox")
	public void user_Enter_Mail_id_in_UserId_TextBox() throws IOException {
		String email = excelRead.getData("zoho", 2, 2);

		driver.findElement(By.id("emailfield")).sendKeys(email);

	
	}

	@When("User Enter PassWord in PassWord TextBox")
	public void user_Enter_PassWord_in_PassWord_TextBox() throws IOException {
		String passWord = excelRead.getData("zoho", 4, 2);

		driver.findElement(By.id("password")).sendKeys(passWord);

	
	}

	@When("User Accpet The Terms And Conditions")
	public void user_Accpet_The_Terms_And_Conditions() {
		driver.findElement(By.xpath("//span[@id=\"signup-termservice\"]")).click();

	
	}

	@When("User Click Create Account Button")
	public void user_Click_Create_Account_Button() {
		driver.findElement(By.id("signupbtn")).click();
	}

	@Then("User Take ScreenShot of the WebPage")
	public void user_Take_ScreenShot_of_the_WebPage() throws IOException {

		TakesScreenshot ts =  (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\zohoProject\\screenshot\\loginscreen3.png");
		FileUtils.copyFile(source, destination);

	}

	
	}

