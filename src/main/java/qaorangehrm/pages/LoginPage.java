package qaorangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qaorangehrm.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		System.out.println("webelements are instanciated");
	}
	
		//WebElement repository
	
	@FindBy ( xpath = "//*[@src='/webres_61df95b840c401.55064388/themes/default/images/login/logo.png']")
	WebElement logo;
	@FindBy ( id = "txtUsername")
	WebElement username;
	@FindBy ( id = "txtPassword")
	WebElement password;
	@FindBy ( id = "btnLogin")
	WebElement loginbutton;
	@FindBy ( linkText = "Forgot your password?")
	WebElement forgotpasswordlink;
	
	//we will use constructor to initilize the webelement
	
	
	//Action
	
	public void login(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
	}
	
	public void clickOnForgotpasswordLink() {
		
		forgotpasswordlink.click();
	}
	
	public void logo() {
		logo.isDisplayed();
	}

}
