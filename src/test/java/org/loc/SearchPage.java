package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.LibGlobal;

public class SearchPage extends LibGlobal  {
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtChechOut() {
		return txtChechOut;
	}

	public WebElement getdDnAdult() {
		return dDnAdult;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(id ="location")
	private WebElement dDnLocation;
	
	@FindBy(id = "hotels")
	private WebElement dDnHotel;
	
	@FindBy(id = "room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement txtCheckin;
	
	@FindBy(id = "datepick_out")
	private WebElement txtChechOut;
	
	@FindBy(id = "adult_room")
	private WebElement dDnAdult;
	
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	
	
	
}











