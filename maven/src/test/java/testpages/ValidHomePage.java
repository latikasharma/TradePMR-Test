package testpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import configurationProvider.ConfigDataProvider;
import factory.Browserfactory;
import pages.HomePage;

public class ValidHomePage {
	
	@Test
	public void testHomePage() {
	
		WebDriver driver = Browserfactory.getBrowser("IE");
		ConfigDataProvider config =  new ConfigDataProvider();	
		driver.get(config.getApplicationURL());
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.fName();
		home.lName();
		home.email();
		home.Password();
		home.confirm();
		home.agen();
		home.phone();
		home.ssn();
		home.clear();
	    home.Password1();	    
	    home.age();
	    home.name();
		
	    
	    
	    
	    //Assert.assertEquals(actual, expected);
		
		//Browserfactory.closeBrowser(driver);
		
			

}
}