package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws InterruptedException {
		Reporter.log("Create Customer");
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.setAddNewBtn();
		Thread.sleep(3000);
		
	}

}
