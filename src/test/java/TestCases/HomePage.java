package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClasses.Base;
import BaseClasses.Constance;
import PageObjectClasses.HomePageP;

public class HomePage extends Base {
	@BeforeTest
	public void url() throws IOException {
		initdriver();
		Constance.driver.get(prop.getProperty("url"));
	}

	@Test
	public void signup_click() 
	{
		HomePageP p =new HomePageP();
		wait1();
        p.signup().click();
	}
	
}
