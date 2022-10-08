package StepsDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	@Given("user is on Hotel App login page")
	public void user_is_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\safzalgo\\Downloads\\chromedriver\\chromedriver.exe");
		System.out.println("Hi");
		driver.get("https://adactinhotelapp.com");
		assertEquals(driver.getCurrentUrl(), "https://adactinhotelapp.com");	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String strin) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(strin);
}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
	}
}
