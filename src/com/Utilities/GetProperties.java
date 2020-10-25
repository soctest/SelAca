package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetProperties {

	private Properties properties = new Properties();
	
	public GetProperties() {
		try {
			File src = new File("./configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			properties.load(fis);
		} catch (Exception e) {
			System.out.println("Has ocurred an exception: "+ e.getMessage());
		}
	}
	
	public String getString(String propName) {
		return properties.getProperty(propName);
	}
}
