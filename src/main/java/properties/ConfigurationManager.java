package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ConfigurationManager {
	
	public static Properties p;
	
	public ConfigurationManager() throws IOException {
		
		File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\main\\java\\properties\\Adacitin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
	}

	
	public String getUsername() {
		
		String username = p.getProperty("username");
		
		return username;
	}
	
	public String getPassword() {
		
		String password = p.getProperty("password");
		
		return password;
	}
}
