package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.junit.Assert;
import org.loc.BookAHotelPage;
import org.loc.LoginPage;
import org.loc.SearchHotelPage;
import org.loc.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep extends LibGlobal{
	//WebDriver driver;
	LibGlobal global = new LibGlobal();

@Given("User is on the Adactin login page")
public void a() {
////	WebDriverManager.chromedriver().setup();
////	driver = new ChromeDriver();
////	driver.get("https://adactinhotelapp.com/");
////	driver.manage().window().maximize();
////	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}


@When("User should enter the Username, Password and click the login button")
public void b(io.cucumber.datatable.DataTable dataTable) {
	LoginPage loginPage = new LoginPage();
	WebElement txtUserName = loginPage.getTxtUserName();
	
	Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	String username = asMap.get("username");
	txtUserName.sendKeys(username);
	
	WebElement txtPassword = loginPage.getTxtPassword();
	String password = asMap.get("password");
	txtPassword.sendKeys(password);
	
	loginPage.getBtnLogin().click();
	
}

@When("User should enter the {string}, {string},{string},{string}, {string} and click serach button in Search hotel page")
public void c(String location, String no_of_rooms, String checkin_date, String checkout_date, String adults_per_room) {
	
	SearchPage page = new SearchPage();
	WebElement getdDnLocation = page.getdDnLocation();
	global.selectOptionByText(getdDnLocation, location);
	
	WebElement getdDnNoOfRooms = page.getdDnNoOfRooms();
	global.selectOptionByText(getdDnNoOfRooms, no_of_rooms);

	WebElement txtCheckin = page.getTxtCheckin();
	txtCheckin.clear();
	global.type(txtCheckin, checkin_date);

	WebElement txtChechOut = page.getTxtChechOut();
	txtChechOut.clear();
	global.type(txtChechOut, checkout_date);
	
	
	WebElement getdDnAdult = page.getdDnAdult();
	global.selectOptionByText(getdDnAdult, adults_per_room);
	
	page.getBtnSearch().click();
    
}



@When("User should select the hotel from Select Hotel page")
public void d() {
	
//	Assert.assertTrue(false);
	SearchHotelPage hotelPage = new SearchHotelPage();
	hotelPage.getBtnRadioButton().click();
	hotelPage.getBtnContinue().click();
}


@When("User should enter the first_name, last_name, address, Credit_no, CC_type, exp_month, exp_year and CVV in the Book A Hotel page")
public void e(io.cucumber.datatable.DataTable dataTable) {
	
	List<Map<String, String>> asMaps = dataTable.asMaps();
	String firstname = asMaps.get(0).get("first_name");
	String lastname = asMaps.get(0).get("last_name");
	String address = asMaps.get(0).get("address");
	String Credit_no = asMaps.get(0).get("Credit_no");
	String CC_type = asMaps.get(0).get("CC_type");
	String exp_month = asMaps.get(0).get("exp_month");
	String exp_year = asMaps.get(0).get("exp_year");
	String CVV = asMaps.get(0).get("CVV");
	
	BookAHotelPage bookAHotelPage = new BookAHotelPage();
	
	WebElement txtFirstName = bookAHotelPage.getTxtFirstName();
	global.type(txtFirstName, firstname);

	WebElement txtLastName = bookAHotelPage.getTxtLastName();
	global.type(txtLastName, lastname);
	
	WebElement txtBillingAdd = bookAHotelPage.getTxtBillingAdd();
	global.type(txtBillingAdd, address);
	
	WebElement txtCredit = bookAHotelPage.getTxtCredit();
	global.type(txtCredit, Credit_no);
	
	WebElement dDnCCType = bookAHotelPage.getdDnCCType();
	global.selectOptionByText(dDnCCType, CC_type);
	
	WebElement dDnExpMon = bookAHotelPage.getdDnExpMon();
	global.selectOptionByText(dDnExpMon, exp_month);
	
	WebElement dnExpYear = bookAHotelPage.getdDnExpYear();
	global.selectOptionByText(dnExpYear, exp_year);
	
	WebElement txtCVV = bookAHotelPage.getTxtCVV();
	global.type(txtCVV, CVV);
	
	WebElement btnBook = bookAHotelPage.getBtnBook();
	global.click(btnBook);
	
}



@Then("The order id should be generated")
public void f() {
	
	WebElement Orderid = driver.findElement(By.id("order_no"));
	String printText = global.printAttribute(Orderid);
	System.out.println(printText);
//	driver.quit();
	
}






}
