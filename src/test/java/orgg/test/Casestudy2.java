package orgg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy2 {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
		 driver.findElement(By.id("details-button")).click();
		 driver.findElement(By.id("proceed-link")).click();
		 
		 driver.findElement(By.xpath("//*[@href='login.htm']")).click();
         driver.findElement(By.name("userName")).sendKeys(username);
         driver.findElement(By.name("password")).sendKeys(password);
         driver.findElement(By.name("Login")).click();
	}

	@Then("user does succefull login")
	public void user_does_succefull_login() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
