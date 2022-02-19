package TestNg.com;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority=-1)
	private void setproperty() {
		System.out.println("setproperty");
	}
	@Test(priority=0)
	private void browserLaunch() {
		System.out.println("browser launch");
	}
	@Test(priority=0)
	private void url() {
		System.out.println("url");
	}
	@Test(priority=1,invocationCount=2)
	private void Refresh() {
		System.out.println("Refresh");
	}

}
