package com.curahealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Test {
	
	WebDriver driver;
	
	
  @Test(priority=1)
  public void Navigate_to_login_page() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://katalon-demo-cura.herokuapp.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("btn-make-appointment")).click();
	  
  }
  
  @Test(priority=2)
  void Verify_text() {
	  
	 driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p")).getText(); 
  }
  
  @Test(priority=3)
	  void verify_username_password() {
	  WebElement usr_name=driver.findElement(By.id("txt-username"));
		usr_name.sendKeys("John Doe");
		WebElement pas_word=driver.findElement(By.id("txt-password"));
		pas_word.sendKeys("ThisIsNotAPassword");
		
		driver.findElement(By.id("btn-login")).click();
	  }
  
  
  @Test(priority=4)
  void verify_dashboard_text() {
	  driver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/div/h2")).getText();
  
  }
  
  @Test(priority=5)
  
  void verify_logout_button_func() {
	  driver.findElement(By.xpath("//*[@id=\"menu-toggle\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")).click();
	  
	  driver.quit();
	  
	  
	  
	  
  
  
}
}