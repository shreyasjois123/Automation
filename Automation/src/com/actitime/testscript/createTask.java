package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule extends BaseClass{
	@Test
	public void createTask() {
		Reporter.log("Create Task",true);
	}
	@Test
	public void ModifyTask() {
		Reporter.log("Modify Task",true);
	}
	@Test
	public void DeleteTask() {
		Reporter.log("delete Task",true);
	}

}
