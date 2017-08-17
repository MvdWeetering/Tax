package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import pageObjects.BalansActivaObjecten;
import codebase.BalansActivaXLS;
import codebase.BalansPassivaXLS;
import codebase.FiscaleVermogensvergelijkingXLS;
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
	
	
	//PaidCalledUpCapitalFiscal	
	//Gestort en opgevraagd kapitaal fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:PaidCalledUpCapitalFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",9, Tab)), "F9"));
	
	//InformalCapitalFiscal	
	//Informeel kapitaal fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:InformalCapitalFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",10, Tab)), "F10"));
	
	//SharePremiumFiscal	
	//Agio fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:SharePremiumFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",11, Tab)), "F11"));
	
	//RetainedProfitsFiscal	
	//Winstreserve fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:RetainedProfitsFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",12, Tab)), "F12"));
	
	//EqualizationReserveCostsFiscal	
	//Kosten egalisatiereserve fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:EqualizationReserveCostsFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",13, Tab)), "F13"));
	
	//ReinvestmentReserveFiscal	
	//Herinvesteringsreserve fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ReinvestmentReserveFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",14, Tab)), "F14"));
	
	//CompartmentReserveTaxed	
	//Belaste compartimenteringsreserve
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CompartmentReserveTaxed").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",15, Tab)), "F15"));
	
	//TaxReservesOtherFiscal	
	//Overige fiscale reserves
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:TaxReservesOtherFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",16, Tab)), "F16"));
	
	//EquityCapitalBusinessAssetsTotalFiscal	
	//Eigen vermogen/fiscaal ondernemingsvermogen
	
	
	//WarrantyProvisionFiscal	
	//Garantievoorziening fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",25, Tab)), "F25"));
	
	//ProvisionAnnuityPensionAndRightOfStanding	
	//Voorzieningen voor lijfrente, pensioen en stamrecht
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProvisionAnnuityPensionAndRightOfStanding").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",26, Tab)), "F26"));
	
	//ProvisionsOtherFiscal	
	//Overige voorzieningen fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProvisionsOtherFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",27, Tab)), "F27"));
	
	//ProvisionsTotalFiscal	
	//Totaal voorzieningen fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProvisionsTotalFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",28, Tab)), "F28"));
	
	//ConvertibleLoansFiscal	
	//Converteerbare leningen fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ConvertibleLoansFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",36, Tab)), "F36"));
	
	//BondsFiscal	
	//Obligaties fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:BondsFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",38, Tab)), "F38"));
	
	//LongTermDebtsGroupCompanies	
	//Langlopende schulden groepsmaatschappijen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsGroupCompanies").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",39, Tab)), "F39"));
	
	//LongTermDebtsParticipatingInterestCompanies	
	//Langlopende schulden participanten/maatschappij waarin wordt deelgenomen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsParticipatingInterestCompanies").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",39, Tab)), "F39"));
	
	//PayablesCreditInstitutionFiscal	
	//Schulden aan kredietinstellingen fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:PayablesCreditInstitutionFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",40, Tab)), "F40"));
	
	//LongTermDebtsOther	
	//Overige langlopende schulden
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsOther").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",41, Tab)), "F41"));
	
	//LongTermDebtsTotal	
	//Totaal langlopende schulden
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsOther").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",42, Tab)), "F42"));
		
	//AccountsPayableSuppliersTradeCreditors	
	//Schulden aan leveranciers en handelskredieten
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:AccountsPayableSuppliersTradeCreditors").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",49, Tab)), "F49"));
	
	//ValueAddedTaxPayablesFiscal	
	//Schulden omzetbelasting fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxPayablesFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",50, Tab)), "F50"));
	
	//ShortTermDebtsGroupCompanies	
	//Kortlopende schulden groepsmaatschappijen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsGroupCompanies").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",52, Tab)), "F52"));
	
	//WageTaxDebt	
	//Loonheffingen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:WageTaxDebt").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",51, Tab)), "F51"));
	
	//ShortTermDebtsParticipatingInterestCompanies	
	//Kortlopende schulden participanten/maatschappij waarin wordt deelgenomen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxPayablesFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",53, Tab)), "F53"));
	
	//ShortTermDebtsOther	
	//Overige kortlopende schulden
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxPayablesFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",54, Tab)), "F54"));
	
	//ShortTermDebtsTotal	
	//Totaal kortlopende schulden
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsTotal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",55, Tab)), "F55"));
	
	//LiabilitiesTotalFiscal	
	//Totaal passiva fiscaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:LiabilitiesTotalFiscal").toString(), Double.parseDouble(BalansPassivaXLS.HaalData("F",59, Tab)), "F59"));
	
	//BalanceSheetLiabilitiesDescription	
	//Toelichting op balans passiva
		
}

@When("^the elements of the XBRL and the XLS for Fiscale vermogensvergelijking are compared$")
public void the_elements_of_the_XBRL_and_the_XLS_for_Fiscale_vermogensvergelijking_are_compared() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	String Tab = "TC01";

//ProfitDistributionSubjectToDividendDate	
//De datum waarop het dividend ter beschikking is gesteld

	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionSubjectToDividendDate").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("B",24, Tab)), "B24"));

	
//DividendTaxReturnDate	
//Datum aangifte dividendbelasting
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:DividendTaxReturnDate").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("C",24, Tab)), "C24"));
	
//DividendTaxWithheldAmount
//Bedrag ingehouden dividendbelasting
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:DividendTaxWithheldAmount").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("D",25, Tab)), "D25"));

//ProfitDistributionAmount	
//Bedrag winstuitdeling
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionAmount").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",25, Tab)), "E25"));
	
//ProfitDistributionsSubjectToDividendTaxTotalAmount	
//Totaal aan dividendbelasting onderworpen winstuitdelingen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionsSubjectToDividendTaxTotalAmount").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",21, Tab)), "F21"));
	
//CorporationTaxWithdrawnFromEquityCapital	
//Vennootschapsbelasting aan fiscaal vermogen onttrokken
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CorporationTaxWithdrawnFromEquityCapital").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",27, Tab)), "F27"));
	
//ForeignTaxAmountThisFinancialYearAppliedDoubleTaxAvoidance	
//Buitenlandse belasting over dit boekjaar voorzover hierop een regeling ter voorkoming van dubbele belasting van toepassing is
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ForeignTaxAmountThisFinancialYearAppliedDoubleTaxAvoidance").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",28, Tab)), "F28"));
	
//ProfitDistributionsByCooperationsNonDeductibelPart	
//Niet aftrekbaar deel winstuitdelingen door coöperaties
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionsByCooperationsNonDeductibelPart").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",30, Tab)), "F30"));
	
//ProfitDistributionOtherNonDeductibleAmount	
//Andere openlijke of vermomde uitdelingen van winst
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionsByCooperationsNonDeductibelPart").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",35, Tab)), "F35"));
	
//SupervisoryDirectorsFeesBalanceNonDeductiblePart	
//Niet aftrekbaar deel beloningen commissarissen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:SupervisoryDirectorsFeesBalanceNonDeductiblePart").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",36, Tab)), "F36"));
	
//ProfitSharingBonusesNonDeductiblePart	
//Niet aftrekbaar deel tantièmes
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ProfitSharingBonusesNonDeductiblePart").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",41, Tab)), "F41"));

//CapitalProvisionPaymentsNonDeductiblePart	
//Niet aftrekbaar deel vergoedingen voor kapitaalsverstrekking
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CapitalProvisionPaymentsNonDeductiblePart").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",47, Tab)), "F47"));
	
//PaymentsEnsuingFromArticlesOfAssociationEtcRegulationsTotal	
//Totaal uitkeringen ingevolge statutaire en andere voorschriften
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:PaymentsEnsuingFromArticlesOfAssociationEtcRegulationsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",52, Tab)), "F52"));

	//ResultTemporarilyPurchasedSharesEmployeeOptionsTotal	
//Totaal resultaat tijdelijk ingekochte aandelen werknemersopties
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:ResultTemporarilyPurchasedSharesEmployeeOptionsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",53, Tab)), "F53"));

//CostsUponTaxEntityPurchaseRemainingSharesSubsidiaryInTaxEntityTotal	
//Totaal kosten bij aankoop resterende aandelen dochtermaatschappijen in fiscale eenheid
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CostsUponTaxEntityPurchaseRemainingSharesSubsidiaryInTaxEntityTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",54, Tab)), "F54"));
	
//BusinessCapitalTotalEndFinancialYearForComparisonMethod	
//Ondernemingsvermogen bij het einde van het boekjaar
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:BusinessCapitalTotalEndFinancialYearForComparisonMethod").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",5, Tab)), "E5"));
	
//CapitalChangesAndWithdrawalsTotal	
//Mutaties/onttrekkingen kapitaal in het boekjaar
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FinalAssetsAndCapitalWithdrawalsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",6, Tab)), "E6"));
	
//FinalAssetsAndCapitalWithdrawalsTotal
//Totaal eindvermogen en terugbetalingen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:FinalAssetsAndCapitalWithdrawalsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",8, Tab)), "F8"));
	
//BusinessCapitalTotalStartFinancialYearForComparisonMethod	
//Ondernemingsvermogen bij het begin van het boekjaar
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:BusinessCapitalTotalEndFinancialYearForComparisonMethod").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",10, Tab)), "E10"));
	
//CapitalContributionsTotal	
//Stortingen van kapitaal
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CapitalContributionsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",11, Tab)), "E11"));
	
//InitialCapitalAndCapitalContributionsTotal	
//Totaal beginvermogen en kapitaalstortingen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:InitialCapitalAndCapitalContributionsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",13, Tab)), "E13"));
	
//CapitalComparisonDifferenceOfCapitalTotal	
//Vermogensverschil
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CapitalComparisonDifferenceOfCapitalTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",19, Tab)), "E19"));
	
//CorporationTaxNonDeductibleAmountsTotal	
//Niet aftrekbare bedragen
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CorporationTaxNonDeductibleAmountsTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",15, Tab)), "E15"));
	
//BalanceProfitComparisonMethod	
//Saldo fiscale winstberekening (volgens vermogensvergelijking)
	Result.addAll(vergelijk.Vergelijk(ReadXML.GetXMLvalue("bd-bedr:CapitalComparisonDifferenceOfCapitalTotal").toString(), Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E",16, Tab)), "E16"));

}


	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {

		assertTrue(Result.isEmpty());
	}
}
