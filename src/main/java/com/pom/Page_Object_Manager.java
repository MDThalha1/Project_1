package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
private Login ln;
private Search si;
private Continue c;
private Booking b;
public WebDriver driver;
private Login Login;
private Search Search;
private Continue Continue;
private Booking Booking;
public Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public Login getinstancelogin() {
	if (ln == null) {
		 Login =new Login(driver);
	}
	return Login;
}
public Search getinstantsearch() {
	if (si ==null) {
		Search =new Search(driver);
		
	}
	return Search;	
}
public Continue getinstantcontinue() {
	if (c ==null) {
		Continue =new Continue(driver);
		
	}
	return Continue;
}
public Booking getinstantbooking() {
	if (b ==null) {
		Booking =new Booking(driver);
		
	}
	return Booking;
}	
}
