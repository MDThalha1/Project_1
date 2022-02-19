package TestNg.com;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = NullPointerException.class)
	private void features() {
		int a=10;
		System.out.println(a/0);
	}

}
