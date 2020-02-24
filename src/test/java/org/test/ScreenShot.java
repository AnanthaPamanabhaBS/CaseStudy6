package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ScreenShot {
  @Test
public void captureScreen(WebDriver driver) throws IOException {
	  File src=  ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("C:\\PROJECT\\eclipse\\Ananth\\myimage.png"));
  
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		 FileUtils.copyFile(src, new File("C:\\PROJECT\\ScreenShots\\myimage.png"));
  }
	  
	  
   
	 
	  
	  
	  
	  
   /* driver.get("http://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.name("submit")).click();
    Alert a=driver.switchTo().alert();
    a.accept();
   */
	  
	  
   /*  driver.get("http://demo.guru99.com/test/drag_drop.html");
   // actions.keyDown(Keys.SHIFT).sendKeys("mailme").keyUp(Keys.SHIFT).doubleClick().perform();
   Actions act=new Actions(driver);
   WebElement from=driver.findElement(By.id("credit2"));
   WebElement to=driver.findElement(By.id("bank"));
   act.dragAndDrop(from, to).build().perform();
   */
   
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
