package com.db.testlayer;

import org.testng.annotations.Test;

import com.db.pagelayer.Homepage;
import com.db.pagelayer.Signuppage;
import com.db.testbase.TestBase;

public class SignupTestCase extends TestBase{

	@Test
	public void signupTest()
	{
		Homepage homepage_obj = new Homepage(driver);
		Signuppage signuppage_obj = new Signuppage(driver);
		
		homepage_obj.clickOnSignupLink();
		signuppage_obj.enterUsername("testacc111");
		signuppage_obj.enterPassword("test");
		signuppage_obj.clickOnSignupButton();
		
	}
}
