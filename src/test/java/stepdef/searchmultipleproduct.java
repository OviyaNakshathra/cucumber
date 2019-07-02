package stepdef;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchmultipleproduct {
	@When("user search for product")
	public void user_search_for_product(io.cucumber.datatable.DataTable dataTable) {
	    List<String> productsname=dataTable.asList();
	    for(String products:productsname)
	    	System.out.println(products);
	}

	@When("verify and display")
	public void verify_and_display() {
		System.out.println("displayed");
	}

	@Then("close application")
	public void close_application() {
		System.out.println("closed");                 
	}
}
