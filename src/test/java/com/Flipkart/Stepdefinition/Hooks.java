package com.Flipkart.Stepdefinition;

import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions {
	CommonActions c= new CommonActions();
	@Before
	public void beforescenario(){
		System.out.println("beforescenario");
		c.Launch("https://www.flipkart.com/");
		
	}
	@After
	public void Afterscenario(){
		System.out.println("Afterscenario");
	}

}
