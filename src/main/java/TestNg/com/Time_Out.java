package TestNg.com;

import org.testng.annotations.Test;

public class Time_Out {
	@Test(timeOut=8000)
	private void launch_browser() throws InterruptedException {
		System.out.println("Browser launch");
		Thread.sleep(5000);
		System.out.println("username");
		System.out.println("password");
		System.out.println("login");
		Thread.sleep(3000);
		Thread.sleep(4000);
		System.out.println("navigate to home page");
		
	}

}
