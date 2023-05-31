package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class Customermodule extends BaseClass {
	@Test
	public void createCustomer() {
		Reporter.log("CreateCustumer",true);
		Assert.fail();
		
	}
	
}
