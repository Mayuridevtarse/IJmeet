package BaseClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public Properties prop;

public void initdriver() throws IOException
{
	prop=new Properties();
	String dir= System.getProperty("user.dir");
    FileInputStream fis=new FileInputStream(dir+"/src/main/resources/data.properties");
	System.out.println("readr from property file \n"+dir);
	prop.load(fis);
	prop.getProperty("browser");
	String brosername=prop.getProperty("browser");
	
	if (brosername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		Constance.driver = new ChromeDriver();
	} else if (brosername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		Constance.driver = new FirefoxDriver();
	} else if (brosername.equalsIgnoreCase("IE")) {
		WebDriverManager.iedriver().setup();
		Constance.driver = new InternetExplorerDriver();
	}

}
public void ScreenShot(String testcasename) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)Constance.driver;
	File sources=ts.getScreenshotAs(OutputType.FILE);
	String  destination=System.getProperty("user.dir")+"\\Screenshots\\"+testcasename+".png";
	FileUtils.copyFile(sources,new File(destination));
	
}
public void wait1()
{
	Constance.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				

}

}
