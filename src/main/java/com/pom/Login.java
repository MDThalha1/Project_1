package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Login {
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	private WebDriver driver;
	public WebElement getLogin() {
		return login;
	}
	public Login(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
}