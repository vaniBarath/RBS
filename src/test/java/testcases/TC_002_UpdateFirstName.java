package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Mystore;
import pages.MyAccountMyStore;
import pages.IdentityMystore;
import pages.LoginMyStore;
import pages.ProductDetail;
import wdMethods.ProjectMethods;

public class TC_002_UpdateFirstName extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_002_UpdateFirstName";
		testDescription="UpdateFirstName";
		testNodes="Update";
		category="Smoke";
		authors="Vani";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void UpdateFN(String email,String pswd) {
		
		new Mystore()
		.clickSign()
		.enterEmailId(email)
		.enterPassword(pswd)
		.clickSignInButton()
		.clickPersonalInfo()
		.enterFirstName();
	}
	
}
