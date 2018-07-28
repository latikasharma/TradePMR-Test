package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configurationProvider.ConfigDataProvider;



public class Browserfactory {
	
static WebDriver driver;

public static WebDriver getBrowser(String browsername) {
	
	if(browsername.equalsIgnoreCase("firefox"))
	{driver = new FirefoxDriver();}
	
	else if(browsername.equalsIgnoreCase("IE"))
	{	ConfigDataProvider config =  new ConfigDataProvider();	
		
	System.setProperty("webdriver.ie.driver",config.getIePath());
	driver = new InternetExplorerDriver();	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	return driver;
	
}

//public static void closeBrowser(WebDriver ldriver) {
	//ldriver.quit();


}
