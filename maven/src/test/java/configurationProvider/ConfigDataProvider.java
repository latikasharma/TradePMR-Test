package configurationProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	 Properties pro;
	
	public  ConfigDataProvider() {
		
	File src = new File("./Configuration/config.properties");{
	FileInputStream fis;
	try {
		fis = new FileInputStream(src);
		 pro =  new Properties();
		 pro.load(fis);
		
	}   
	     catch(IOException e) {
		System.out.println("Exception is"+e.getMessage());
	}
    }
}

public String getApplicationURL()
{
	String url = pro.getProperty("url");
	return url;
}

public  String getIePath()
{
	String Ie = pro.getProperty("IePath");
	return Ie;
}
}