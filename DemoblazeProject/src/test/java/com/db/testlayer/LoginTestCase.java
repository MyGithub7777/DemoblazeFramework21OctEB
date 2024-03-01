package com.db.testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.db.pagelayer.Homepage;
import com.db.pagelayer.Loginpage;
import com.db.testbase.TestBase;


public class LoginTestCase extends TestBase {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		Homepage homepage_obj = new Homepage(driver);
		Loginpage loginpage_obj = new Loginpage(driver);
		
		homepage_obj.clickOnLoginLink();
		Thread.sleep(2000);
		loginpage_obj.enterUsername("testacc3");
		Thread.sleep(2000);
		loginpage_obj.enterPassword("test");
		Thread.sleep(2000);
		loginpage_obj.clickOnLoginButton();	
		
	}
}
