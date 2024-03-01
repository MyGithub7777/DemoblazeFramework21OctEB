package com.db.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {

	public Signuppage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//------- obj repo ------------
	
	@FindBy(xpath = "//*[@id=\"sign-username\"]")
	private WebElement username_txtbox;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	private WebElement signup_btn;
	
	
	//--------- action methods--------------
	
	public void enterUsername(String username)
	{
		username_txtbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnSignupButton()
	{
		signup_btn.click();
	}
}
