package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario {
	WebDriver driver;
	@Given("opens newtours app")
	public void opens_newtours_app() {
	  System.out.println("user opens the application");
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
	}

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		 System.out.println("enter the valid username and password: username "+string+" "+"password "+string2);
		 WebElement unametext=driver.findElement(By.name("userName"));
			unametext.sendKeys(string);
			WebElement upasstext=driver.findElement(By.name("password"));
			upasstext.sendKeys(string2);
		 
	}

	@When("submit login form")
	public void submit_login_form() {
		 System.out.println("user submits the login");
		 WebElement login=driver.findElement(By.name("login"));
			login.click();
	}

	@Then("verify pass")
	public void verify_pass() {
		 System.out.println("verify the valid credentials");
	}

	@Then("verify fail")
	public void verify_fail() {
		 System.out.println("verify the invalid credentials");
	}



}
