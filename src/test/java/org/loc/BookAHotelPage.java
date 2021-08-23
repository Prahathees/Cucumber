package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.LibGlobal;

public class BookAHotelPage extends LibGlobal{
	
	
	public BookAHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtBillingAdd;
	
	@FindBy(id = "cc_num")
	private WebElement txtCredit;
	
	@FindBy(id = "cc_type")
	private WebElement dDnCCType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement dDnExpMon;
	
	@FindBy(id = "cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id = "book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtBillingAdd() {
		return txtBillingAdd;
	}

	public WebElement getTxtCredit() {
		return txtCredit;
	}

	public WebElement getdDnCCType() {
		return dDnCCType;
	}

	public WebElement getdDnExpMon() {
		return dDnExpMon;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	

	

}
