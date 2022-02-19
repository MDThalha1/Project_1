package TestNg.com;

import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test(enabled=false)
	private void whatsapp() {
		System.out.println("whatsapp");
	}
	@Test
	private void facebook() {
		System.out.println("facebook");
	}
	@Test
	private void spotify() {
		System.out.println("spotify");	
	}
	@Test
	private void wynk() {
		System.out.println("wynk");
	}
	
}
