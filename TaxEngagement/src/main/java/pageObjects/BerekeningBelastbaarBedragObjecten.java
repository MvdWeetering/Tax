package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BerekeningBelastbaarBedragObjecten {
	private static WebElement element = null;
		
//	Saldo fiscale winstberekening
	@FieldName(name = "SaldoFiscaleWinstberekening")
	public static WebElement SaldoFiscaleWinstberekening(WebDriver driver){
		element = driver.findElement(By.id("idCWNLSalFisWinstber"));
		return element;
	}
			
//	Kosten en lasten die niet of gedeeltelijk niet aftrekbaar zijn

	@FieldName(name = "KostenEnLastenNietOfGedeeltelijkNietAftrekbaar")
	public static WebElement KostenEnLastenNietOfGedeeltelijkNietAftrekbaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzup"));
		return element;
	}
		
//	Niet aftrekbare kosten (boete en overige kosten)Omschrijving
	@FieldName(name = "NietAftrekbareKostenOmschrijving")
	public static WebElement NietAftrekbareKostenOmschrijving(WebDriver driver){
		element = driver.findElement(By.id("idtableNietAftBoet:0-1"));
		return element;
	}
	
//	Niet aftrekbare kosten (boete en overige kosten)Bedrag
	@FieldName(name = "NietAftrekbareKostenBedrag")
	public static WebElement NietAftrekbareKostenBedrag(WebDriver driver){
		element = driver.findElement(By.id("idtableNietAftBoet:0-3"));
		return element;
	}
	
//	Overige van aftrek uitgesloten of in aftrek beperkte kostenOmschrijving
	@FieldName(name = "OverigeVanAftrekUitgeslotenAftrekBeperkteKostenOmschrijving")
	public static WebElement OverigeVanAftrekUitgeslotenAftrekBeperkteKostenOmschrijving (WebDriver driver){
		element = driver.findElement(By.id("idtableKostLastNieAft:0-1"));
		return element;
	}
	
//	Overige van aftrek uitgesloten of in aftrek beperkte kostenBedrag
	@FieldName(name = "OverigeVanAftrekUitgeslotenAftrekBeperkteKostenBedrag")
	public static WebElement OverigeVanAftrekUitgeslotenAftrekBeperkteKostenBedrag (WebDriver driver){
		element = driver.findElement(By.id("idtableKostLastNieAft:0-3"));
		return element;
	}
	
//	Winst uit zeescheepvaart
	@FieldName(name = "WinstUitZeescheepvaart")
	public static WebElement WinstUitZeescheepvaart(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuu"));
		return element;
	}
	
//	Saldo niet aftrekbare renten en royalty's
	@FieldName(name = "SaldoNietAftrekbareRentenRoyaltys")
	public static WebElement SaldoNietAftrekbareRentenRoyaltys(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvu"));
		return element;
	}
	
//	Totaal niet aftrekbare rente
	@FieldName(name = "TotaalNietAftrekbareRente")
	public static WebElement TotaalNietAftrekbareRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw3"));
		return element;
	}
	
//	Niet aftrekbare rente
	@FieldName(name = "NietAftrekbareRente")
	public static WebElement NietAftrekbareRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvx"));
		return element;
	}
	
//	Vergoedingen en waardemutaties
	@FieldName(name = "VergoedingenEnWaardemutaties")
	public static WebElement VergoedingenEnWaardemutaties(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvz"));
		return element;
	}
	
//	Bovenmatige deelnemingsrente
	@FieldName(name = "BovenmatigeDeelnemingsrente")
	public static WebElement BovenmatigeDeelnemingsrente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw0"));
		return element;
	}
	
//	Rente overnameschulden
	@FieldName(name = "RenteOvernameschulden")
	public static WebElement RenteOvernameschulden(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw1"));
		return element;
	}
	
//	Totaal niet aftrekbare rente
	@FieldName(name = "SubTotaalNietAftrekbareRente")
	public static WebElement SubTotaalNietAftrekbareRente(WebDriver driver){
		element = driver.findElement(By.id("idCWNLNietAftRenteTot"));
		return element;
	}
	
//	Totaal bijtellingen
	@FieldName(name = "TotaalBijtellingen")
	public static WebElement TotaalBijtellingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTotBijt"));
		return element;
	}
	
//	Vrijgestelde winstbestanddelen, zonder deelnemingsvrijstelling
	@FieldName(name = "VrijgesteldeWinstbestanddelenZonderDeelnemingsvrijstelling")
	public static WebElement VrijgesteldeWinstbestanddelenZonderDeelnemingsvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuo"));
		return element;
	}
	
//	Bosbouw-/landbouwvrijstelling
	@FieldName(name = "BosbouwLandbouwvrijstelling")
	public static WebElement BosbouwLandbouwvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuh"));
		return element;
	}
	
//	Kwijtscheldingswinst
	@FieldName(name = "Kwijtscheldingswinst")
	public static WebElement Kwijtscheldingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuj"));
		return element;
	}
	
//	Winst uit (af)splitsing of juridische fusie
	@FieldName(name = "WinstAfsplitsingOfJuridischeFusie")
	public static WebElement WinstAfsplitsingOfJuridischeFusie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuk"));
		return element;
	}
	
//	Mobiliteitsprojectvrijstelling
	@FieldName(name = "Mobiliteitsprojectvrijstelling")
	public static WebElement Mobiliteitsprojectvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzum"));
		return element;
	}
	
//	Vrijgestelde voordelen overheidsondernemingen
	@FieldName(name = "VrijgesteldeVoordelenOverheidsondernemingen")
	public static WebElement VrijgesteldeVoordelenOverheidsondernemingen(WebDriver driver){
		element = driver.findElement(By.id("idn26n68pe"));
		return element;
	}
	
//	Overige vrijgestelde winstbestanddelen
	@FieldName(name = "OverigeVrijgesteldeWinstbestanddelen")
	public static WebElement OverigeVrijgesteldeWinstbestanddelen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzun"));
		return element;
	}
	
//	Totaal vrijgestelde winstbestanddelen
	@FieldName(name = "TotaalVrijgesteldeWinstbestanddelen")
	public static WebElement TotaalVrijgesteldeWinstbestanddelen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLVrWiZoDeTot"));
		return element;
	}
	
//	Fictieve personeelskosten instellingen algemeen/sociaal belang
	@FieldName(name = "FictievePersoneelskostenInstellingenAlgemeenSociaalBelang")
	public static WebElement FictievePersoneelskostenInstellingenAlgemeenSociaalBelang(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzur"));
		return element;
	}
	
//	Winst van een Anbi, behaald met kenbaar fondswervende activiteiten
	@FieldName(name = "WinstAnbiBehaaldMetKenbaarFondswervendeActiviteiten")
	public static WebElement WinstAnbiBehaaldMetKenbaarFondswervendeActiviteiten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzus"));
		return element;
	}
	
//	Totaal investeringsregelingen
	@FieldName(name = "TotaalInvesteringsregelingen")
	public static WebElement TotaalInvesteringsregelingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzv4"));
		return element;
	}
	
//	Wijzigingen toelaatbare fiscale reserves (onttrekkingen -/- toevoegingen)
	@FieldName(name = "WijzigingenToelaatbareFiscaleReserves")
	public static WebElement WijzigingenToelaatbareFiscaleReserves(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvt"));
		return element;
	}
	
//	KostenegalisatiereserveToevoeging
	@FieldName(name = "KostenegalisatiereserveToevoeging")
	public static WebElement KostenegalisatiereserveToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzva"));
		return element;
	}
	
//	HerinvesteringsreserveToevoeging
	@FieldName(name = "HerinvesteringsreserveToevoeging")
	public static WebElement HerinvesteringsreserveToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvd"));
		return element;
	}
	
//	Belaste compartimenteringsreserveToevoeging
	@FieldName(name = "BelasteCompartimenteringsreserveToevoeging")
	public static WebElement BelasteCompartimenteringsreserveToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvj"));
		return element;
	}
	
//	Overige fiscale reserves Toevoeging
	@FieldName(name = "OverigeFiscaleReservesToevoeging")
	public static WebElement OverigeFiscaleReservesToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvm"));
		return element;
	}
		
	//Totalen Toevoeging
	@FieldName(name = "TotalenToevoeging")
	public static WebElement TotalenToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvr"));
		return element;
	}
		
//	Kostenegalisatiereserve Onttrekking
	@FieldName(name = "KostenegalisatiereserveOnttrekking")
	public static WebElement KostenegalisatiereserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvb"));
		return element;
	}
	
//	Herinvesteringsreserve Onttrekking
	@FieldName(name = "HerinvesteringsreserveOnttrekking")
	public static WebElement HerinvesteringsreserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvg"));
		return element;
	}
	
//	Belaste compartimenteringsreserve Onttrekking
	@FieldName(name = "BelasteCompartimenteringsreserveOnttrekking")
	public static WebElement BelasteCompartimenteringsreserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvl"));
		return element;
	}
	
//	Overige fiscale reserves Onttrekking
	@FieldName(name = "OverigeFiscaleReservesOnttrekking")
	public static WebElement OverigeFiscaleReservesOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvo"));
		return element;
	}
	
	
	//Totalen Onttrekking
	@FieldName(name = "TotalenOnttrekking")
	public static WebElement TotalenOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvq"));
		return element;
	}
			
//	Niet in aanmerking te nemen voordeel innovatiebox
	@FieldName(name = "NietInAanmerkingTeNemenVoordeelInnovatiebox")
	public static WebElement NietInAanmerkingTeNemenVoordeelInnovatiebox(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw5"));
		return element;
	}
	
//	Saldo deelnemingsvrijstelling
	@FieldName(name = "SaldoDeelnemingsvrijstelling")
	public static WebElement SaldoDeelnemingsvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwj"));
		return element;
	}
	
//	Netto voordelen uit deelnemingen
	@FieldName(name = "NettoVoordelenUitDeelnemingen")
	public static WebElement NettoVoordelenUitDeelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw8"));
		return element;
	}
	
//	Voordelen uit de niet-kwalificerende beleggingsdeelnemingen
	@FieldName(name = "VoordelenUitNietKwalificerendeBeleggingsdeelnemingen")
	public static WebElement VoordelenUitNietKwalificerendeBeleggingsdeelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwa"));
		return element;
	}
	
//	Toevoeging aan de winst volgens artikel 13c Vpb
	@FieldName(name = "ToevoegingAanDeWinstVolgensArtikel13cVpb")
	public static WebElement ToevoegingAanDeWinstVolgensArtikel13cVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwb"));
		return element;
	}
	
//	Niet-vrijgesteld voordeel volgens artikel 13h Vpb
	@FieldName(name = "NietVrijgesteldVoordeelVolgensArtikel13hVpb")
	public static WebElement NietVrijgesteldVoordeelVolgensArtikel13hVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwe"));
		return element;
	}
	
//	Niet-vrijgesteld voordeel volgens artikel 13, lid 17 Vpb
	@FieldName(name = "NietVrijgesteldVoordeelVolgensArtikel13lid17Vpb")
	public static WebElement NietVrijgesteldVoordeelVolgensArtikel13lid17Vpb(WebDriver driver){
		element = driver.findElement(By.id("idn26n68qd"));
		return element;
	}
	
//	Extracomptabele belaste bedragen
	@FieldName(name = "ExtracomptabeleBelasteBedragen")
	public static WebElement ExtracomptabeleBelasteBedragen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLExtcompBelBedrTot"));
		return element;
	}
	
//	Brutering van voordelen uit niet-kwalificerende beleggingsdeelnemingen
	@FieldName(name = "BruteringVanVoordelenUitNietKwalificerendeBeleggingsdeelnemingen")
	public static WebElement BruteringVanVoordelenUitNietKwalificerendeBeleggingsdeelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwg"));
		return element;
	}
	
//	Toevoeging art. 13aa, lid 6 Vpb
	@FieldName(name = "ToevoegingArt13aaLid6Vpb")
	public static WebElement ToevoegingArt13aaLid6Vpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwi"));
		return element;
	}
	
//	Tussentelling saldo deelnemingsvrijstelling
	@FieldName(name = "TussentellingSaldoDeelnemingsvrijstelling")
	public static WebElement TussentellingSaldoDeelnemingsvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTussentellDeelnemingsVrijst"));
		return element;
	}
	
//	Liquidatieverlies volgens artikel 13d Vpb
	@FieldName(name = "LiquidatieverliesVolgensArtikel13dVpb")
	public static WebElement LiquidatieverliesVolgensArtikel13dVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwc"));
		return element;
	}
	
//	Saldo deelnemingsvrijstelling
	@FieldName(name = "SubSaldoDeelnemingsvrijstelling")
	public static WebElement SubSaldoDeelnemingsvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idCWNLDeelnemingsVrijstTot"));
		return element;
	}
	
//	Buitenlandse ondernemingswinsten
	@FieldName(name = "BuitenlandseOndernemingswinsten")
	public static WebElement BuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBuitOnderwinTot2"));
		return element;
	}
	
//	Objectvrijstelling voor buitenlandse ondernemingswinsten
	@FieldName(name = "ObjectvrijstellingVoorBuitenlandseOndernemingswinsten")
	public static WebElement ObjectvrijstellingVoorBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwm"));
		return element;
	}
	
//	Verliesbrutering laagbelaste buitenlandse beleggingsondernemingen
	@FieldName(name = "VerliesbruteringLaagbelasteBuitenlandseBeleggingsondernemingen")
	public static WebElement VerliesbruteringLaagbelasteBuitenlandseBeleggingsondernemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwn"));
		return element;
	}
	
//	Totaal buitenlandse ondernemingswinsten
	@FieldName(name = "TotaalBuitenlandseOndernemingswinsten")
	public static WebElement TotaalBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBuitOnderwinTot"));
		return element;
	}
	
//	Aftrekbare giften
	@FieldName(name = "AftrekbareGiften")
	public static WebElement AftrekbareGiften(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwq"));
		return element;
	}
	
//	Grondslag VPB giften culturele instellingen
	@FieldName(name = "GrondslagVPBgiftenCultureleInstellingen")
	public static WebElement GrondslagVPBgiftenCultureleInstellingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwq"));
		return element;
	}
	
//	Bedrag aftrek culturele giften
	@FieldName(name = "BedragAftrekCultureleGiften")
	public static WebElement BedragAftrekCultureleGiften(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBedrAftrCultGift"));
		return element;
	}
	
//	Overige giften
	@FieldName(name = "OverigeGiften")
	public static WebElement OverigeGiften(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwr"));
		return element;
	}
	
//	Totaal aftrekbare giften
	@FieldName(name = "TotaalAftrekbareGiften")
	public static WebElement TotaalAftrekbareGiften(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAftGiftenTot"));
		return element;
	}
	
//	Totaal aftrekposten
	@FieldName(name = "TotaalAftrekposten")
	public static WebElement TotaalAftrekposten(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTotAftr"));
		return element;
	}
	
//	Tussentelling belastbare winst
	@FieldName(name = "TussentellingBelastbareWinst")
	public static WebElement TussentellingBelastbareWinst(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastbWinst"));
		return element;
	}
	
//	Aftrekbare, voorheen getemporiseerde, rente
	@FieldName(name = "AftrekbareVoorheenGetemporiseerdeRente")
	public static WebElement AftrekbareVoorheenGetemporiseerdeRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw4"));
		return element;
	}
	
//	Belastbare winst
	@FieldName(name = "BelastbareWinst")
	public static WebElement BelastbareWinst(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastbWinst"));
		return element;
	}
	
//	In dit boekjaar te verrekenen verliezen m.u.v. houdsterverliezen
	@FieldName(name = "BoekjaarTeVerrekenenVerliezenMuvHoudsterverliezen")
	public static WebElement BoekjaarTeVerrekenenVerliezenMuvHoudsterverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxi"));
		return element;
	}
	
//	In dit boekjaar te verrekenen houdsterverliezen als bedoeld in art 20, lid 4 Vpb
	@FieldName(name = "BoekjaarTeVerrekenenHoudsterverliezenAlsBedoeldInArt20lid4Vpb")
	public static WebElement BoekjaarTeVerrekenenHoudsterverliezenAlsBedoeldInArt20lid4Vpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxj"));
		return element;
	}
	
//	Totaal houdsterverliezen
	@FieldName(name = "TotaalHoudsterverliezen")
	public static WebElement TotaalHoudsterverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxe"));
		return element;
	}
	
//	In dit boekjaar totaal te verrekenen verliezen
	@FieldName(name = "boekjaarTotaalTeVerrekenenVerliezen")
	public static WebElement boekjaarTotaalTeVerrekenenVerliezen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTeVerrHdstverl"));
		return element;
	}
	
//	Belastbaar bedrag
	@FieldName(name = "BelastbaarBedrag")
	public static WebElement BelastbaarBedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxf"));
		return element;
	}
	
//	Berekening Belastingbedrag **
	
//	Belastbaar bedrag grondslag voor berekening belasting
	@FieldName(name = "BelastbaarBedragGrondslagVoorBerekeningBelasting")
	public static WebElement BelastbaarBedragGrondslagVoorBerekeningBelasting(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzy8"));
		return element;
	}
	
//	Belastingbedrag voor vermeerderingen/verminderingen
	@FieldName(name = "BelastingbedragVoorVermeerderingenVerminderingen")
	public static WebElement BelastingbedragVoorVermeerderingenVerminderingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzya"));
		return element;
	}
	
//	Belastingvermeerdering
	@FieldName(name = "Belastingvermeerdering")
	public static WebElement Belastingvermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingvermeerderingTot2"));
		return element;
	}
	
//	Ongedaan maken herkapitalisatie Grondslag
	@FieldName(name = "OngedaanMakenHerkapitalisatieGrondslag")
	public static WebElement OngedaanMakenHerkapitalisatieGrondslag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyd"));
		return element;
	}
	
//	Afkoop pensioen/VUT op basis van art. 23a Wet VpB Grondslag
	@FieldName(name = "AfkoopPensioenVUTOpBasisVanArt23aWetVpBGrondslag")
	public static WebElement AfkoopPensioenVUTArt23aWetVpBGrondslag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyg"));
		return element;
	}
	
//	Beeïndiging kredietinstelling, beleggingsinstelling Grondslag
	@FieldName(name = "BeeindigingKredietinstellingBeleggingsinstellingGrondslag")
	public static WebElement BeeindigingKredietinstellingBeleggingsinstellingGrondslag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyk"));
		return element;
	}
	
	
//	Niet voldoen aan de stamrechtvrijstelling (sanctiebepaling art. 33a Wet VpB) Grondslag
	@FieldName(name = "NietVoldoenAanStamrechtvrijstellingGrondslag")
	public static WebElement NietVoldoenAanStamrechtvrijstellingGrondslag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzym"));
		return element;
	}
	
//	Ongedaan maken herkapitalisatie Percentage
	@FieldName(name = "OngedaanMakenHerkapitalisatiePercentage")
	public static WebElement OngedaanMakenHerkapitalisatiePercentage(WebDriver driver){
		element = driver.findElement(By.id("idCWNLHerkapPerc"));
		return element;
	}
	
//	Afkoop pensioen/VUT op basis van art. 23a Wet VpB Percentage
	@FieldName(name = "AfkoopPensioenVUTart23aWetVpBPercentage")
	public static WebElement AfkoopPensioenVUTart23aWetVpBPercentage(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAfkPnsVUTPerc"));
		return element;
	}
	
//	Beeïndiging kredietinstelling, beleggingsinstelling Percentage
	@FieldName(name = "BeeïndigingKredietinstellingBeleggingsinstellingPercentage")
	public static WebElement BeeindigingKredietinstellingBeleggingsinstellingPercentage(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyi"));
		return element;
	}

	
//	Niet voldoen aan de stamrechtvrijstelling (sanctiebepaling art. 33a Wet VpB) Percentage
	@FieldName(name = "NietVoldoenAanDeStamrechtvrijstellingPercentage")
	public static WebElement NietVoldoenAanDeStamrechtvrijstellingPercentage(WebDriver driver){
		element = driver.findElement(By.id("idCWNLStamrechtvrijstPerc"));
		return element;
	}
	
//	Ongedaan maken herkapitalisatie Vermeerdering
	@FieldName(name = "OngedaanMakenHerkapitalisatieVermeerdering")
	public static WebElement OngedaanMakenHerkapitalisatieVermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzye"));
		return element;
	}
	
//	Afkoop pensioen/VUT op basis van art. 23a Wet VpB Vermeerdering
	@FieldName(name = "AfkoopPensioenVUTart23aWetVpBVermeerdering")
	public static WebElement AfkoopPensioenVUTart23aWetVpBVermeerdering(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
//	Beeïndiging kredietinstelling, beleggingsinstelling of Vermeerdering
	@FieldName(name = "BeeïndigingKredietinstellingBeleggingsinstellingVermeerdering")
	public static WebElement BeeïndigingKredietinstellingBeleggingsinstellingVermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyl"));
		return element;
	}
	
//	Niet voldoen aan de stamrechtvrijstelling (sanctiebepaling art. 33a Wet VpB) Vermeerdering
	@FieldName(name = "NietVoldoenAanDeStamrechtvrijstellingVermeerdering")
	public static WebElement NietVoldoenAanDeStamrechtvrijstellingVermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyo"));
		return element;
	}
	
//	Totaal belastingvermeerdering
	@FieldName(name = "TotaalBelastingvermeerdering")
	public static WebElement TotaalBelastingvermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingvermeerderingTot"));
		return element;
	}
	
//	Saldo belasting voor elders belast
	@FieldName(name = "SaldoBelastingVoorEldersBelast")
	public static WebElement SaldoBelastingVoorEldersBelast(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyz"));
		return element;
	}
	
//	Belastingvermindering
	@FieldName(name = "Belastingvermindering")
	public static WebElement Belastingvermindering(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzze"));
		return element;
	}
	
//	Elders belast
	@FieldName(name = "EldersBelast")
	public static WebElement EldersBelast(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyz"));
		return element;
	}
	
//	Deelnemingsverrekening niet-kwalificerende beleggingsdeelnemingen
	@FieldName(name = "DeelnemingsverrekeningNietKwalificerendeBeleggingsdeelnemingen")
	public static WebElement DeelnemingsverrekeningNietKwalificerendeBeleggingsdeelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLDeelnemingsver"));
		return element;
	}
	
//	Berekende deelnemingsverrekening dit boekjaar
	@FieldName(name = "BerekendeDeelnemingsverrekeningDitBoekjaar")
	public static WebElement BerekendeDeelnemingsverrekeningDitBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzz3"));
		return element;
	}
	
//	Voort te wentelen deelnemingsverrekening
	@FieldName(name = "VoortTeWentelenDeelnemingsverrekening")
	public static WebElement VoortTeWentelenDeelnemingsverrekening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzz4"));
		return element;
	}
	
//	Dit boekjaar te verrekenen deelnemingsverrekening
	@FieldName(name = "DitBoekjaarTeVerrekenenDeelnemingsverrekening")
	public static WebElement DitBoekjaarTeVerrekenenDeelnemingsverrekening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzz6"));
		return element;
	}
	
//	Totaal belastingvermindering
	@FieldName(name = "TotaalBelastingvermindering")
	public static WebElement TotaalBelastingvermindering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingverminderingTot"));
		return element;
	}
	
//	Verrekening belasting buitenlandse ondernemingswinsten
	@FieldName(name = "VerrekeningBelastingBuitenlandseOndernemingswinsten")
	public static WebElement VerrekeningBelastingBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzd"));
		return element;
	}
	
//	Berekende verrekening buitenlandse ondernemingswinsten
	@FieldName(name = "BerekendeVerrekeningBuitenlandseOndernemingswinsten")
	public static WebElement BerekendeVerrekeningBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzza"));
		return element;
	}
	
//	Over te brengen verrekening buitenlandse ondernemingswinsten
	@FieldName(name = "OverTeBrengenVerrekeningBuitenlandseOndernemingswinsten")
	public static WebElement OverTeBrengenVerrekeningBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzb"));
		return element;
	}
	
//	Totaal verrekening belasting buitenlandse ondernemingswinsten
	@FieldName(name = "TotaalVerrekeningBelastingBuitenlandseOndernemingswinsten")
	public static WebElement TotaalVerrekeningBelastingBuitenlandseOndernemingswinsten(WebDriver driver){
		element = driver.findElement(By.id("idCWNLVerBelBuitOndwinTot"));
		return element;
	}
	
//	Totaal belastingverminderingen
	@FieldName(name = "TotaalBelastingverminderingen")
	public static WebElement TotaalBelastingverminderingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingVermindTot"));
		return element;
	}
	
//	Belastingbedrag
	@FieldName(name = "Belastingbedrag")
	public static WebElement Belastingbedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzn"));
		return element;
	}
	
//	Voorheffingen
	@FieldName(name = "Voorheffingen")
	public static WebElement Voorheffingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzl"));
		return element;
	}
	
//	Dividendbelasting
	@FieldName(name = "Dividendbelasting")
	public static WebElement Dividendbelasting(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzi"));
		return element;
	}
	
//	Kansspelbelasting
	@FieldName(name = "Kansspelbelasting")
	public static WebElement Kansspelbelasting(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzk"));
		return element;
	}
	
//	Totaal voorheffingen
	@FieldName(name = "TotaalVoorheffingen")
	public static WebElement TotaalVoorheffingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLVoorhefTot"));
		return element;
	}
	
//	Totaal verschuldigd
	@FieldName(name = "TotaalVerschuldigd")
	public static WebElement TotaalVerschuldigd(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTotVerschOntv1"));
		return element;
	}
	
//	Toelichting op de fiscale winstberekening
	@FieldName(name = "ToelichtingOpFiscaleWinstberekening")
	public static WebElement ToelichtingOpFiscaleWinstberekening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzr"));
		return element;
	}
		
	
	
}
