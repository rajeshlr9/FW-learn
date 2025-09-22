package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	

	public WebDriver Idriver;
	
	
	
	public LoginPage(WebDriver rdriver)
	{
		
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
			
	
	//input[@name='username']
	//input[@name='password']
	//button[@type='submit']
	
	public WebElement un = username;
	
	public void enteruserid()
	{
		
		username.sendKeys("Admin");
		
	}
	
	public void enterpwd()
	{
		password.sendKeys("admin123");
		
		
	}
	
	public void clicklogin() {
	
	loginbutton.click();
	}
	
	public void enteruserid(String name)
	{
		
		username.sendKeys(name);
		
	}
	
	public void enterpwd(String pwd)
	{
		password.sendKeys(pwd);
		
		
	}
	
	
	public void enterpwd(String pwd,String uname)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		
		
	}
	
	
  
}
