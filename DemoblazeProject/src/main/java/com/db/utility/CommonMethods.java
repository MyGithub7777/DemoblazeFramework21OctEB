package com.db.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.db.testbase.TestBase;

public class CommonMethods extends TestBase {

	public CommonMethods()
	{
		
	}
	
	public static void captureScreenshot(String filename)
	{
		try 
		{
			String path = "D:\\Workspace\\eclipse-workspace\\APAutomation21Oct\\screenshots\\";
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path + filename +".png");	
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void  selectOptionFromDropdown(WebElement element,String value)
	{
		Select s = new Select(element);
		try 
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		s.selectByVisibleText(value);
	}
	
	public static WebElement waitForElementPresence(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebElement waitForElementToBeClickablle(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	

	
	
	
	
}
