package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class TShirtMyStore extends ProjectMethods{
	
	public TShirtMyStore() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(how = How.XPATH , using ="//a[@class='product_img_link']/img")
	WebElement eleImage;
	
	@FindBy(how = How.XPATH , using ="//div[@class='button-container']/a[1]")
	WebElement eleAddToCart;
	
	@And("Mover hover the Image")
	public TShirtMyStore clickImageMouseHover() {
		Actions a1 = new Actions(driver);
		a1.moveToElement(eleImage).build().perform();
		return this;
	}
	
	@And("click the AddtoCart button")
	public TShirtMyStore clickAddtoCart() {
		click(eleAddToCart);
		return this;
	}
	
	public ProductDetail switchwind() {
		switchToWindow(0);
		driver.close();
		return new ProductDetail();
	}
	
	
	public void verifyOrderHistoryPage() {
		System.out.println("Order History page is displayed");
	}
	
	
	
	

}
