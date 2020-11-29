package com.demo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	public static String getProperty (String value) throws IOException {
		String path = System.getProperty("user.dir") + "/config.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		prop.load (fs);
		value = prop.getProperty(value).trim();
		return value;
	}
	
}
