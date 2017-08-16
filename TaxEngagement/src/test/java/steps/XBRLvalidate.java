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
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:GoodwillFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",16, Tab)), "G17"));
		
		//Overige immateriële vaste activa fiscaal
		//IntangibleFixedAssetsOtherFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsOtherFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",17, Tab)), "G17"));
		
		//Totaal immateriële vaste activa fiscaal
		//IntangibleFixedAssetsTotalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsTotalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",18, Tab)), "G18"));		
		
		//Gebouwen en terreinen fiscaal
		//BuildingsAndLandFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:BuildingsAndLandFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",26, Tab)), "G26"));
		
		//Machines en installaties fiscaal
		//MachinesAndInstallationsFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:BuildingsAndLandFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",27, Tab)), "G27"));
		
		//Andere vaste bedrijfsmiddelen fiscaal
		//FixedAssetsOtherFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FixedAssetsOtherFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",28, Tab)), "G28"));
		
		//Totaal materiële vaste activa fiscaal
		//TangibleFixedAssetsFiscalTotal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:TangibleFixedAssetsFiscalTotal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",29, Tab)), "G29"));
		
		//Deelnemingen fiscaal
		//ParticipatingInterests
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ParticipatingInterests").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",37, Tab)), "G37"));
				
		//Langlopende vorderingen op groepsmaatschappijen fiscaal
		//LongTermReceivablesGroupCompaniesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesGroupCompaniesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",38, Tab)), "G38"));
		
		//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
		//LongTermReceivablesParticipatingInterestCompaniesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesParticipatingInterestCompaniesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",39, Tab)), "G39"));
		
		//Overige financiële vaste activa fiscaal
		//FinancialFixedAssetsOtherFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsOtherFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",40, Tab)), "G40"));
				
		//Totaal financiële vaste activa fiscaal
		//FinancialFixedAssetsTotalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsTotalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",41, Tab)), "G41"));
				
		//Langlopende vorderingen op groepsmaatschappijen nominaal
		//LongTermReceivablesGroupCompaniesNominal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesGroupCompaniesNominal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",38, Tab)), "B38"));
		
		//Langlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
		//LongTermReceivablesParticipatingInterestCompaniesNominal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesParticipatingInterestCompaniesNominal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",39, Tab)), "B39"));
		
		//Overige financiële vaste activa fiscaal nominaal
		//FinancialFixedAssetsOtherTaxNominalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsOtherTaxNominalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",40, Tab)), "B40"));
		
		//Voorraden, exclusief onderhanden werk
		//StockExcludingWorkInProgress
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:StockExcludingWorkInProgress").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",48, Tab)), "G48"));
		
		//Onderhanden werk fiscaal
		//WorkInProgressFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:StockExcludingWorkInProgress").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",49, Tab)), "G49"));
		
		//Totaal voorraden fiscaal
		//StockTotalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:StockTotalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",50, Tab)), "G50"));
				
		//Vorderingen op handelsdebiteuren fiscaal
		//TradeAccountsReceivableFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:TradeAccountsReceivableFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",57, Tab)), "G57"));
		
		//Vorderingen omzetbelasting fiscaal
		//ValueAddedTaxReceivablesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxReceivablesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",58, Tab)), "G58"));
		
		//Kortlopende vorderingen op groepsmaatschappijen fiscaal
		//ShortTermReceivablesGroupCompaniesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesGroupCompaniesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",59, Tab)), "G59"));
				
		//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, fiscaal
		//ShortTermReceivablesParticipatingInterestCompaniesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesParticipatingInterestCompaniesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",60, Tab)), "G60"));
				
		//Overige vorderingen fiscaal
		//ReceivablesOtherFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ReceivablesOtherFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",61, Tab)), "G61"));
		
		//Totaal vorderingen fiscaal
		//ReceivablesTotalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ReceivablesTotalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",62, Tab)), "G62"));
		
		//Nominaal handelsdebiteuren fiscaal
		//TradeReceivablesNominal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:TradeReceivablesNominal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",57, Tab)), "B57"));
		
		
		//Kortlopende vorderingen op groepsmaatschappijen nominaal
		//ShortTermReceivablesGroupCompaniesNominal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesGroupCompaniesNominal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",59, Tab)), "B59"));
		
		//Kortlopende vorderingen participanten/maatschappij waarin wordt deelgenomen, nominaal
		//ShortTermReceivablesParticipatingInterestCompaniesNominal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesParticipatingInterestCompaniesNominal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",60, Tab)), "B60"));
		
		//Effecten fiscaal
		//SecuritiesFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:SecuritiesFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",67, Tab)), "G67"));
		
		
		//Liquide middelen fiscaal
		//LiquidAssetsTotalFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LiquidAssetsTotalFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",72, Tab)), "G72"));
		
		//Totaal activa fiscaal
		//AssetsTotalAmountFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:AssetsTotalAmountFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("G",78, Tab)), "G78"));
		
		//Kosten aanschaf goodwill fiscaal
		//GoodwillPurchaseCostsFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:GoodwillPurchaseCostsFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",16, Tab)), "B16"));
				
		//Aanschaf/voortbrengingskosten overige immateriële vaste activa fiscaal
		//IntangibleFixedAssetsOtherPurchaseOrProductionCostsFiscal
		Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:GoodwillPurchaseCostsFiscal").toString(), Double.parseDouble(BalansActivaXLS.HaalData("B",17, Tab)), "B17"));
		
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
