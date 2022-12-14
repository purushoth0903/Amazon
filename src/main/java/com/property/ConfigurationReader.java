package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	private Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\purushoth\\eclipse-workspace\\AmazonProject\\src\\main\\java\\com\\property\\amazon.properties");
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
