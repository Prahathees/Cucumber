package org.loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.base.LibGlobal;


public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName ;
	
	@FindBy(name = "password")
	private WebElement txtPassword;
	
	@FindBy(xpath= "//input[@class='login_button']")
	private WebElement btnLogin;

	
	
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
	
	
	

	
}
