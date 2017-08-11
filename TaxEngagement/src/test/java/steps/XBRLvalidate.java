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
		CheckEmpty = XLSbyColumn.extractExcelContentByColumnIndex("Algemene_gegevens", 1);
		assertTrue(!CheckEmpty.isEmpty());	
	}

	@When("^the elements of the XBRL and the XLS for Specificatie aandeelhouders are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Specificatie_aandeelhouders_are_compared() throws Throwable {
		
		//Naam aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderName", 1));
		
		//Straatnaam adres aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderAddressStreetName", 4));
		
		//Huisnummer adres aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderAddressHouseNumber", 5));
		
		//Huisnummer buitenlands adres
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderAddressHouseNumberAbroad", 6));
		
		//Huisnummertoevoeging adres aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderAddressHouseNumberAddition", 8));
		
		//Woonplaats aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderAddressPlaceOfResidence", 9));
		
		//Woon- vestigingsland aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderResidenceEstablishmentCountryCode",10 ));
		
		//Nominale waarde gewone aandelen
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderOrdinarySharesNominalValue", 11 ));
		
		//Nominale waarde preferente aandelen einde boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderPrefenceSharesNominalValue",12  ));
		
		//Nominale waarde prioriteitsaandelen einde boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderPrioritySharesNominalValue", 13 ));
		
		//Percentage nominaal geplaatst kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderIssuedCapitalPercentage", 14 ));
		
		//Vordering belastingplichtige op aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderClaimTaxpayerOnShareholder", 15 ));
		
		//In het boekjaar ontvangen rente van de aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInterestReceived",17 ));
		
		//Schuld belastingplichtige aan aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderTaxpayerDebtToShareholder",16));
		
		//In dit boekjaar betaalde rente aan de aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInterestPaid", 18 ));
		
		//Informele kapitaalstorting door of via deze aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalThroughOrByThisShareholder", 19 ));
		
		//Omvang informele kapitaalstorting door of via deze aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalSizeThroughOrByThisShareholder",20  ));
		
		//Omschrijving mening informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalOpinionDescription", 21 ));
		
		//Naam uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyName",22));
		
		//Straatnaam vestigingsadres uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentStreetname",23));
		
		//Huisnummer vestigingsadres uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentHousenumber",24));
		
		//Toevoeging huisnummer vestigingsadres uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentHouseNumberAddition",25));
		
		//Vestigingsplaats uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyPlaceOfEstablishment",26));
		
		//Vestigingsland uiteindelijk moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderInformalCapitalFinalParentCompanyEstablishmentCountryCode",27));
		
		//Bevoordeling afkomstig van directe aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderDirectShareholderBenefiting",28));
		
		//Naam rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyName",29));
		
		//Straatnaam vestigingsadres rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentStreetName",30));
		
		//Huisnummer vestigingsadres rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentHouseNumber",31));
		
		//Toevoeging huisnummer vestigingsadres rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentHouseNumberAddition",32 ));
		
		//Vestigingsplaats rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyPlaceOfEstablishment",33));
		
		//Vestigingsland rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Spec_aandeelh","bd-bedr:ShareholderBenefitingLegalPersonsCompanyEstablishmentCountryCode",34));
		
		
	}

	
	@When("^the elements of the XBRL and the XLS for Algemene Gegevens are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Algemene_Gegevens_are_compared() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		//LegalPersonName
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:LegalPersonName", 1));
		
		//FunctionalCurrencySchemeExists
		
		//TaxReturnConcernsTaxEntity
		
		//TaxConsultantNumber
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-alg:TaxConsultantNumber", 9));
		
		//TaxConsultantInitials
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-alg:TaxConsultantInitials", 12));
		
		//TaxConsultantPrefix
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-alg:TaxConsultantInitials", 12));
		
		//TaxConsultantSurname
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-alg:TaxConsultantSurname", 14));
		
		//TaxConsultantTelephoneNumber
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-alg:TaxConsultantTelephoneNumber", 15));
		
		//IncomeTaxReturnSignatureInitials
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:IncomeTaxReturnSignatureInitials", 18));
		
		//IncomeTaxReturnSignaturePrefix
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:IncomeTaxReturnSignaturePrefix", 19));
		
		//IncomeTaxReturnSignatureSurname
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:IncomeTaxReturnSignatureSurname", 20));
		
		//IncomeTaxReturnSignatureFunctionSignatory
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:IncomeTaxReturnSignatureFunctionSignatory", 21));
		
		//IncomeTaxReturnSignatureTelephoneNumber
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:IncomeTaxReturnSignatureTelephoneNumber", 22));
		
		//RequestExplicitDecisionTaxAdministrationExists
		
		//RequestExplicitDecisionTaxAdministrationDescription
		Result.addAll(XMLandXLScompare.XMLandXLSchecker("Algemene_gegevens","bd-bedr:RequestExplicitDecisionTaxAdministrationDescription", 6));
		
	}
	
	
	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {
		
		assertTrue(Result.isEmpty());	
	}
}
