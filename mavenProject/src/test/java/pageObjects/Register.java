package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public WebDriver driver;
	
	public Register(WebDriver givenDriver) {
		driver = givenDriver;
		PageFactory.initElements(givenDriver, this);
	}
	
	@FindBy(xpath = "(//div[@class='control'])[1]")
	@CacheLookup
	WebElement humicon;
	
	@FindBy(xpath = "//a[contains(text(), 'Create acc')]")
	@CacheLookup
	WebElement createAccount;
			
	@FindBy(xpath = "(//div[@class='register__inputs']/div/input)[1]")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath = "(//div[@class='register__inputs']/div/input)[2]")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath = "(//div[@class='register__inputs']/div/input)[3]")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "(//div[@class='register__inputs']/div/input)[4]")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(), 'Create Acc')]")
	@CacheLookup
	WebElement ceateAccountBtn;
	
	public void clickHum() {
		humicon.click();
	}
	
	public void clickAcc() {
		createAccount.click();
	}
	
	public void setFirstName(String name) {
		firstName.clear();
		firstName.sendKeys(name);
	}
	
	public void setLastName(String name) {
		lastName.clear();
		lastName.sendKeys(name);
	}
	
	public void setEmail(String _email) {
		email.clear();
		email.sendKeys(_email);
	}
	
	public void setPassword(String _password) {
		password.clear();
		password.sendKeys(_password);
	}
	
	public void clickCre() {
//		Button not working properly
//		ceateAccountBtn.click();
	}
}
