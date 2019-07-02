package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Inputs {
	WebDriver driver;
	@Given("user login to newtours")
	public void user_login_to_newtours() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\selinium path\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://www.newtours.demoaut.com/");
		    WebElement reg=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		    reg.click();
	}
	@When("user enters the fn as {string}")
	public void user_enters_the_fn_as(String fn) {
	  System.out.println("user first name is "+fn);
	  WebElement firstname=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	  firstname.sendKeys(fn);	  
	}

	@When("user enters the ln as {string}")
	public void user_enters_the_ln_as(String ln) {
		System.out.println("user last name is "+ln);
		WebElement lastname=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		  lastname.sendKeys(ln);	
	}

	//@When("user enters the dob as {string}")
	//public void user_enters_the_dob_as(String dob) {
		//System.out.println("user first name is "+dob);
	//}

	@When("user enters the pwd as {string}")
	public void user_enters_the_pwd_as(String pwd) {
		System.out.println("user first name is "+pwd);
		WebElement pass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		  pass.sendKeys(pwd);	
		
	}

	@When("user enters the conpwd as {string}")
	public void user_enters_the_conpwd_as(String conpwd) {
		System.out.println("user first name is "+conpwd);
		WebElement conpass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
		  conpass.sendKeys(conpwd);	
	}

	@Then("click submit button")
	public void click_submit_button() {
		System.out.println("click submit");
		WebElement submit=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
	    submit.click();
	}

	@Then("verify the signup Success message")
	public void verify_the_signup_Success_message() {
		
		System.out.println("verified");
	}
	@When("user enters the ph as {string}")
	public void user_enters_the_ph_as(String ph) {
		WebElement phone=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
		  phone.sendKeys(ph);	
		
	}

	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String email) {
		WebElement em=driver.findElement(By.xpath("//*[@id='userName']"));
		  em.sendKeys(email);	
	   
		
	}

	@When("user enters the addre as {string}")
	public void user_enters_the_addre_as(String addre) {
		WebElement address=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		  address.sendKeys(addre);
	    
	}

	@When("user enters the city as {string}")
	public void user_enters_the_city_as(String city) {
		WebElement ct=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
		  ct.sendKeys(city);
	}

	@When("user enters the state as {string}")
	public void user_enters_the_state_as(String state) {
		WebElement st=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		  st.sendKeys(state);
	}

	@When("user enters the code as {string}")
	public void user_enters_the_code_as(String code) {
		WebElement cd=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
		  cd.sendKeys(code);
	}

	@When("user enters the un as {string}")
	public void user_enters_the_un_as(String un) {
		WebElement username=driver.findElement(By.xpath("//*[@id='email']"));
		  username.sendKeys(un);
	    
	}



}
