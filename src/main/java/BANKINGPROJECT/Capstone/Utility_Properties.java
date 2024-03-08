package BANKINGPROJECT.Capstone;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility_Properties {
	
	public  static String GetData(String Key) throws Exception{
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Capstone\\src\\main\\java\\BANKINGPROJECT\\Capstone\\Feature.properties");
		Properties p = new Properties();
		p.load(fis);
		String Value = p.getProperty(Key);
		return Value;
	}

}
