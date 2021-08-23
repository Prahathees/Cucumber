package org.loc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.LibGlobal;

public class SearchHotelPage extends LibGlobal {

	public SearchHotelPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "radiobutton_1")
	private WebElement btnRadioButton;
	
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
	
	
	
	
	
}
