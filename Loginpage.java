package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setlogin(String us, String pw) {
		untbx.sendKeys(us);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	

}
