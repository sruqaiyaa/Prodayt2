package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HotelLoginfile {

WebDriver driver;
	
	String ExpectedText = " Hello vasuvespag ";
	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@After
	public void after() {
		driver.quit();
	}

	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    String str = driver.getCurrentUrl();
	    Assert.assertEquals(str,"https://adactinhotelapp.com/");
	    
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I Click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		String greeting = driver.findElement(By.id("username_show")).getAttribute("value");
		Assert.assertEquals("Hello vasuvespag!", greeting);
	}
	@Then("I select location as {string}")
	public void i_select_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location=driver.findElement(By.id("location"));
		Select value =new Select(location);
		value.selectByVisibleText("New York");
	}

	@Then("I click search")
	public void i_click_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Submit")).click();
		System.out.println("Login successful");
	}

	@Then("I am able to find hotels")
	public void i_am_able_to_find_hotels() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
