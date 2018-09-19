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

public class IdentityMystore extends ProjectMethods{
	
	public IdentityMystore() {
		PageFactory.initElements(driver,this);

	}
	
	
	@FindBy(how = How.XPATH , using = "//input[@id='firstname']")
	WebElement eleFirtName;
	
	@When("enter the firstName")
	public IdentityMystore enterFirstName() {
		eleFirtName.clear();
		type(eleFirtName, "Vani");
		return this;
		
	}
	
	@Then("Verify first name is entered")
	public void verifyLoginPage() {
		System.out.println("First Name is entered successfully");
	}
}
