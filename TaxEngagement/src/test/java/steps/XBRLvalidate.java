package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import pageObjects.BalansActivaObjecten;
import codebase.BalansActivaXLS;
import codebase.BalansPassivaXLS;
import codebase.ReadXML;
import codebase.XLSbyColumn;
import codebase.XMLandXLScompare;
import codebase.vergelijk;

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

		// Naam aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh", "bd-bedr:ShareholderName", 1));

		// Straatnaam adres aandeelhouder
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh", "bd-bedr:ShareholderAddressStreetName", 4));

		// Huisnummer adres aandeelhouder
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh", "bd-bedr:ShareholderAddressHouseNumber", 5));

		// Huisnummer buitenlands adres
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderAddressHouseNumberAbroad", 6));

		// Huisnummertoevoeging adres aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderAddressHouseNumberAddition", 8));

		// Woonplaats aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderAddressPlaceOfResidence", 9));

		// Woon- vestigingsland aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderResidenceEstablishmentCountryCode", 10));

		// Nominale waarde gewone aandelen
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderOrdinarySharesNominalValue", 11));

		// Nominale waarde preferente aandelen einde boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderPrefenceSharesNominalValue", 12));

		// Nominale waarde prioriteitsaandelen einde boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderPrioritySharesNominalValue", 13));

		// Percentage nominaal geplaatst kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderIssuedCapitalPercentage", 14));

		// Vordering belastingplichtige op aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderClaimTaxpayerOnShareholder", 15));

		// In het boekjaar ontvangen rente van de aandeelhouder
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh", "bd-bedr:ShareholderInterestReceived", 17));

		// Schuld belastingplichtige aan aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderTaxpayerDebtToShareholder", 16));

		// In dit boekjaar betaalde rente aan de aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh", "bd-bedr:ShareholderInterestPaid", 18));

		// Informele kapitaalstorting door of via deze aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalThroughOrByThisShareholder", 19));

		// Omvang informele kapitaalstorting door of via deze aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalSizeThroughOrByThisShareholder", 20));

		// Omschrijving mening informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalOpinionDescription", 21));

		// Naam uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyName", 22));

		// Straatnaam vestigingsadres uiteindelijke moedermaatschappij informeel
		// kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentStreetname", 23));

		// Huisnummer vestigingsadres uiteindelijke moedermaatschappij informeel
		// kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentHousenumber", 24));

		// Toevoeging huisnummer vestigingsadres uiteindelijke
		// moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyAddressOfEstablishmentHouseNumberAddition", 25));

		// Vestigingsplaats uiteindelijke moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyPlaceOfEstablishment", 26));

		// Vestigingsland uiteindelijk moedermaatschappij informeel kapitaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderInformalCapitalFinalParentCompanyEstablishmentCountryCode", 27));

		// Bevoordeling afkomstig van directe aandeelhouder
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderDirectShareholderBenefiting", 28));

		// Naam rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyName", 29));

		// Straatnaam vestigingsadres rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentStreetName", 30));

		// Huisnummer vestigingsadres rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentHouseNumber", 31));

		// Toevoeging huisnummer vestigingsadres rechtspersoon bevoordeling
		// gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyAddressOfEstablishmentHouseNumberAddition", 32));

		// Vestigingsplaats rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyPlaceOfEstablishment", 33));

		// Vestigingsland rechtspersoon bevoordeling gedaan
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_aandeelh",
				"bd-bedr:ShareholderBenefitingLegalPersonsCompanyEstablishmentCountryCode", 34));

	}

	@When("^the elements of the XBRL and the XLS for Algemene Gegevens are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Algemene_Gegevens_are_compared() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// LegalPersonName
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-bedr:LegalPersonName", 1));

		// FunctionalCurrencySchemeExists

		// TaxReturnConcernsTaxEntity

		// TaxConsultantNumber
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-alg:TaxConsultantNumber", 9));

		// TaxConsultantInitials
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-alg:TaxConsultantInitials", 12));

		// TaxConsultantPrefix
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-alg:TaxConsultantInitials", 12));

		// TaxConsultantSurname
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-alg:TaxConsultantSurname", 14));

		// TaxConsultantTelephoneNumber
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-alg:TaxConsultantTelephoneNumber", 15));

		// IncomeTaxReturnSignatureInitials
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:IncomeTaxReturnSignatureInitials", 18));

		// IncomeTaxReturnSignaturePrefix
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:IncomeTaxReturnSignaturePrefix", 19));

		// IncomeTaxReturnSignatureSurname
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:IncomeTaxReturnSignatureSurname", 20));

		// IncomeTaxReturnSignatureFunctionSignatory
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:IncomeTaxReturnSignatureFunctionSignatory", 21));

		// IncomeTaxReturnSignatureTelephoneNumber
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:IncomeTaxReturnSignatureTelephoneNumber", 22));

		// RequestExplicitDecisionTaxAdministrationExists

		// RequestExplicitDecisionTaxAdministrationDescription
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:RequestExplicitDecisionTaxAdministrationDescription", 6));

	}

	@When("^the elements of the XBRL and the XLS for Specificatie Deelneming are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Specificatie_Deelneming_are_compared() throws Throwable {

		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:RequestExplicitDecisionTaxAdministrationDescription", 6));

	}

	@When("^the elements of the XBRL and the XLS for Toelichting Balans are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Toelichting_Balans_are_compared() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^the elements of the XBRL and the XLS for Zeescheepvaart are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Zeescheepvaart_are_compared() throws Throwable {

		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Zeescheepvaart", "bd-bedr:ShipName", 1));
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Zeescheepvaart", "bd-bedr:NetTonnageShip", 2));
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Zeescheepvaart", "bd-bedr:ShipExploitationDaysCount", 3));
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Zeescheepvaart",
				"bd-bedr:ShipParticipatingInterestPercentage", 4));

	}

	@When("^the elements of the XBRL and the XLS for Balans Activa are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Balans_Activa_are_compared() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		String Tab ="TC01";
		
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShipName").toString(), Double.parseDouble(BalansActivaXLS.HaalData("C",13, Tab)), "C13"));
		
		//Naam van de onderneming
		// BusinessName
				
		//Omschrijving activiteiten van de onderneming
		//BusinessActivitiesDescription
		
		//Dochtermaatschappij fiscale eenheid
		//SubsidiaryTaxEntityExists
		
		//Agrarische activiteiten
		//AgriculturalActivitiesExist
		
		//Goodwill fiscaal
		//GoodwillFiscal
		
		//Overige immateriële vaste activa fiscaal
		//IntangibleFixedAssetsOtherFiscal
		
		//Totaal immateriële vaste activa fiscaal
		//IntangibleFixedAssetsTotalFiscal
		
		//Gebouwen en terreinen fiscaal
		//BuildingsAndLandFiscal
		
		//Machines en installaties fiscaal
		//MachinesAndInstallationsFiscal
		
		//Andere vaste bedrijfsmiddelen fiscaal
		//FixedAssetsOtherFiscal
		
		//Totaal materiële vaste activa fiscaal
		//TangibleFixedAssetsFiscalTotal
		
		//Deelnemingen fiscaal
		//ParticipatingInterests
		
		//Langlopende vorderingen op groepsmaatschappijen fiscaal
		//LongTermReceivablesGroupCompaniesFiscal
		
		//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
		//LongTermReceivablesParticipatingInterestCompaniesFiscal
		
		//Overige financiële vaste activa fiscaal
		//FinancialFixedAssetsOtherFiscal
		
		//Totaal financiële vaste activa fiscaal
		//FinancialFixedAssetsTotalFiscal
		
		//Langlopende vorderingen op groepsmaatschappijen nominaal
		//LongTermReceivablesGroupCompaniesNominal
		
		//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
		//LongTermReceivablesParticipatingInterestCompaniesNominal
		
		//Overige financiële vaste activa fiscaal nominaal
		//FinancialFixedAssetsOtherTaxNominalFiscal
		
		//Voorraden, exclusief onderhanden werk
		//StockExcludingWorkInProgress
		
		//Onderhanden werk fiscaal
		//WorkInProgressFiscal
		
		//Totaal voorraden fiscaal
		//StockTotalFiscal
		
		//Vorderingen op handelsdebiteuren fiscaal
		//TradeAccountsReceivableFiscal
		
		//Vorderingen omzetbelasting fiscaal
		//ValueAddedTaxReceivablesFiscal
		
		//Kortlopende vorderingen op groepsmaatschappijen fiscaal
		//ShortTermReceivablesGroupCompaniesFiscal
		
		//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
		//ShortTermReceivablesParticipatingInterestCompaniesFiscal
		
		//Overige vorderingen fiscaal
		//ReceivablesOtherFiscal
		
		//Totaal vorderingen fiscaal
		//ReceivablesTotalFiscal
		
		//Nominaal handelsdebiteuren fiscaal
		//TradeReceivablesNominal
		
		//Kortlopende vorderingen op groepsmaatschappijen nominaal
		//ShortTermReceivablesGroupCompaniesNominal
		
		//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
		//ShortTermReceivablesParticipatingInterestCompaniesNominal
		
		//Effecten fiscaal
		//SecuritiesFiscal
		
		//Liquide middelen fiscaal
		//LiquidAssetsTotalFiscal
		
		//Totaal activa fiscaal
		//AssetsTotalAmountFiscal
		
		//Kosten aanschaf goodwill fiscaal
		//GoodwillPurchaseCostsFiscal
		
		//Aanschaf/voortbrengingskosten overige immateriële vaste activa fiscaal
		//IntangibleFixedAssetsOtherPurchaseOrProductionCostsFiscal
		
		//Toelichting op balans activa
		//BalanceSheetAssetsDescription

		
	}

@When("^the elements of the XBRL and the XLS for Balans Passiva are compared$")
public void the_elements_of_the_XBRL_and_the_XLS_for_Balans_Passiva_are_compared() throws Throwable {
	
	String Tab ="TC01";
	
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShipName").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("C",13, Tab)), "C13"));
	
	//BusinessActivitiesChangeExists	
	//Activiteiten onderneming gewijzigd
	
	//BusinessName	
	//Naam van de onderneming
	
	//BusinessActivitiesDescription	
	//Omschrijving activiteiten van de onderneming
		
	//SubsidiaryTaxEntityExists	
	//Dochtermaatschappij fiscale eenheid
	
	//AgriculturalActivitiesExist	
	//Agrarische activiteiten
	
	//GoodwillFiscal	
	//Goodwill fiscaal
	
	//IntangibleFixedAssetsOtherFiscal	
	//Overige immateriële vaste activa fiscaal
	
	//IntangibleFixedAssetsTotalFiscal	
	//Totaal immateriële vaste activa fiscaal
	
	
	//BuildingsAndLandFiscal	
	//Gebouwen en terreinen fiscaal
	
	//MachinesAndInstallationsFiscal	
	//Machines en installaties fiscaal
	
	
	//FixedAssetsOtherFiscal	
	//Andere vaste bedrijfsmiddelen fiscaal
	
	//TangibleFixedAssetsFiscalTotal	
	//Totaal materiële vaste activa fiscaal
	
	//ParticipatingInterests	
	//Deelnemingen fiscaal
	
	//LongTermReceivablesGroupCompaniesFiscal	
	//Langlopende vorderingen op groepsmaatschappijen fiscaal
	
	//LongTermReceivablesParticipatingInterestCompaniesFiscal	
	//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
	
	//FinancialFixedAssetsOtherFiscal	
	//Overige financiële vaste activa fiscaal
	
	//FinancialFixedAssetsTotalFiscal	
	//Totaal financiële vaste activa fiscaal
	
	//LongTermReceivablesGroupCompaniesNominal	
	//Langlopende vorderingen op groepsmaatschappijen nominaal
	
	//LongTermReceivablesParticipatingInterestCompaniesNominal	
	//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
	
	//FinancialFixedAssetsOtherTaxNominalFiscal	
	//Overige financiële vaste activa fiscaal nominaal
	
	//StockExcludingWorkInProgress	
	//Voorraden, exclusief onderhanden werk
	
	//WorkInProgressFiscal	
	//Onderhanden werk fiscaal
	
	//StockTotalFiscal	
	//Totaal voorraden fiscaal
	
	//TradeAccountsReceivableFiscal	
	//Vorderingen op handelsdebiteuren fiscaal
	
	//ValueAddedTaxReceivablesFiscal	
	//Vorderingen omzetbelasting fiscaal
	
	//ShortTermReceivablesGroupCompaniesFiscal	
	//Kortlopende vorderingen op groepsmaatschappijen fiscaal
	
	//ShortTermReceivablesParticipatingInterestCompaniesFiscal	
	//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
	
	//ReceivablesOtherFiscal	
	//Overige vorderingen fiscaal
	
	//ReceivablesTotalFiscal	
	//Totaal vorderingen fiscaal
	
	//TradeReceivablesNominal	
	//Nominaal handelsdebiteuren fiscaal
	
	//ShortTermReceivablesGroupCompaniesNominal	
	//Kortlopende vorderingen op groepsmaatschappijen nominaal
	
	//ShortTermReceivablesParticipatingInterestCompaniesNominal	
	//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
	
	//SecuritiesFiscal	
	//Effecten fiscaal
	
	//LiquidAssetsTotalFiscal	
	//Liquide middelen fiscaal
	
	//AssetsTotalAmountFiscal	
	//Totaal activa fiscaal
	
	//GoodwillPurchaseCostsFiscal	
	//Kosten aanschaf goodwill fiscaal
	
	//IntangibleFixedAssetsOtherPurchaseOrProductionCostsFiscal	
	//Aanschaf/voortbrengingskosten overige immateriële vaste activa fiscaal
	
	//BalanceSheetAssetsDescription	
	//Toelichting op balans activa

		
	
}

	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {

		assertTrue(Result.isEmpty());
	}
}
