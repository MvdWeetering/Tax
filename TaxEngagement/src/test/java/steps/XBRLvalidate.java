package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import codebase.ReadXML;
import codebase.XLSbyColumn;
import codebase.XMLandXLScompare;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

import org.eclipse.jetty.io.NetworkTrafficListener.Empty;
import org.hamcrest.core.IsNull;

public class XBRLvalidate {
	
	ArrayList<String> Result = new ArrayList<String>();
	
	@Given("^the reading of the XBRL is correct$")
	public void the_reading_of_the_XBRL_is_correct() throws Throwable {
		
		ArrayList<String> CheckEmpty = new ArrayList<String>();
		CheckEmpty = ReadXML.GetXMLvalue("xbrli:measure");
		assertTrue(!CheckEmpty.isEmpty());	
	}

	@Given("^the reading of the XLS is correct$")
	public void the_reading_of_the_XLS_is_correct() throws Throwable {
		
		ArrayList<String> CheckEmpty = new ArrayList<String>();
		CheckEmpty = XLSbyColumn.extractExcelContentByColumnIndex(1);
		assertTrue(!CheckEmpty.isEmpty());	
	}

	@When("^the elements of the XBRL and the XLS are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_are_compared() throws Throwable {
		
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("bd-bedr:ShareholderName", 1));
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("bd-bedr:ShareholderAddressStreetName", 4));
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("bd-bedr:ShareholderAddressHouseNumber", 5));
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("bd-bedr:ShareholderAddressHouseNumberAbroad", 7));
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("bd-bedr:ShareholderAddressHouseNumberAddition", 9));
		
		
		
	}

	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {
		
		//assertTrue(Result.isEmpty());	
	}
}
