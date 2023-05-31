package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demotestNG {
	
	@Test(priority =3)
	public void createTest() {
		Reporter.log("hi",true);
		
	}
	@Test(priority =1, dependsOnMethods ="createTest")
	public void modifyTest() {
		Reporter.log("bye",true);
		
	}
	@Test(priority =2, dependsOnMethods ="modifyTest")
	public void deleteTest() {
		Reporter.log("hello",true);
		
	}
}
