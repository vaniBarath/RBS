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
public class Mystore extends ProjectMethods{
	
	public Mystore() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how = How.XPATH , using ="//a[@class='login']")
	WebElement eleSignIn;
	
		
	@And("click the SignIn")
	public LoginMyStore clickSign() {
		click(eleSignIn);
		return new LoginMyStore();
	}
	
	
	public void verifyLoginPage() {
		System.out.println("Login Page is displayed");
	}
	

}
