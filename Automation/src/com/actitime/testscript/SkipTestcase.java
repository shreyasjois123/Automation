package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTestcase {
		
		
		@Test(priority =3)
		public void createTest() {
			Reporter.log("hi",true);
			
		}
		@Test(enabled = false)
		public void modifyTest() {
			Reporter.log("bye",true);
		
			
		}
		@Test(priority =2)
		public void deleteTest() {
			Reporter.log("hello",true);
			
		}
	}
