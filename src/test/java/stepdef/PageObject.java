package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
	WebDriver driver;
	//PageObject(){
		//PageFactory.initElements(driver,this.driver);
	//}

	@FindBy(name="userName") public static WebElement un; 
	@FindBy(name="password") public static WebElement pwd;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")public static WebElement ok;
             public void login()
             {
            	 un.sendKeys("mercury");
            	 pwd.sendKeys("mercury");
            	 ok.click();
             }
}
