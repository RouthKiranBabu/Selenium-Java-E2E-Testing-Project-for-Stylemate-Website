package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.Register;

public class Steps {
	public WebDriver driver;
	public Register rgt;
	
	@Given("User Launch the chrome Browser")
	public void user_launch_the_chrome_browser() {
	    driver = new ChromeDriver();
	    rgt = new Register(driver);
	}

	@When("User visits {string} with title {string}")
	public void user_visits_with_title(String string, String string2) throws InterruptedException {
	    driver.get(string);
	    Thread.sleep(3000);
	    String actualTitle = driver.getTitle();
	    if (actualTitle.equals(string2)) {
	    	System.out.println("Yes, title is " + string2 + ".");
	    }else Assert.fail();
	}

	@Then("Click on the human icon")
	public void click_on_the_human_icon() throws InterruptedException {
	    rgt.clickHum();
	    Thread.sleep(3000);
	}

	@Then("Click on Create Account Link")
	public void click_on_create_account_link() throws InterruptedException {
	    rgt.clickAcc();
	    Thread.sleep(3000);
	}

	@Then("User enters Firstname as {string} Lastname as {string} Email as {string} Password as {string}")
	public void user_enters_firstname_as_lastname_as_email_as_password_as(String string, String string2, String string3, String string4) throws InterruptedException {
	    rgt.setFirstName(string);
	    Thread.sleep(1000);
	    rgt.setLastName(string2);
	    Thread.sleep(1000);
	    rgt.setEmail(string3);
	    Thread.sleep(1000);
	    rgt.setPassword(string4);
	    Thread.sleep(1000);
	}

	@Then("Click on Create Account")
	public void click_on_create_account() throws InterruptedException {
	    rgt.clickCre();
	    Thread.sleep(3000);
	}

	@Then("Close the window")
	public void close_the_window() {
	    driver.quit();
	}
}
