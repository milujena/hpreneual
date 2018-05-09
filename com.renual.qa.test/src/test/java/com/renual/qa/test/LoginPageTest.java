package com.renual.qa.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.renual.qa.generic.TestBase;
import com.renual.qa.pages.LoginPage;

@Listeners(com.renual.qa.takeScreenShot.ListenersTest.class)

public class LoginPageTest extends TestBase{
	
	
	@Test
	public void loginTest()
	{
		LoginPage lp=new LoginPage();
		lp.user_name("milu123");
		lp.pass_word("milu123");
		lp.login_btn();
		 
	}
	/*@Test
	public void demodataproviser() 
	{
	
		
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("milu123");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("milu123");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    Assert.assertEquals(driver.getTitle(), "CRMPRO","title is not maching so fail");
		    
		    
	}
	*/

}
