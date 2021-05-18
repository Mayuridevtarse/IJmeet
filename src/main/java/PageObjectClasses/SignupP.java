package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClasses.Constance;

public class SignupP {

	public SignupP() {
		PageFactory.initElements(Constance.driver, this);
	}

	@FindBy(css = "input#name")
	WebElement First_Name;

	public WebElement First_name() {
		return First_Name;
	}

	@FindBy(css = "input#company_name")
	WebElement company_name;

	public WebElement Company_name() {
		return company_name;

	}

	@FindBy(css = "input[placeholder=\" Enter email id \"]")
	WebElement email;

	public WebElement Email() {
		return email;
	}

	@FindBy(css = "input[placeholder=\" Enter mobile number \"]")
	WebElement Mobile_No;

	public WebElement Mobile_No() {
		return Mobile_No;
	}

	@FindBy(css = "input[placeholder=\" Enter password \"]")
	WebElement pwd;

	public WebElement Password() {
		return pwd;
	}

	@FindBy(xpath = "//a[@class=\"btn btn-outline-default btn-outline-secondary\"][1]/em")
	WebElement pwd_eye;

	public WebElement Visible_Password() {
		return pwd_eye;
	}

	@FindBy(xpath = "//a[@class=\\\"btn btn-outline-default btn-outline-secondary\\\"][2]/em")
	WebElement Password_info_symbol;

	public WebElement Password_info_symbol() {
		return Password_info_symbol;
	}
}
