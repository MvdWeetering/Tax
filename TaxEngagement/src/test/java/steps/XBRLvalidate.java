package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class XBRLvalidate {
	@Given("^the reading of the XBRL is correct$")
	public void the_reading_of_the_XBRL_is_correct() throws Throwable {
	  System.out.println("reading XBRL");
	   
	}

	@Given("^the reading of the XLS is correct$")
	public void the_reading_of_the_XLS_is_correct() throws Throwable {
		System.out.println("reading XLS");
	   
	}

	@When("^the elements of the XBRL and the XLS are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_are_compared() throws Throwable {
		System.out.println("compared");
	    
	}

	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {
		System.out.println("confirm");
	    
	}

}
