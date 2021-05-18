package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.Base;
import BaseClasses.Constance;

public class HomePageP extends Base {
public HomePageP()
{
	PageFactory.initElements(Constance.driver, this);
}
@FindBy(xpath = "//a[@class=\"nav-link nav-right-cutom-bg-1 font-weight-bold\"]")
WebElement signup;
public WebElement signup()
{
	return signup;
}
}
