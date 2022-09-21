package com.Flipkart.Resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	public void windowshandling(){
		  
		  String parent=  driver.getWindowHandle();
		     
	  		Set<String>child=driver.getWindowHandles();
	  		
	  		for(String v:child){
	  			if(!parent.equals(v)){
	  				driver.switchTo().window(v);
	  			}
	  		}
		  
	  }
	public void Launch(String url){
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			 driver.navigate().to(url);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	 public void Insertdatas(WebElement ele,String value){
			
		  ele.sendKeys(value,Keys.ENTER);
	  }
}
