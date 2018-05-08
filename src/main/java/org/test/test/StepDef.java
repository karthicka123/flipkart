package org.test.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {

WebDriver driver;
static String parentWindowID;


static String pwid;
static String allwindows;

	@Given("^user navigates to the Flipkart\\.com$")
	public void user_navigates_to_the_Flipkart_com() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "G:\\FlipKart\\driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	     
	}

	@When("^user added items \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\" into the cart$")
	public void user_added_items_into_the_cart(String sam1, String sam2, String sam3, String sam4, String sam5) throws Throwable {

	//1st item

		 driver.findElement(By.name("q")).sendKeys(sam1);
		 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  pwid = driver.getWindowHandle();
		 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Max'))])[1]")).click();
		 
	  Set<String> allwindows1 = driver.getWindowHandles();
      for (String x : allwindows1) {
	        if(! pwid.equals(x)) {
		       driver.switchTo().window(x);
     	}
      }
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	 
	//2nd item
	 driver.findElement(By.name("q")).sendKeys(sam2);
	 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 pwid = driver.getWindowHandle();
	 
	
	 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Nxt (Gold, 64 GB)'))])[1]")).click();
	 

	  Set<String> allwindows2 = driver.getWindowHandles();
     for (String x : allwindows2) {
	        if(! pwid.equals(x)) {
		       driver.switchTo().window(x);
    	}
     }
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	 
	 //3rd item
	 

	 driver.findElement(By.name("q")).sendKeys(sam3);
	 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  pwid = driver.getWindowHandle();
	  driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Max (Black, 32 GB)'))])[1]")).click();
	 
  Set<String> allwindows3 = driver.getWindowHandles();
  for (String x : allwindows3) {
        if(! pwid.equals(x)) {
	       driver.switchTo().window(x);
 	}
  }
 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
 
 //4th item
 

 driver.findElement(By.name("q")).sendKeys(sam4);
 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  pwid = driver.getWindowHandle();
  driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Nxt (Black, 64 GB)'))])[1]")).click();
 
Set<String> allwindows4 = driver.getWindowHandles();
for (String x : allwindows4) {
    if(! pwid.equals(x)) {
       driver.switchTo().window(x);
	}
}
driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	 
//4th item


driver.findElement(By.name("q")).sendKeys(sam5);
driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
pwid = driver.getWindowHandle();
driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy J3 Pro (Gold, 16 GB)'))])[1]")).click();

Set<String> allwindows5 = driver.getWindowHandles();
for (String x : allwindows5) {
  if(! pwid.equals(x)) {
     driver.switchTo().window(x);
	}
}
driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	 
		 
//		 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Nxt (Gold, 64 GB)'))])[1]")).click();
//		 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Max (Black, 32 GB)'))])[1]")).click();
//		 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy On Nxt (Black, 64 GB)'))])[1]")).click();
//		 driver.findElement(By.xpath("(//a[(contains(text(), 'Samsung Galaxy J3 Pro (Gold, 16 GB)'))])[1]")).click();
//		 
        
	}

	@Then("^items should get added successfully$")
	public void items_should_get_added_successfully() throws Throwable {
		
Assert.assertEquals("MY CART (5)", driver.findElement(By.xpath("//span[@class='_1WMqsr']")).getText());
	   
	}

	


}
