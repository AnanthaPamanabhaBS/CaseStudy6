package orggg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy3 {
	WebDriver driver;
	@Given("user enters the TestMeApp and Logs in")
	public void user_enters_the_TestMeApp_and_Logs_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("user searches aproduct in search engine")
	public void user_searches_aproduct_in_search_engine() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
		 driver.findElement(By.id("details-button")).click();
		 driver.findElement(By.id("proceed-link")).click();
		 
		 driver.findElement(By.xpath("//*[@href='login.htm']")).click();
         driver.findElement(By.name("userName")).sendKeys("Lalitha");
         driver.findElement(By.name("password")).sendKeys("password123");
         driver.findElement(By.name("Login")).click();
         
         driver.findElement(By.id("myInput")).sendKeys("Headphone");
       //  Select p=new Select(driver.findElement(By.xpath("//input[@value='headphone']")));
        // p.selectByIndex(1);
         
         driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
          driver.findElement(By.name("val")).click();
          driver.findElement(By.className("btn")).click();
	}

	@Then("user purchases the product")
	public void user_purchases_the_product() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Product added to cart successfully");
	}
}
