package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void setAddNewBtn() {
		addNewBtn.click();
	}

}
