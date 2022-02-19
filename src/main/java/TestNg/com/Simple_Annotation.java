package TestNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation { 
	@BeforeSuite
	private void setproperty() {
		System.out.println("set property");
	}
	@BeforeTest
	private void driver() {
		System.out.println("driver creating");
	}
	@BeforeClass
	private void browser() {
		System.out.println("launching browser");
	}
	@Test
	private void men() {
		System.out.println("men");
}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
	@AfterMethod
	private void signoff() {
		System.out.println("signoff");
	}
	@AfterClass
	private void browser1() {
		System.out.println("closing browser");
	}
	@AfterTest
	private void driver1() {
		System.out.println("closing driver");
	}
	@AfterSuite
	private void set() {
		System.out.println("closing all");
	}
	@Test
	private void women() {
		System.out.println("women");
	}
	@Test
	private void child() {
		System.out.println("child");
	}
}
