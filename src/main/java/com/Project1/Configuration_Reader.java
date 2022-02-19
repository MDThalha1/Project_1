package com.Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\Mt\\eclipse-workspace\\Project1\\src\\main\\java\\com\\configuration\\Singleton.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	public String get_url() throws Throwable {
		
		String url = p.getProperty("url");
		return url;
	}
	public String get_Username() throws Throwable{
		String username = p.getProperty("username");
		return username;

	}
	public String get_password() throws Throwable {
		String password = p.getProperty("password");
		return password;
	}
	

}
