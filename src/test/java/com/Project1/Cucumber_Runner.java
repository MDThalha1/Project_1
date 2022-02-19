package com.Project1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feat",
glue="com.adactin.sd"
		

		)
public class Cucumber_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
		System.out.println("a");
		driver=Base_P.getBrowser("chrome");
	}
	@AfterClass
	public static void tear_down() {
	driver.quit();

	}

}
