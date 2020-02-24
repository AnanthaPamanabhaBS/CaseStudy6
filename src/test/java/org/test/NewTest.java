package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTest {
	
WebDriver driver;
  @Given("User click on register or signup button on register app")
public void user_click_on_register_or_signup_button_on_register_app() {
    // Write code here that turns the phrase above into concrete actions
	 
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 
	 driver.findElement(By.id("details-button")).click();
	 driver.findElement(By.id("proceed-link")).click();
	 driver.findElement(By.xpath("//*[@href='RegisterUser.htm']")).click();
}
@When("user enters {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
public void user_enters(String userName, String firstName, String lastName, String password, String confirmPassword, String emailAddress, String mobileNumber, String dob, String address, String answer) {
    // Write code here that turns the phrase above into concrete actions

	
	// Write code here that turns the phrase above into concrete actions
     driver.findElement(By.name("userName")).sendKeys(userName);
     driver.findElement(By.name("firstName")).sendKeys(firstName);
     driver.findElement(By.name("lastName")).sendKeys(lastName);
     driver.findElement(By.name("password")).sendKeys(password);
     driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
     driver.findElement(By.xpath("//*[@value='Male']")).click();
     driver.findElement(By.name("emailAddress")).sendKeys(emailAddress);
     driver.findElement(By.name("mobileNumber")).sendKeys(mobileNumber);
     driver.findElement(By.name("dob")).sendKeys(dob);
     driver.findElement(By.name("address")).sendKeys(address);
     driver.findElement(By.xpath("//*[@value='411010']")).click();
     driver.findElement(By.name("answer")).sendKeys(answer);
     driver.findElement(By.name("Submit")).click();
}

@Then("user navigates to the home page")
public void user_navigates_to_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
}
}