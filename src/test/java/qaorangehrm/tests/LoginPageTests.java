package qaorangehrm.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qaorangehrm.base.TestBase;
import qaorangehrm.pages.LoginPage;

public class LoginPageTests extends TestBase{
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginpage = new LoginPage();
			}
	
	@Test
	public void validateLogoTest() {
		loginpage.logo();
	}
	
	@Test
	public void validateLoginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean userstatus = driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
		Assert.assertEquals(userstatus, true);
	}
	
	@Test
	public void validateForgotPasswordlinkTest() {
		loginpage.clickOnForgotpasswordLink();
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	

}
