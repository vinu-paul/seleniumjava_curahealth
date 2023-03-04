package com.curahealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Test {
	WebDriver driver;
	
  @Test(priority =1)
      void openApp() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://katalon-demo-cura.herokuapp.com/");
	  }
  
  @Test(priority =2)
  void title_verification() {
	  
	  driver.findElement(By.xpath("//*[@id=\"top\"]/div/h1")).getText();
  }
  
  @Test(priority =3)
  void footer_text_verification() {
	  driver.findElement(By.xpath("/html/body/footer/div/div/div/h4/strong")).getText();
  }
  
  
  
  @Test(priority =4)
  void navigate_to_login_page() {
	  
	  driver.findElement(By.id("btn-make-appointment")).click();
  }
  
  
  
	  
  
	  
     
	  
  }

