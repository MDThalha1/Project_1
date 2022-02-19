package TestNg.com;

import org.testng.annotations.Test;

public class Priority_Test {
@Test
private void hsc() {
	System.out.println("HSC");
}
@Test(priority = -1)
private void sslc() {
	System.out.println("SSLC");
}
@Test(priority=1)
private void university() {
	System.out.println("University");
}
@Test(priority=2)
private void job() {
	System.out.println("Job");
}
	
}

