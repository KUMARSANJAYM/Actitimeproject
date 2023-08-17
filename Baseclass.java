package com.acttime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.homepage;
import com.actitime.pom.loginpage;

public class baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		driver=new ChromeDriver();
		//driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		FileInputStream fis=new FileInputStream("./data/comondata.property");
		Properties p=new Properties();
		p.load(fis);
		
		 String url = p.getProperty("url");
		 String un = p.getProperty("un");
		 String pwd = p.getProperty("pwd");
		
		driver.get(url);
		loginpage l= new loginpage(driver);
		l.setlogin(un, pwd);
	}
	
	@AfterMethod
	public void logout() {
		homepage h=new homepage(driver);
		h.setlogout();
	}

}
