package stepsDef;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.ast.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectClasses.LoginPage;
import utilities.ExcelDataReading;



   


public class LoginSteps  {
 
	//WebDriverManager.chromedriver().setup();
	ChromeDriver cd = new ChromeDriver();
	LoginPage lp = new LoginPage(cd);
	ExcelDataReading ex = new ExcelDataReading();
	 
	
	BaseCCCC bc = new BaseCCCC();
	
  
	@Given("User launches browser")
	public void user_launches_browser() throws IOException {
	   System.out.println(" This is launche browser with given ");
	
	   cd.manage().window().maximize();
	   
	   System.out.println(Thread.currentThread().getId());
	   
	   
	   
	}

	@When("user opens orange hrm url")
	public void user_opens_orange_hrm_url() throws IOException {
		   System.out.println(" This is open url with when ");
	   
	
		  
		  String urll = bc.urlfromproperties();
		  
    //    cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		 cd.get((String) urll);  
		 
		
		 
		   
	}

	@And("Enter username and password")
	public void enter_username_and_password() throws IOException, InterruptedException {
		 System.out.println(" This is enter username and password with and ");
		 
		 
		 cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 
		 //Thread.sleep(15000);
		 
	//HashMap hmp = ex.readexceldata(2);
		// String id = (String) hmp.get("UserName");
		//	String pwd = (String) hmp.get("Password");
	
		 Set data = ex.readexceldata(2);
	
		 List ll = new ArrayList(data);
	
		  String id = (String) ll.get(0);
			String pwd = (String) ll.get(1);
		 
	 lp.enteruserid(id);
	 lp.enterpwd(pwd);
		
	 
	 //lp.enteruserid();
	 //lp.enterpwd();
	    
		//    String name= bc.username();
		//	String pwd = bc.PWD();
		 
	//	lp.enterpwd(pwd, name);
		
		
	}

	@And("click on login")
	public void click_on_login() {
		 System.out.println(" This is enter click login with and ");
		 
		 lp.clicklogin();
	}

	@Then("HRM home page should be displayed")
	public void hrm_home_page_should_be_displayed() {
		 System.out.println(" This is to validate Homepage after login with then ");
	   cd.close();
		 
		 
	}
  
  
  
	@When("user opens orange hrm url {string}")
	public void user_opens_orange_hrm_url(String url) {
		
		cd.get(url);
		 
	
		//WebElement un =  cd.findElement(By.xpath("//input[@name='username']"));
		
		WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		//wait.until(ExpectedConditions.visibilityOf(un);
		
	    
	}

	@When("Enter {string} and {string}")
	public void enter_and(String username, String password) {
		
		lp.enteruserid(username);
		lp.enterpwd(password);
		
	    
	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
