package callHub;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	public ConfigReader() {
		prop = new Properties();
		try(InputStream inputStream = ConfigReader.class.getResourceAsStream("contactBook.properties")) {
			prop.load(inputStream);
		}catch(Exception e) {
			System.out.println("Unable to find the specified properties file");
			e.printStackTrace();
			return;
		}
	}

	//Method to get name1 from property file
	public String getName1() {
		return prop.getProperty("name1");
	}

	//Method to get name1 from property file
	public String getName2() {
		return prop.getProperty("name2");
	}
		
	//Method to get phonenumber1 from property file
	public String getPhone1() {
		return prop.getProperty("name1ph");
	}
	
	//Method to get phonenumber2 from property file
	public String getPhone2() {
		return prop.getProperty("name2ph");
	}

}
