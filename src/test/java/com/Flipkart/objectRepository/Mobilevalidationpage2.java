package com.Flipkart.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Resources.CommonActions;

public class Mobilevalidationpage2 extends CommonActions {

	
	public Mobilevalidationpage2(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input)[1]")
	private WebElement search;
	@FindBy(xpath="(//button)[2]")
	private WebElement closeicon;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCloseicon() {
		return closeicon;
	}
}
