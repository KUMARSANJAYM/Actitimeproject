package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy(id="logoutLink")
	private WebElement lgobtn;
	
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
		
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogout() {
		
		lgobtn.click();
	}


	public WebElement getTaskbtn() {
		return taskbtn;
	}

	
	

}
