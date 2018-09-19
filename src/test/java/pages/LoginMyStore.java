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

public class LoginMyStore extends ProjectMethods{
	
	public LoginMyStore() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how = How.XPATH , using ="//input[@id='email']")
	WebElement eleEmail;
	
	@FindBy(how = How.XPATH , using ="//input[@id='passwd']")
	WebElement elepswd;
	
	@FindBy(how = How.XPATH , using ="//button[@id='SubmitLogin']")
	WebElement eleLoginButton;

	
	@And("enter the emailid as (.*)")
	public LoginMyStore enterEmailId(String eMailId) {
		type(eleEmail, eMailId);
		return this;
	}
	
	@And("enter the password as (.*)")
	public LoginMyStore enterPassword(String pSwd){
		type(elepswd, pSwd);
		return this;
	}
	
	
	@And("click the SignIn button")
	public MyAccountMyStore clickSignInButton() {
		click(eleLoginButton);
		return new MyAccountMyStore();
	}
	
	
	public void verifyMyAccountPage() {
		System.out.println("My Account Page is displayed");
	}

	
}
