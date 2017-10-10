package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import pageObjects.BalansActivaObjecten;
import codebase.BalansActivaXLS;
import codebase.BalansPassivaXLS;
import codebase.FiscaleVermogensvergelijkingXLS;
import codebase.LeesXLS;
import codebase.ReadXML;
import codebase.ToelichtingOverigeVoorzXLS;
import codebase.VerliesVerrekeningXLS;
import codebase.WinstVerliesXLS;
import codebase.XLSbyColumn;
import codebase.XMLandXLScompare;
import codebase.convertDate;
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
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:FunctionalCurrencySchemeExists", 8));

		// TaxReturnConcernsTaxEntity
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens", "bd-bedr:TaxReturnConcernsTaxEntity", 7));

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
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-alg:RequestExplicitDecisionTaxAdministrationExists", 6));

		// RequestExplicitDecisionTaxAdministrationDescription
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Algemene_gegevens",
				"bd-bedr:RequestExplicitDecisionTaxAdministrationDescription", 6));

	}

	@When("^the elements of the XBRL and the XLS for Specificatie Deelneming are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Specificatie_Deelneming_are_compared() throws Throwable {

		// ParticipatingInterestName
		// Naam deelneming
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming", "bd-bedr:ParticipatingInterestName", 1));

		// ParticipatingInterestIdentificationNumber
		// Identificatienummer deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestIdentificationNumber", 2));

		// PlaceOfEstablishmentParticipatingInterest
		// Vestigingsplaats deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:PlaceOfEstablishmentParticipatingInterest", 3));

		// EstablishmentParticipatingInterestCountry
		// Vestigingsland deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:EstablishmentParticipatingInterestCountry", 4));

		// ParticipatingInterestPercentageInterest
		// Percentage aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestPercentageInterest", 5));

		// InterestParticipatingInterestNominalValue
		// Nominale waarde aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:InterestParticipatingInterestNominalValue", 9));

		// ParticipatingInterestSacrificedAmount
		// Opgeofferd bedrag aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestSacrificedAmount", 10));

		// SheetValuationParticipatingInterestBalance
		// Balanswaardering deelneming fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:SheetValuationParticipatingInterestBalance", 11));

		// ParticipatingInterestBenefits
		// Voordelen deelneming boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestBenefits", 12));

		// ParticipatingInterestReceivableAmount
		// Bedrag vordering op deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestReceivableAmount", 13));

		// InterestReceivedFromParticipatingInterest
		// In het boekjaar ontvangen rente van de deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:InterestReceivedFromParticipatingInterest", 15));

		// ParticipatingInterestPayableAmount
		// Bedrag schuld aan deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestPayableAmount", 14));

		// InterestPaidToParticipatingInterest
		// In het boekjaar betaalde rente aan de deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:InterestPaidToParticipatingInterest", 16));

		// ParticipatingInterestJoiningOrRemovalTaxEntityExists
		// Voeging of ontvoeging van deelneming fiscale eenheid van
		// belastingplichtige
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestJoiningOrRemovalTaxEntityExists", 17));

		// ParticipatingInterestObtainmentEnlargementExists
		// Verwerving of uitbreiding deelneming van toepassing
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestObtainmentEnlargementExists", 20));

		// ParticipatingInterestAlienationDiminutionExists
		// Vervreemding of verkleining deelneming van toepassing
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestAlienationDiminutionExists", 27));

		// ParticipatingInterestLiquidationExists
		// Deelneming liquidatie
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestLiquidationExists", 33));

		// ParticipatingInterestApplicationValuationInstructionArticle13aApplied
		// Waarderingsvoorschrift artikel 13a op deelneming toegepast
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestApplicationValuationInstructionArticle13aApplied", 36));

		// ParticipatingInterestQualificationAsNotQualified
		// Kwalificatie als niet kwalificerende beleggingsdeelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestQualificationAsNotQualified", 37));

		// TaxEntityJoiningDate
		// Voegingsdatum deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming", "bd-bedr:TaxEntityJoiningDate", 18));

		// TaxEntityRemovalDate
		// Ontvoegingsdatum deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming", "bd-bedr:TaxEntityRemovalDate", 19));

		// ParticipatingInterestObtainmentEnlargementPercentage
		// Percentage verwerving of uitbreiding aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestObtainmentEnlargementPercentage", 21));

		// ParticipatingInterestObtainmentEnlargementNominalValue
		// Nominale waarde verwerving of uitbreiding aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestObtainmentEnlargementNominalValue", 22));

		// ParticipatingInterestObtainmentEnlargementSacrificedAmount
		// Opgeofferd bedrag verwerving of uitbreiding aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestObtainmentEnlargementSacrificedAmount", 23));

		// ParticipatingInterestObtainedAffiliatedPerson
		// Deelneming is verworven van verbonden natuurlijk- of rechtspersoon
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestObtainedAffiliatedPerson", 26));

		// ParticipatingInterestAlienationDiminutionPercentage
		// Percentage vervreemding of verkleining aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestAlienationDiminutionPercentage", 28));

		// ParticipatingInterestAlienationDiminutionNominalValue
		// Nominale waarde vervreemding of verkleining aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestAlienationDiminutionNominalValue", 29));

		// ParticipatingInterestAlienationDiminutionRevenue
		// Opbrengst vervreemding of verkleining aandelenbezit deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestAlienationDiminutionRevenue", 30));

		// ParticipatingInterestAlienationAffiliatedPerson
		// Deelneming is vervreemd aan verbonden natuurlijk- of rechtspersoon
		// Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming","bd-bedr:ParticipatingInterestAlienationAffiliatedPerson",
		// 27));

		// InterestsWithParticipatingInterestSettlementDate
		// Vereffeningsdatum deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:InterestsWithParticipatingInterestSettlementDate", 34));

		// ParticipatingInterestLiquidationLoss
		// Liquidatieverlies van deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestLiquidationLoss", 35));

		// ParticipatingInterestEconomicValue
		// Waarde in het economisch verkeer van deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestEconomicValue", 38));

		// ParticipatingInterestPercentageFallenBelowTwentyFivePercent
		// Percentage in deelneming gedaald onder 25 procent
		// Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming","bd-bedr:ParticipatingInterestPercentageFallenBelowTwentyFivePercent",
		// 36));

		// ParticipatingInterestValueAtTimeOfShareChangeToBelowTwentyFivePercent
		// Waarde van 25 procent-of-meer-belang op tijdstip mutatie
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestValueAtTimeOfShareChangeToBelowTwentyFivePercent", 38));

		// ParticipatingInterestEngrossmentBenefit
		// Brutering van voordeel bij deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestEngrossmentBenefit", 39));

		// ParticipatingInterestEuropeanUnitProfitPaymentPartBenefit
		// EU-deelneming en winstuitkering als onderdeel van voordeel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestEuropeanUnitProfitPaymentPartBenefit", 41));

		// ParticipatingInterestEngrossmentAndSetoffWithEffectiveTaxExists
		// Brutering en verrekening met effectieve belasting deelneming
		// Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming","bd-ParticipatingInterestEngrossmentAndSetoffWithEffectiveTaxExists",
		// x));

		// ParticipatingInterestDifferentSetoffWithAlreadyTaxedBenefitExists
		// Afwijkende verrekening bij reeds belaste winstuitkering deelneming
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Spec_deelneming",
				"bd-bedr:ParticipatingInterestDifferentSetoffWithAlreadyTaxedBenefitExists", 43));

	}

	@When("^the elements of the XBRL and the XLS for Toelichting Balans are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Toelichting_Balans_are_compared() throws Throwable {

		// EnvironmentalBusinessAssetsPurchaseCostsFiscal
		// Aanschafkosten milieu-bedrijfsmiddelen fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ParticipatingInterestDifferentSetoffWithAlreadyTaxedBenefitExists", 1));

		// EnvironmentalBusinessAssetsFiscal
		// Milieu-bedrijfsmiddelen fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-EnvironmentalBusinessAssetsFiscal", 1));

		// EnvironmentalBusinessAssetsResidualValueFiscal
		// Restwaarde milieu-bedrijfsmiddelen fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-EnvironmentalBusinessAssetsResidualValueFiscal", 1));

		// BuildingsOwnUsePurchaseCostsFiscal
		// Aanschafkosten gebouwen in eigen gebruik fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsOwnUsePurchaseCostsFiscal", 1));

		// BuildingsOwnUseFiscal
		// Gebouwen in eigen gebruik fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-BuildingsOwnUseFiscal", 1));

		// BuildingsOwnUseResidualValueFiscal
		// Restwaarde gebouwen in eigen gebruik fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsOwnUseResidualValueFiscal", 1));

		// BuildingsOwnUseSoilValueFiscal
		// Bodemwaarde gebouwen in eigen gebruik fiscaal
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-BuildingsOwnUseSoilValueFiscal", 1));

		// BuildingsForInvestmentPurposesPurchaseCostsFiscal
		// Aanschafkosten gebouwen ter belegging fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsForInvestmentPurposesPurchaseCostsFiscal", 1));

		// BuildingsForInvestmentPurposesFiscal
		// Gebouwen ter belegging fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsForInvestmentPurposesFiscal", 1));

		// BuildingsForInvestmentPurposesResidualValueFiscal
		// Restwaarde gebouwen ter belegging fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsForInvestmentPurposesResidualValueFiscal", 1));

		// BuildingsForInvestmentPurposesSoilValueFiscal
		// Bodemwaarde gebouwen ter belegging fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsForInvestmentPurposesSoilValueFiscal", 1));

		// BuildingsPurchaseCostsWithoutDepreciationFiscal
		// Aanschafkosten gebouwen zonder afschrijving fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsPurchaseCostsWithoutDepreciationFiscal", 1));

		// BuildingsWithoutDepreciationFiscal
		// Gebouwen zonder afschrijving fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-BuildingsWithoutDepreciationFiscal", 1));

		// CompanySitesFiscal
		// Bedrijfsterreinen fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-CompanySitesFiscal", 1));

		// CompanySitesPurchaseCostsFiscal
		// Kosten aanschaf bedrijfsterreinen fiscaal
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-CompanySitesPurchaseCostsFiscal", 1));

		// CompanySitesResidualValueFiscal
		// Restwaarde bedrijfsterreinen fiscaal
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-CompanySitesResidualValueFiscal", 1));

		// MachineryPurchaseCostsFiscal
		// Kosten aanschaf machines fiscaal
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-MachineryPurchaseCostsFiscal", 1));

		// MachineryResidualValueFiscal
		// Restwaarde machines fiscaal
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-MachineryResidualValueFiscal", 1));

		// FixedAssetsOtherPurchaseCostsFiscal
		// Andere vaste bedrijfsmiddelen aanschafwaarde fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-FixedAssetsOtherPurchaseCostsFiscal", 1));

		// FixedAssetsOtherResidualValueFiscal
		// Andere vaste bedrijfsmiddelen restwaarde fiscaal
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-FixedAssetsOtherResidualValueFiscal", 1));

		// ReinvestmentReserveDisposedBusinessAssetDescription
		// Omschrijving vervreemd bedrijfsmiddel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ReinvestmentReserveDisposedBusinessAssetDescription", 1));

		// ReinvestmentReserveDisposedBusinessAssetYear
		// Jaar vervreemding bedrijfsmiddel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ReinvestmentReserveDisposedBusinessAssetYear", 1));

		// ReinvestmentReserveDisposedBusinessAssetBookProfit
		// Boekwinst vervreemde bedrijfsmiddel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ReinvestmentReserveDisposedBusinessAssetBookProfit", 1));

		// ReinvestmentReserveDisposedBusinessAssetDepreciationPercentage
		// Afschrijvingspercentage vervreemd bedrijfsmiddel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ReinvestmentReserveDisposedBusinessAssetDepreciationPercentage", 1));

		// ReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime
		// Boekwaarde bedrijfsmiddel op vervreemdingsmoment
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime", 1));

		// 
		// Omschrijving soort garantievoorziening
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-WarrantyProvisionDescription", 1));

		// WarrantyProvisionAllocationAmount
		// Dotatie garantievoorziening
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-WarrantyProvisionAllocationAmount", 1));

		// WarrantyProvisionWithdrawal
		// Onttrekking garantievoorziening
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-WarrantyProvisionWithdrawal", 1));

		// WarrantyProvisionFiscalAmount
		// Garantievoorziening fiscaal einde boekjaar
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-WarrantyProvisionFiscalAmount", 1));

		// ProvisionsOtherDescription
		// Omschrijving overige voorziening
		Result.addAll(
				XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-ProvisionsOtherDescription", 1));

		// ProvisionsOtherAllocation
		// Dotatie overige voorziening
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-ProvisionsOtherAllocation", 1));

		// ProvisionsOtherWithdrawal
		// Onttrekking overige voorziening
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-ProvisionsOtherWithdrawal", 1));

		// ProvisionsOtherAmount
		// Overige voorziening einde boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans", "bd-ProvisionsOtherAmount", 1));

		// ValueAddedTaxPayableOrReceivablePartThisFinancialyear
		// Schuld/vordering over dit boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ValueAddedTaxPayableOrReceivablePartThisFinancialyear", 1));

		// ValueAddedTaxPayableOrReceivablePartPreviousFinancialyear
		// Schuld/vordering over het vorig boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ValueAddedTaxPayableOrReceivablePartPreviousFinancialyear", 1));

		// ValueAddedTaxPayableOrReceivablePartPrecedingPreviousFinancialyear
		// Schuld/vordering over oudere boekjaren
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("Toelichting_balans",
				"bd-ValueAddedTaxPayableOrReceivablePartPrecedingPreviousFinancialyear", 1));

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

		String Tab = "TC04";

		// Naam van de onderneming
		// BusinessName

		// Omschrijving activiteiten van de onderneming
		// BusinessActivitiesDescription

		// Dochtermaatschappij fiscale eenheid
		// SubsidiaryTaxEntityExists

		// Agrarische activiteiten
		// AgriculturalActivitiesExist

		// Goodwill fiscaal
		// GoodwillFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:GoodwillFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 16, Tab)), "G16"));

		// Overige immateriële vaste activa fiscaal
		// IntangibleFixedAssetsOtherFiscal
		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsOtherFiscal").toString(),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 17, Tab)), "G17"));

		// Totaal immateriële vaste activa fiscaal
		// IntangibleFixedAssetsTotalFiscal
		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsTotalFiscal").toString(),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 18, Tab)), "G18"));

		// Gebouwen en terreinen fiscaal
		// BuildingsAndLandFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsAndLandFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 26, Tab)), "G26"));

		// Machines en installaties fiscaal
		// MachinesAndInstallationsFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:MachinesAndInstallationsFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 27, Tab)), "G27"));

		// Andere vaste bedrijfsmiddelen fiscaal
		// FixedAssetsOtherFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:FixedAssetsOtherFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 28, Tab)), "G28"));

		// Totaal materiële vaste activa fiscaal
		// TangibleFixedAssetsFiscalTotal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:TangibleFixedAssetsFiscalTotal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 29, Tab)), "G29"));

		// Deelnemingen fiscaal
		// ParticipatingInterests
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ParticipatingInterests").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 37, Tab)), "G37"));

		// Langlopende vorderingen op groepsmaatschappijen fiscaal
		// LongTermReceivablesGroupCompaniesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesGroupCompaniesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 38, Tab)), "G38"));

		// Langlopende vorderingen participanten/maatschappij waarin wordt
		// deelgenomen, fiscaal
		// LongTermReceivablesParticipatingInterestCompaniesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesParticipatingInterestCompaniesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 39, Tab)), "G39"));

		// Overige financiële vaste activa fiscaal
		// FinancialFixedAssetsOtherFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsOtherFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 40, Tab)), "G40"));

		// Totaal financiële vaste activa fiscaal
		// FinancialFixedAssetsTotalFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsTotalFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 41, Tab)), "G41"));

		// Langlopende vorderingen op groepsmaatschappijen nominaal
		// LongTermReceivablesGroupCompaniesNominal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesGroupCompaniesNominal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 38, Tab)), "B38"));

		// Langlopende vorderingen participanten/maatschappij waarin wordt
		// deelgenomen, nominaal
		// LongTermReceivablesParticipatingInterestCompaniesNominal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LongTermReceivablesParticipatingInterestCompaniesNominal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 39, Tab)), "B39"));

		// Overige financiële vaste activa fiscaal nominaal
		// FinancialFixedAssetsOtherTaxNominalFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:FinancialFixedAssetsOtherTaxNominalFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 40, Tab)), "B40"));

		// Voorraden, exclusief onderhanden werk
		// StockExcludingWorkInProgress
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:StockExcludingWorkInProgress").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 48, Tab)), "G48"));

		// Onderhanden werk fiscaal
		// WorkInProgressFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:WorkInProgressFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 49, Tab)), "G49"));

		// Totaal voorraden fiscaal
		// StockTotalFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:StockTotalFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 50, Tab)), "G50"));

		// Vorderingen op handelsdebiteuren fiscaal
		// TradeAccountsReceivableFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:TradeAccountsReceivableFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 57, Tab)), "G57"));

		// Vorderingen omzetbelasting fiscaal
		// ValueAddedTaxReceivablesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxReceivablesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 58, Tab)), "G58"));

		// Kortlopende vorderingen op groepsmaatschappijen fiscaal
		// ShortTermReceivablesGroupCompaniesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesGroupCompaniesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 59, Tab)), "G59"));

		// Kortlopende vorderingen participanten/maatschappij waarin wordt
		// deelgenomen, fiscaal
		// ShortTermReceivablesParticipatingInterestCompaniesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesParticipatingInterestCompaniesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 60, Tab)), "G60"));

		// Overige vorderingen fiscaal
		// ReceivablesOtherFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ReceivablesOtherFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 61, Tab)), "G61"));

		// Totaal vorderingen fiscaal
		// ReceivablesTotalFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ReceivablesTotalFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 62, Tab)), "G62"));

		// Nominaal handelsdebiteuren fiscaal
		// TradeReceivablesNominal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:TradeReceivablesNominal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 57, Tab)), "B57"));

		// Kortlopende vorderingen op groepsmaatschappijen nominaal
		// ShortTermReceivablesGroupCompaniesNominal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesGroupCompaniesNominal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 59, Tab)), "B59"));

		// Kortlopende vorderingen participanten/maatschappij waarin wordt
		// deelgenomen, nominaal
		// ShortTermReceivablesParticipatingInterestCompaniesNominal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ShortTermReceivablesParticipatingInterestCompaniesNominal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 60, Tab)), "B60"));

		// Effecten fiscaal
		// SecuritiesFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:SecuritiesFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 67, Tab)), "G67"));

		// Liquide middelen fiscaal
		// LiquidAssetsTotalFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:LiquidAssetsTotalFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 72, Tab)), "G72"));

		// Totaal activa fiscaal
		// AssetsTotalAmountFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:AssetsTotalAmountFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 77, Tab)), "G77"));

		// Kosten aanschaf goodwill fiscaal
		// GoodwillPurchaseCostsFiscal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:GoodwillPurchaseCostsFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 16, Tab)), "B16"));

		// Aanschaf/voortbrengingskosten overige immateriële vaste activa
		// fiscaal
		// IntangibleFixedAssetsOtherPurchaseOrProductionCostsFiscal
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsOtherPurchaseOrProductionCostsFiscal").toString(),
				Double.parseDouble(BalansActivaXLS.HaalData("B", 17, Tab)), "B17"));

		// Toelichting op balans activa
		// BalanceSheetAssetsDescription

	}

	@When("^the elements of the XBRL and the XLS for Balans Passiva are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Balans_Passiva_are_compared() throws Throwable {

		String Tab = "TC04";

		// PaidCalledUpCapitalFiscal
		// Gestort en opgevraagd kapitaal fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PaidCalledUpCapitalFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 9, Tab)), "F9"));

		// InformalCapitalFiscal
		// Informeel kapitaal fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:InformalCapitalFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 10, Tab)), "F10"));

		// SharePremiumFiscal
		// Agio fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:SharePremiumFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 11, Tab)), "F11"));

		// RetainedProfitsFiscal
		// Winstreserve fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:RetainedProfitsFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 12, Tab)), "F12"));

		// EqualizationReserveCostsFiscal
		// Kosten egalisatiereserve fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:EqualizationReserveCostsFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 13, Tab)), "F13"));

		// ReinvestmentReserveFiscal
		// Herinvesteringsreserve fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ReinvestmentReserveFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 14, Tab)), "F14"));

		// CompartmentReserveTaxed
		// Belaste compartimenteringsreserve
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CompartmentReserveTaxed").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 15, Tab)), "F15"));

		// TaxReservesOtherFiscal
		// Overige fiscale reserves
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:TaxReservesOtherFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 16, Tab)), "F16"));

		// EquityCapitalBusinessAssetsTotalFiscal
		// Eigen vermogen/fiscaal ondernemingsvermogen

		// WarrantyProvisionFiscal
		// Garantievoorziening fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 25, Tab)), "F25"));

		// ProvisionAnnuityPensionAndRightOfStanding
		// Voorzieningen voor lijfrente, pensioen en stamrecht
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ProvisionAnnuityPensionAndRightOfStanding").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 26, Tab)), "F26"));

		// ProvisionsOtherFiscal
		// Overige voorzieningen fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ProvisionsOtherFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 27, Tab)), "F27"));

		// ProvisionsTotalFiscal
		// Totaal voorzieningen fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ProvisionsTotalFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 28, Tab)), "F28"));

		// ConvertibleLoansFiscal
		// Converteerbare leningen fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ConvertibleLoansFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 36, Tab)), "F36"));

		// BondsFiscal
		// Obligaties fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BondsFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 38, Tab)), "F38"));

		// LongTermDebtsGroupCompanies
		// Langlopende schulden groepsmaatschappijen
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsGroupCompanies").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 39, Tab)), "F39"));

		// LongTermDebtsParticipatingInterestCompanies
		// Langlopende schulden participanten/maatschappij waarin wordt
		// deelgenomen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsParticipatingInterestCompanies").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 40, Tab)), "F40"));

		// PayablesCreditInstitutionFiscal
		// Schulden aan kredietinstellingen fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PayablesCreditInstitutionFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 37, Tab)), "F37"));

		// LongTermDebtsOther
		// Overige langlopende schulden
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsOther").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 41, Tab)), "F41"));

		// LongTermDebtsTotal
		// Totaal langlopende schulden
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:LongTermDebtsTotal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 42, Tab)), "F42"));

		// AccountsPayableSuppliersTradeCreditors
		// Schulden aan leveranciers en handelskredieten
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:AccountsPayableSuppliersTradeCreditors").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 49, Tab)), "F49"));

		// ValueAddedTaxPayablesFiscal
		// Schulden omzetbelasting fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ValueAddedTaxPayablesFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 50, Tab)), "F50"));

		// ShortTermDebtsGroupCompanies
		// Kortlopende schulden groepsmaatschappijen
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsGroupCompanies").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 52, Tab)), "F52"));

		// WageTaxDebt
		// Loonheffingen
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:WageTaxDebt").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 51, Tab)), "F51"));

		// ShortTermDebtsParticipatingInterestCompanies
		// Kortlopende schulden participanten/maatschappij waarin wordt
		// deelgenomen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsParticipatingInterestCompanies").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 53, Tab)), "F53"));

		// ShortTermDebtsOther
		// Overige kortlopende schulden
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsOther").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 54, Tab)), "F54"));

		// ShortTermDebtsTotal
		// Totaal kortlopende schulden
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ShortTermDebtsTotal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 55, Tab)), "F55"));

		// LiabilitiesTotalFiscal
		// Totaal passiva fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:LiabilitiesTotalFiscal").toString(),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 59, Tab)), "F59"));

		// BalanceSheetLiabilitiesDescription
		// Toelichting op balans passiva

	}

	@When("^the elements of the XBRL and the XLS for Fiscale vermogensvergelijking are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Fiscale_vermogensvergelijking_are_compared() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String Tab = "TC01";

		// ProfitDistributionSubjectToDividendDate
		// De datum waarop het dividend ter beschikking is gesteld

		Result.addAll(vergelijk.VergelijkTupple(
				ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionSubjectToDividendDate").toString(),
				convertDate.changedateformat(FiscaleVermogensvergelijkingXLS.HaalText("B", 24, Tab)),
				convertDate.changedateformat(FiscaleVermogensvergelijkingXLS.HaalText("B", 25, Tab))));

		// DividendTaxReturnDate
		// Datum aangifte dividendbelasting

		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:DividendTaxReturnDate").toString(),
				convertDate.changedateformat(FiscaleVermogensvergelijkingXLS.HaalText("C", 24, Tab)),
				convertDate.changedateformat(FiscaleVermogensvergelijkingXLS.HaalText("C", 25, Tab))));

		// DividendTaxWithheldAmount
		// Bedrag ingehouden dividendbelasting

		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:DividendTaxWithheldAmount").toString(),
				FiscaleVermogensvergelijkingXLS.HaalData("D", 24, Tab),
				FiscaleVermogensvergelijkingXLS.HaalData("D", 25, Tab)));

		// ProfitDistributionAmount
		// Bedrag winstuitdeling

		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionAmount").toString(),
				FiscaleVermogensvergelijkingXLS.HaalData("E", 24, Tab),
				FiscaleVermogensvergelijkingXLS.HaalData("E", 25, Tab)));

		// ProfitDistributionsSubjectToDividendTaxTotalAmount
		// Totaal aan dividendbelasting onderworpen winstuitdelingen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionsSubjectToDividendTaxTotalAmount").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 21, Tab)), "F21"));

		// CorporationTaxWithdrawnFromEquityCapital
		// Vennootschapsbelasting aan fiscaal vermogen onttrokken
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CorporationTaxWithdrawnFromEquityCapital").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 27, Tab)), "F27"));

		// ForeignTaxAmountThisFinancialYearAppliedDoubleTaxAvoidance
		// Buitenlandse belasting over dit boekjaar voorzover hierop een
		// regeling ter voorkoming van dubbele belasting van toepassing is
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ForeignTaxAmountThisFinancialYearAppliedDoubleTaxAvoidance").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 28, Tab)), "F28"));

		// ProfitDistributionsByCooperationsNonDeductibelPart
		// Niet aftrekbaar deel winstuitdelingen door coöperaties
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionsByCooperationsNonDeductibelPart").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 30, Tab)), "F30"));

		// ProfitDistributionOtherNonDeductibleAmount
		// Andere openlijke of vermomde uitdelingen van winst
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ProfitDistributionOtherNonDeductibleAmount").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 35, Tab)), "F35"));

		// SupervisoryDirectorsFeesBalanceNonDeductiblePart
		// Niet aftrekbaar deel beloningen commissarissen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:SupervisoryDirectorsFeesBalanceNonDeductiblePart").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 36, Tab)), "F36"));

		// ProfitSharingBonusesNonDeductiblePart
		// Niet aftrekbaar deel tantièmes
		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ProfitSharingBonusesNonDeductiblePart").toString(),
						Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 41, Tab)), "F41"));

		// CapitalProvisionPaymentsNonDeductiblePart
		// Niet aftrekbaar deel vergoedingen voor kapitaalsverstrekking
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CapitalProvisionPaymentsNonDeductiblePart").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 47, Tab)), "F47"));

		// PaymentsEnsuingFromArticlesOfAssociationEtcRegulationsTotal
		// Totaal uitkeringen ingevolge statutaire en andere voorschriften
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:PaymentsEnsuingFromArticlesOfAssociationEtcRegulationsTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 52, Tab)), "F52"));

		// ResultTemporarilyPurchasedSharesEmployeeOptionsTotal
		// Totaal resultaat tijdelijk ingekochte aandelen werknemersopties
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ResultTemporarilyPurchasedSharesEmployeeOptionsTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 53, Tab)), "F53"));

		// CostsUponTaxEntityPurchaseRemainingSharesSubsidiaryInTaxEntityTotal
		// Totaal kosten bij aankoop resterende aandelen dochtermaatschappijen
		// in fiscale eenheid
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CostsUponTaxEntityPurchaseRemainingSharesSubsidiaryInTaxEntityTotal")
						.toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 54, Tab)), "F54"));

		// BusinessCapitalTotalEndFinancialYearForComparisonMethod
		// Ondernemingsvermogen bij het einde van het boekjaar
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BusinessCapitalTotalEndFinancialYearForComparisonMethod").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 5, Tab)), "E5"));

		// CapitalChangesAndWithdrawalsTotal
		// Mutaties/onttrekkingen kapitaal in het boekjaar
		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CapitalChangesAndWithdrawalsTotal").toString(),
						Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 6, Tab)), "E6"));

		// FinalAssetsAndCapitalWithdrawalsTotal
		// Totaal eindvermogen en terugbetalingen
		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:FinalAssetsAndCapitalWithdrawalsTotal").toString(),
						Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 8, Tab)), "F8"));

		// BusinessCapitalTotalStartFinancialYearForComparisonMethod
		// Ondernemingsvermogen bij het begin van het boekjaar
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BusinessCapitalTotalEndFinancialYearForComparisonMethod").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 5, Tab)), "E5"));

		// CapitalContributionsTotal
		// Stortingen van kapitaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CapitalContributionsTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 11, Tab)), "E11"));

		// InitialCapitalAndCapitalContributionsTotal
		// Totaal beginvermogen en kapitaalstortingen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:InitialCapitalAndCapitalContributionsTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 13, Tab)), "F13"));

		// CapitalComparisonDifferenceOfCapitalTotal
		// Vermogensverschil
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CapitalComparisonDifferenceOfCapitalTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 14, Tab)), "F14"));

		// CorporationTaxNonDeductibleAmountsTotal
		// Niet aftrekbare bedragen
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CorporationTaxNonDeductibleAmountsTotal").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 15, Tab)), "F15"));

		// BalanceProfitComparisonMethod
		// Saldo fiscale winstberekening (volgens vermogensvergelijking)
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BalanceProfitComparisonMethod").toString(),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 16, Tab)), "F16"));

	}

	@When("^the elements of the XBRL and the XLS for Winst en verliesrekening are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Winst_en_verliesrekening_are_compared() throws Throwable {
		String Tab = "TC01";

		// StockAndWorkInProgressChangeFiscal
		// Wijziging voorraad en onderhanden werk fiscaal

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:StockAndWorkInProgressChangeFiscal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 8, Tab)), "D8"));

		// CapitalizedProductionOwnBusinessFiscal
		// Geactiveerde productie eigen bedrijf fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CapitalizedProductionOwnBusinessFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 9, Tab)), "D9"));

		// RevenuesOtherFiscal
		// Overige opbrengsten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:RevenuesOtherFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 10, Tab)), "D10"));

		// BusinessRevenuesFiscalTotal
		// Totaal bedrijfsopbrengsten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BusinessRevenuesFiscalTotal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 13, Tab)), "G13"));

		// RawAncillaryMaterialsPurchasePriceSalesFiscal
		// Kosten grond- en hulpstoffen, inkoopprijs van de verkopen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:RawAncillaryMaterialsPurchasePriceSalesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 20, Tab)), "D20"));

		// OutsourcedWorkCostsAndOtherExternalCostsFiscal
		// Kosten uitbesteed werk en andere externe kosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:RawAncillaryMaterialsPurchasePriceSalesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 21, Tab)), "D21"));

		// WagesSalariesFiscal
		// Lonen en salarissen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:WagesSalariesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 27, Tab)), "D27"));

		// SocialSecurityCostsFiscal
		// Sociale lasten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:SocialSecurityCostsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 28, Tab)), "D28"));

		// PensionCostsFiscal
		// Pensioenlasten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PensionCostsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 29, Tab)), "D29"));

		// PersonnelCostsOtherFiscal
		// Overige personeelskosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PersonnelCostsOtherFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 30, Tab)), "D30"));

		// BenefitsAndWageSubsidiesReceivedFiscal
		// Ontvangen uitkeringen en loonsubsidies fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BenefitsAndWageSubsidiesReceivedFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 31, Tab)), "D31"));

		// GoodwillDepreciationFiscal
		// Goodwill afschrijvingen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:GoodwillDepreciationFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 37, Tab)), "D37"));

		// IntangibleFixedAssetsOtherDepreciation
		// Overige immateriële vaste activa afschrijvingen

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:IntangibleFixedAssetsOtherDepreciation").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 38, Tab)), "D38"));

		// CompanyBuildingsDepreciationFiscal
		// Afschrijving bedrijfsgebouwen fiscaal

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CompanyBuildingsDepreciationFiscal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 39, Tab)), "D39"));

		// MachineryDepreciationFiscal
		// Afschrijving machines en installaties fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:MachineryDepreciationFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 40, Tab)), "D40"));

		// TangibleFixedAssetsOtherDepreciation
		// Andere vaste bedrijfsmiddelen afschrijving

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:TangibleFixedAssetsOtherDepreciation").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 41, Tab)), "D41"));

		// TangibleAndIntangibleFixedAssetsOtherValuationChangeAmount
		// Overige waardeveranderingen van immateriële en materiële vaste
		// activa

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:TangibleAndIntangibleFixedAssetsOtherValuationChangeAmount").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 47, Tab)), "D47"));

		// CurrentAssetsSpecialValuationDecreaseAmount
		// Bijzondere waardevermindering van vlottende activa

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CurrentAssetsSpecialValuationDecreaseAmount").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 51, Tab)), "D51"));

		// CarAndTransportCostsFiscal
		// Auto- en transportkosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CarAndTransportCostsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 56, Tab)), "D56"));

		// AccommodationCostsFiscal
		// Huisvestingskosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:AccommodationCostsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 57, Tab)), "D57"));

		// MaintenanceOtherTangibleFixedAssetsFiscal
		// Onderhoud overige materiële vaste activa fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:MaintenanceOtherTangibleFixedAssetsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 58, Tab)), "D58"));

		// SalesCostsFiscal
		// Verkoopkosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:SalesCostsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 59, Tab)), "D59"));

		// CostOtherFiscal
		// Andere kosten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CostOtherFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 60, Tab)), "D60"));

		// BusinessExpenditureFiscalTotal
		// Totaal bedrijfslasten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BusinessExpenditureFiscalTotal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 63, Tab)), "G63"));

		// RevenuesOnReceivablesGroupCompanies
		// Opbrengsten vorderingen groepsmaatschappijen

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:RevenuesOnReceivablesGroupCompanies").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 71, Tab)), "D71"));

		// ProfitDueToDebtRemission
		// Kwijtscheldingswinst

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ProfitDueToDebtRemission").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 72, Tab)), "D72"));

		// RevenuesOnReceivablesParticipatingInterestCompanies
		// Opbrengsten vorderingen participant/maatschappijen waarin wordt
		// deelgenomen

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:RevenuesOnReceivablesParticipatingInterestCompanies").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 73, Tab)), "D73"));

		// RevenuesOtherReceivablesFiscal
		// Opbrengsten overige vorderingen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:RevenuesOtherReceivablesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 74, Tab)), "D74"));

		// RevenuesBankCreditsFiscal
		// Opbrengsten banktegoeden fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:RevenuesOtherReceivablesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 75, Tab)), "D75"));

		// ReceivablesValuationChangeAmount
		// Waardeverandering van vorderingen

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ReceivablesValuationChangeAmount").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 76, Tab)), "D76"));

		// StockValuationChangeAmount
		// Waardeverandering van effecten

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:StockValuationChangeAmount").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 77, Tab)), "D77"));

		// DividendExceptParticipatingInterestDividendFiscal
		// Ontvangen dividend (met uitzondering van deelnemingsdividend) fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:DividendExceptParticipatingInterestDividendFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 78, Tab)), "D78"));

		// CostsOnReceivablesParticipatingInterestCompanies
		// Kosten schulden participant/maatschappijen waarin wordt deelgenomen

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:CostsOnReceivablesParticipatingInterestCompanies").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 84, Tab)), "D84"));

		// InterestExpenditureEtcCostsDebtsFiscal
		// Kosten schulden, rentelasten etc. fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:InterestExpenditureEtcCostsDebtsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 85, Tab)), "D85"));

		// CostsOnReceivablesGroupCompanies
		// Kosten van schulden aan groepsmaatschappijen

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CostsOnReceivablesGroupCompanies").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 86, Tab)), "D86"));

		// BusinessFinanciaResultFiscalTotal
		// Totaal financiële baten en lasten fiscaal

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BusinessFinanciaResultFiscalTotal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("G", 90, Tab)), "D90"));

		// NormalBusinessActivitiesBusinessResultTotalFiscal
		// Resultaat gewone bedrijfsuitoefening fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:NormalBusinessActivitiesBusinessResultTotalFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 91, Tab)), "D91"));

		// BenefitsOrLossesRemovalSubsidiaryTerminationTaxEntityFiscal
		// Voordelen ontvoeging dochtermaatschappij/beeindiging fiscale eenheid
		// fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BenefitsOrLossesRemovalSubsidiaryTerminationTaxEntityFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 100, Tab)), "D100"));

		// ExtraordinaryIncomeBusinessOtherFiscal
		// Overige buitengewone baten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:ExtraordinaryIncomeBusinessOtherFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 101, Tab)), "D101"));

		// AssetsBookProfitsFiscal
		// Boekwinst op activa fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:AssetsBookProfitsFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 102, Tab)), "D102"));

		// ReinvestmentReservesWriteDownFiscal
		// Afboeking herinvesteringsreserve fiscaal

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ReinvestmentReservesWriteDownFiscal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 107, Tab)), "D107"));

		// PaymentsCharitiesFiscal
		// Uitkeringen aan algemeen nut beogende instellingen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PaymentsCharitiesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 108, Tab)), "D108"));

		// ExtraordinaryExpenditureBusinessOtherFiscal
		// Overige buitengewone lasten fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:PaymentsCharitiesFiscal").toString(),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 109, Tab)), "D109"));

		// ExtraordinaryBusinessResultsFiscal
		// Buitengewone resultaten fiscaal

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ExtraordinaryBusinessResultsFiscal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 110, Tab)), "D110"));

		// BalanceProfitCalculationForTaxPurposesFiscal
		// Saldo fiscale winstberekening

		Result.addAll(
				vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:ExtraordinaryBusinessResultsFiscal").toString(),
						Double.parseDouble(WinstVerliesXLS.HaalData("G", 118, Tab)), "G118"));

	}

	@When("^the elements of the XBRL and the XLS for Investeringsregeling are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Investeringsregeling_are_compared() throws Throwable {

		// BusinessAssetEnvironmentalEnergyInvestmentDescription
		// Bedrijfsmiddel investering energie/milieu
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentDescription", 1));

		// BusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount
		// Investeringsbedrag boekjaar

		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount", 4));

		// BusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate
		// Datum ingebruikname bedrijfsmiddel
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate", 3));

		// BusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear
		// Bedrag in boekjaar betaald
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear", 5));

		// BusinessAssetEnvironmentalEnergyInvestmentNotificationNumber
		// Meldingsnummer energie/milieu-investeringsaftrek
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentNotificationNumber", 7));

		// BusinessAssetEnvironmentalEnergyInvestmentPercentage
		// Percentage energie/milieu-investeringsaftrek
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentPercentage", 1));

		// BusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount
		// Berekende investeringsaftrek per investering
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount", 1));

		// BusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear
		// Investeringsaftrek energie/milieu dit boekjaar
		Result.addAll(XMLandXLScompare.XMLandXLScheckerArrays("investeringsregeling",
				"bd-bedr:BusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear", 8));

	}

	@When("^the elements of the XBRL and the XLS for verliesverrekening_xbrl are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_verliesverrekening_xbrl_are_compared() throws Throwable {

		String Tab = "Tc01";

		// LossesToBeSettledTaxEntityThisFinancialYearCompanyIdentificationNumber
		// RSIN maatschappij herkomst verlies
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LossesToBeSettledTaxEntityThisFinancialYearCompanyIdentificationNumber")
						.toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("A", 13, Tab)), "A13"));

		// LossesToBeSettledTaxEntityThisFinancialYearStart
		// Boekjaar maatschappij herkomst verlies, begin
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LossesToBeSettledTaxEntityThisFinancialYearStart").toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("B", 13, Tab)), "B13"));

		// LossesToBeSettledTaxEntityThisFinancialYearEnd
		// Boekjaar maatschappij herkomst verlies, eind
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LossesToBeSettledTaxEntityThisFinancialYearEnd").toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("C", 13, Tab)), "C13"));

		// LossesToBeSettledTaxEntityThisFinancialYearCompany
		// Verrekening verlies maatschappij dit boekjaar
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:LossesToBeSettledTaxEntityThisFinancialYearCompany").toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("A", 13, Tab)), "A13"));

		// BackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber
		// RSIN maatschappij toerekening verlies
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BackwardLossesToBeSettledTaxEntityCompanyIdentificationNumber").toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("A", 13, Tab)), "A13"));

		// BackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear
		// Verrekening verlies naar voorgaand boekjaar
		Result.addAll(vergelijk.VergelijkXBRL(
				ReadXML.GetXMLvalue("bd-bedr:BackwardLossesToBeSettledTaxEntityLossToBeSettledPreviousFinancialYear")
						.toString(),
				Double.parseDouble(VerliesVerrekeningXLS.HaalData("A", 13, Tab)), "A13"));
	}

	@When("^the elements of the XBRL and the XLS for Toelichting_overige_voorziening_xbrl are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Toelichting_overige_voorziening_xbrl_are_compared()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String Tab = "ToelichtingOverigeVoorziening";

		// WarrantyProvisionDescription
		// Omschrijving soort garantievoorziening
		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionDescription").toString(),
				ToelichtingOverigeVoorzXLS.HaalText("B", 2, Tab), ToelichtingOverigeVoorzXLS.HaalText("B", 3, Tab)));

		// WarrantyProvisionAllocationAmount
		// Dotatie garantievoorziening
		Result.addAll(vergelijk.VergelijkTupple(
				ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionAllocationAmount").toString(),
				ToelichtingOverigeVoorzXLS.HaalData("C", 2, Tab), ToelichtingOverigeVoorzXLS.HaalData("C", 3, Tab)));

		// WarrantyProvisionWithdrawal
		// Onttrekking garantievoorziening
		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionWithdrawal").toString(),
				ToelichtingOverigeVoorzXLS.HaalData("D", 2, Tab), ToelichtingOverigeVoorzXLS.HaalData("D", 3, Tab)));

		// WarrantyProvisionFiscalAmount
		// Garantievoorziening fiscaal einde boekjaar
		Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionFiscalAmount").toString(),
				ToelichtingOverigeVoorzXLS.HaalData("E", 2, Tab), ToelichtingOverigeVoorzXLS.HaalData("E", 3, Tab)));
	}

	@When("^the elements of the XBRL and the XLS for Toelichting materiele vaste activa are compared$")
	public void the_elements_of_the_XBRL_and_the_XLS_for_Toelichting_materiele_vaste_activa_are_compared()
			throws Throwable {
		
		
		String Locatie = "C:\\testdata\\Toelichting materiele vaste activa.xlsx"; 
		String Tab = "TC01";
		
//		EnvironmentalBusinessAssetsPurchaseCostsFiscal	
//		Aanschafkosten milieu-bedrijfsmiddelen fiscaal
		
//		EnvironmentalBusinessAssetsFiscal	
//		Milieu-bedrijfsmiddelen fiscaal
		
//		EnvironmentalBusinessAssetsResidualValueFiscal	
//		Restwaarde milieu-bedrijfsmiddelen fiscaal
		
//		BuildingsOwnUsePurchaseCostsFiscal	
//		Aanschafkosten gebouwen in eigen gebruik fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsOwnUsePurchaseCostsFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("B", 9, Tab, Locatie)), "B9"));
		
//		BuildingsOwnUseFiscal	
//		Gebouwen in eigen gebruik fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsOwnUseFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("C", 9, Tab, Locatie)), "C9"));
		
//		BuildingsOwnUseResidualValueFiscal	
//		Restwaarde gebouwen in eigen gebruik fiscaal
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsOwnUseResidualValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("D", 9, Tab, Locatie)), "D9"));
		
//		BuildingsOwnUseSoilValueFiscal	
//		Bodemwaarde gebouwen in eigen gebruik fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsOwnUseSoilValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("E", 9, Tab, Locatie)), "E9"));
		
//		BuildingsForInvestmentPurposesPurchaseCostsFiscal	
//		Aanschafkosten gebouwen ter belegging fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsForInvestmentPurposesPurchaseCostsFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("B", 10, Tab, Locatie)), "B10"));
				
//		BuildingsForInvestmentPurposesFiscal	
//		Gebouwen ter belegging fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsForInvestmentPurposesFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("C", 10, Tab, Locatie)), "C10"));
		
//		BuildingsForInvestmentPurposesResidualValueFiscal	
//		Restwaarde gebouwen ter belegging fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsForInvestmentPurposesResidualValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("D", 10, Tab, Locatie)), "D10"));
		
//		BuildingsForInvestmentPurposesSoilValueFiscal	
//		Bodemwaarde gebouwen ter belegging fiscaal
	
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsForInvestmentPurposesSoilValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("E", 10, Tab, Locatie)), "E10"));
		
//		BuildingsPurchaseCostsWithoutDepreciationFiscal	
//		Aanschafkosten gebouwen zonder afschrijving fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsPurchaseCostsWithoutDepreciationFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("B", 11, Tab, Locatie)), "B11"));
		
//		BuildingsWithoutDepreciationFiscal	
//		Gebouwen zonder afschrijving fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:BuildingsWithoutDepreciationFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("C", 11, Tab, Locatie)), "C11"));
		
//		CompanySitesFiscal	
//		Bedrijfsterreinen fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CompanySitesFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("C", 12, Tab, Locatie)), "C12"));
		
//		CompanySitesPurchaseCostsFiscal	
//		Kosten aanschaf bedrijfsterreinen fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CompanySitesPurchaseCostsFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("B", 12, Tab, Locatie)), "B12"));
		
//		CompanySitesResidualValueFiscal	
//		Restwaarde bedrijfsterreinen fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:CompanySitesResidualValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("D", 12, Tab, Locatie)), "D12"));
		
//		MachineryPurchaseCostsFiscal	
//		Kosten aanschaf machines fiscaal
		
		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:MachineryPurchaseCostsFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("B", 17, Tab, Locatie)), "B17"));
		
//		MachineryResidualValueFiscal	
//		Restwaarde machines fiscaal

		Result.addAll(vergelijk.VergelijkXBRL(ReadXML.GetXMLvalue("bd-bedr:MachineryResidualValueFiscal").toString(), Double.parseDouble(LeesXLS.HaalData("D", 17, Tab, Locatie)), "D17"));

	}


@When("^the elements of the XBRL and the XLS for Toelichting garantievoorziening are compared$")
public void the_elements_of_the_XBRL_and_the_XLS_for_Toelichting_garantievoorziening_are_compared() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
	String Locatie = "C:\\testdata\\Toelichting garantievoorziening.xlsx"; 
	String Tab = "TC01";
	
//	WarrantyProvisionDescription	
//	Omschrijving soort garantievoorziening
	
	Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionDescription").toString(),
			LeesXLS.HaalText("A", 4, Tab, Locatie), LeesXLS.HaalText("A", 5, Tab, Locatie)));
	
	
//	WarrantyProvisionAllocationAmount	
//	Dotatie garantievoorziening
	
	Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionAllocationAmount").toString(),
			LeesXLS.HaalData("B", 4, Tab, Locatie), LeesXLS.HaalData("B", 5, Tab, Locatie)));
	
//	WarrantyProvisionWithdrawal	
//	Onttrekking garantievoorziening
	
	Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionWithdrawal").toString(),
			LeesXLS.HaalData("C", 4, Tab, Locatie), LeesXLS.HaalData("C", 5, Tab, Locatie)));
	
//	WarrantyProvisionFiscalAmount	
//	Garantievoorziening fiscaal einde boekjaar

	Result.addAll(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:WarrantyProvisionFiscalAmount").toString(),
			LeesXLS.HaalData("D", 4, Tab, Locatie), LeesXLS.HaalData("D", 5, Tab, Locatie)));

}
		
	@Then("^they contain the same values$")
	public void they_contain_the_same_values() throws Throwable {
		System.out.println(Result);
		assertTrue(Result.isEmpty());
	}
}
