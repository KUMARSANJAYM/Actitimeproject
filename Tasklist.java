package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasklist {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addcustomer;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcostomerbtn;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement custnametxb;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement dibtn;
	
	@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
	private WebElement scustbtn;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class=\"itemRow cpItemRow \"]")
	private WebElement selectcbtn;
	
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement ccbtn;
	
	public tasklist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddcustomer() {
		return addcustomer;
	}


	public WebElement getNewcostomerbtn() {
		return newcostomerbtn;
	}


	public WebElement getCustnametxb() {
		return custnametxb;
	}


	public WebElement getDibtn() {
		return dibtn;
	}


	public WebElement getScustbtn() {
		return scustbtn;
	}


	public WebElement getSelectcbtn() {
		return selectcbtn;
	}


	public WebElement getCcbtn() {
		return ccbtn;
	}
	


}
