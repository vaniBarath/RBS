package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ProductDetail extends ProjectMethods{
	
	public ProductDetail() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how = How.XPATH , using ="//div[@class='header_user_info']/a")
	WebElement eleUser;
	
	@FindBy(how = How.XPATH , using = "(//ul[@class='myaccount-link-list']/li/a)[1]')")
	WebElement eleOrderHist;
	
	
	@When("click the User Account")
	public ProductDetail clickUserAcc() {
		click(eleUser);
		return this;
	}
	
	
	public void clickOrderHistory() {
		click(eleOrderHist);
		
	}
	
	@Then("Verify order history page is displayed")
	public void verifyLoginPage() {
		System.out.println("Order history page is displayed");
	}

	
	

}