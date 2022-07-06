package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws IOException 
	{
		String path = "C:/Users/ACER/eclipse-workspace/First_FrameWork/Config/config.Properties";
		
		FileInputStream fis = new FileInputStream(path);
		
	    pro = new Properties();
		pro.load(fis);
	}
	public String get1BaseUrl_QA1()
	{
	  return pro.getProperty("BaseUrl_QA1");
	}
}
