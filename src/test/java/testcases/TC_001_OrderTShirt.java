package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Mystore;
import pages.MyAccountMyStore;
import pages.LoginMyStore;
import wdMethods.ProjectMethods;

public class TC_001_OrderTShirt extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_001_OrderTShirt";
		testDescription="Order TShirt";
		testNodes="Order";
		category="Smoke";
		authors="Vani";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void OrderTShirt(String email,String password) {
		
		new Mystore()
		.clickSign()
		.enterEmailId(email)
		.enterPassword(password)
		.clickSignInButton()
		.clickTshirtLink()
		.clickImageMouseHover()
		.clickAddtoCart()
		.switchwind()
		.clickUserAcc()
		.clickOrderHistory();
		
	}
	
	

}
