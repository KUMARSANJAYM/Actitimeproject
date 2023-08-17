package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.homepage;
import com.actitime.pom.tasklist;
import com.acttime.generic.baseclass;

@Listeners(com.acttime.generic.listenerimplimentation.class)
public class createcustomer extends baseclass {
	
	@Test
	public void testcreatecustomer() {
		
		homepage h=new homepage(driver);
		h.getTaskbtn().click();
		
		tasklist t=new tasklist(driver);
		t. getAddcustomer().click();
		t.getNewcostomerbtn().click();
		t.getCustnametxb().sendKeys("HDFC--01");
		t. getDibtn().sendKeys("banking project");
		t.getScustbtn().click();
		t.getSelectcbtn().click();
		t.getCcbtn().click();
	}
	

}
