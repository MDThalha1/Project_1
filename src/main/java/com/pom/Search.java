package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;

	public WebElement getRoom() {
		return room;
	}
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement nos;

	public WebElement getNos() {
		return nos;
	}
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;

	public WebElement getCheckin() {
		return checkin;
	}
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	private WebDriver driver;

	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	public Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
