package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class background {
	@Given("displays Welcome message")
	public void displays_Welcome_message() {
	    System.out.println("Welcome");
	}

	@Given("username and pwd is entered")
	public void username_and_pwd_is_entered() {
		 System.out.println("user name pwd");
	}

	@Given("click signin")
	public void click_signin() {
		 System.out.println("login");
	}

	@When("product to searched is entered")
	public void product_to_searched_is_entered() {
		 System.out.println("product");
	}

	@When("product  searched is added to cart")
	public void product_searched_is_added_to_cart() {
		 System.out.println("cart");
	}

	@When("product to be purchased is payed using netbanking")
	public void product_to_be_purchased_is_payed_using_netbanking() {
		 System.out.println("payed");
	}

	@When("user performs logout")
	public void user_performs_logout() {
		 System.out.println("logout");
	}


}
