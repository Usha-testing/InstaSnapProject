package com.Ecommerce.instaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	public void BrowserSetup() {
		Reporter.log("Browser launched successfully",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login successfully",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout successfully",true);
	}
	@AfterClass
	public void terminateBrowser() {
		Reporter.log("Browser closed successfully",true);
		
	}

}
