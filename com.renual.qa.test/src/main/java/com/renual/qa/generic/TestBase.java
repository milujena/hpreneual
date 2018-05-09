package com.renual.qa.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeClass
	public void precondition() throws IOException
	{
	
		Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("D:\\Project Management\\com.renual.qa.test\\src\\main\\java\\com\\renual\\qa\\generic\\config.properties");
	prop.load(ip);
		
		
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","D:\\Project Management\\com.renual.qa.test\\driver\\chromedriver.exe" );
	    driver=new ChromeDriver();
	} 
	else if(browserName.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Project Management\\com.renual.qa.test\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	@AfterClass
	public void postconditon()
	{
		driver.close();
	}
	


}
