package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example1 {
	WebDriver driver;
	@Given("user opens the login page in newtours application")
	public void user_opens_the_login_page_in_newtours_application() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://www.newtours.demoaut.com/");
	}

	@When("user enters the username {string} and password as {string}")
	public void user_enters_the_username_and_password_as(String string, String string2) {
		System.out.println("enter the valid username and password: username "+string+" "+"password "+string2);
		PageObject login=PageFactory.initElements(driver,PageObject.class);
		 login.un.sendKeys(string);
		 login.pwd.sendKeys(string2);

	}

	@When("Click Submit button")
	public void click_Submit_button() {
		 System.out.println("user submits the login");
		 WebElement login=driver.findElement(By.name("login"));
			login.click();
	}

	@Then("verify login success")
	public void verify_login_success() {
	  System.out.println("verified");
	}


}
