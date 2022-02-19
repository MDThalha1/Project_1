package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
@FindBy(xpath="//input[@name='first_name']")
private WebElement FN;
@FindBy(xpath="//input[@name='last_name']")
private WebElement LN;
@FindBy(xpath="//textarea[@name='address']")
private WebElement address;
@FindBy(xpath="//input[@name='cc_num']")
private WebElement ccnum;
@FindBy(xpath="//select[@name='cc_type']")
private WebElement ccType;
@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement expDate;
@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement expyear;
@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement ccv;
@FindBy(xpath="//input[@name='book_now']")
private WebElement book;
@FindBy(xpath="//input[@value='My Itinerary']")
private WebElement iter;
private WebDriver driver;
public WebElement getFN() {
	return FN;
}
public WebElement getLN() {
	return LN;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCcType() {
	return ccType;
}
public WebElement getExpDate() {
	return expDate;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCcv() {
	return ccv;
}
public WebElement getBook() {
	return book;
}
public WebElement getIter() {
	return iter;
}
 public Booking(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 
}
}