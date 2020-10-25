package com.Utilities;

import java.io.InputStream;
import java.util.Properties;

public class GetProperties {

	private Properties properties = new Properties();
	
	public GetProperties() {
		InputStream config = getClass().getResourceAsStream("/config.properties");
		
		try {
			properties.load(config);
		} catch (Exception e) {
			System.out.println("Has ocurred an exception"+ e.getMessage());
		}
	}
	
	public String getString(String propName) {
		return properties.getProperty(propName);
	}
}
