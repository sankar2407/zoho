package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public  WebDriver driver;
	
@FindBy(xpath = "//a[@href=\"signup.html\"]")
private WebElement signup;

@FindBy(id = "emailfield")
private WebElement email;

@FindBy(id = "password")
private WebElement passwrd;

@FindBy(xpath = "//span[@class=\"unchecked\"]")
private WebElement terms;

@FindBy(id = "signupbtn")
private WebElement signupbtn;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public WebElement getSignup() {
	return signup;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPasswrd() {
	return passwrd;
}

public WebElement getTerms() {
	return terms;
}


public WebElement getSignupbtn() {
	return signupbtn;
}








}
