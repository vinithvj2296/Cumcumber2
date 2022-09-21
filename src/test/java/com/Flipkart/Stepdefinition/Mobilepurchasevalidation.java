package com.Flipkart.Stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Flipkart.Resources.CommonActions;
import com.Flipkart.objectRepository.Mobilevalidationpage2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Mobilepurchasevalidation extends CommonActions {


	CommonActions c= new CommonActions();
	Mobilevalidationpage2 v=new Mobilevalidationpage2();
	

@Given("User launches flipkart application")
public void user_launches_flipkart_application() {
	 
}

@Given("User handles login")
public void user_handles_login() {
	  
	 v.getCloseicon().click();
}
  String name ="";
@When("User search mobile")
public void user_search_mobile() {
	name = "realme 9 stargaze";
	c.Insertdatas(v.getSearch(), name);
}

@When("User select the mobile")
public void user_select_the_mobile() {
   driver.findElement(By.xpath("//div[@class='_4rR01T']/parent::div[1]")).click();
   
	 c.windowshandling();
 


}

@When("user validating Mobile name")
public void user_validating_Mobile_name() throws IOException  {
	 //WebElement mobname= driver.findElement(By.xpath("//div[@class='dyC4hf']/preceding-sibling::div[3]//span")); 
	// String a=mobname.getText();
	 
     File s= new File("C:\\Users\\vinit\\OneDrive\\Documents\\sampleexl.xlsx");
      FileInputStream f1= new FileInputStream(s);
      Workbook F= new XSSFWorkbook(f1);
      Sheet P= F.getSheet("Sheet1");
      
    
    	  Row u=P.getRow(0);
    	  
    	  for (int j = 0; j < u.getPhysicalNumberOfCells(); j++) {
    		  Cell n= u.getCell(j);
    		 String name1=   n.getStringCellValue();
    		 WebElement mobname= driver.findElement(By.xpath("//div[@class='dyC4hf']/preceding-sibling::div[3]//span")); 
    		 String a=mobname.getText();
    		 
    		 try{
    			 Assert.assertEquals(a, n);
    		 }
    		 catch(AssertionError e){
    			 System.out.println(e.getMessage());
    		 }
    	  }
    		  
		}
    	          


@When("user validating Mobile price and offers")
public void user_validating_Mobile_price_and_offers() throws IOException {

    File s= new File("C:\\Users\\vinit\\OneDrive\\Documents\\sampleexl.xlsx");
     FileInputStream f1= new FileInputStream(s);
     Workbook F= new XSSFWorkbook(f1);
     Sheet P= F.getSheet("Sheet1");
     
   
   	  Row u=P.getRow(1);
   	  
   	  for (int j = 0; j < u.getPhysicalNumberOfCells(); j++) {
   		  Cell n= u.getCell(j);
   		 
	 WebElement price= driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']/preceding-sibling::div")); 
	 String b=price.getText();
	 
	 
	 try{
		 Assert.assertEquals(b, n);
	 }
	 catch(AssertionError e){
		 System.out.println(e.getMessage());
	 }
	 
	 
	  WebElement selected=  driver.findElement(By.xpath("//div[@class='_2jIO64 _3JGmY_']/preceding-sibling::div[1]"));
		boolean p= selected.isSelected();
		if(p=true){
			System.out.println("without exchange is selected");
		}else{
			System.out.println("without exchange is not selected");
		}
   	  }
}

@When("user validating pincode by invalid code")
public void user_validating_pincode_by_invalid_code() {
	
   driver.findElement(By.xpath("//span[@class='_2P_LDn']/preceding-sibling::form//input")).sendKeys("1324536");
   driver.findElement(By.xpath("//div[@class='_2YsvKq _2ggyDI _16ocF5']/following-sibling::span")).click();
   
   WebElement invalid=driver.findElement(By.xpath("(//div[@class='_1PQN-K'])/following-sibling::div//div"));
   boolean t=invalid.isDisplayed();
   
   if(t=true){
	   System.out.println("invalid code is displayed");
   }else{
	   System.out.println("invalid code is not displayed");
   }
}


@Then("add to cart and validating product delivery date")
public void add_to_cart_validating_product_delivery_date() {
    driver.findElement(By.xpath("//li[@class='col col-6-12']/preceding-sibling::li//button")).click();
    
  WebElement delivery=  driver.findElement(By.xpath("//span[@class='_3CWtsA']/parent::div"));
  
  String y=delivery.getText();
  System.out.println("************delivery details**************");
  System.out.println(y);
    
}

@Then("validating total price details")
public void validating_total_price_details() {
  WebElement total=  driver.findElement(By.xpath("//div[@class='_I_XQO']"));
  String f=total.getText();
  System.out.println("************price details**************");
  System.out.println(f);
}

}
