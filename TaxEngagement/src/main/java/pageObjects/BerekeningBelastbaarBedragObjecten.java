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
	@FieldName(name = "WinstSplitsingJuridischeFusie")
	public static WebElement WinstSplitsingJuridischeFusie (WebDriver driver){
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
//	Kosten en lasten die niet of gedeeltelijk niet aftrekbaar zijn
	@FieldName(name = "KostenLastenNietOfGedeeltelijkNietAftrekbaar")
	public static WebElement KostenLastenNietOfGedeeltelijkNietAftrekbaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzup"));
		return element;
	}
//	Omschrijving van niet aftrekbare kosten (boetes en overige kosten)
	@FieldName(name = "OmschrijvingVanNietAftrekbareKosten")
	public static WebElement OmschrijvingVanNietAftrekbareKosten (WebDriver driver){
		element = driver.findElement(By.id("idtableNietAftBoet:0-1"));
		return element;
	}
//	Bedrag niet aftrekbare boetes
	@FieldName(name = "BedragNietAftrekbareBoetes")
	public static WebElement BedragNietAftrekbareBoetes(WebDriver driver){
		element = driver.findElement(By.id("idtableNietAftBoet:0-3"));
		return element;
	}
//	Omschrijving overige van aftrek beperkte kosten	
	@FieldName(name = "OmschrijvingOverigeVanAftrekBeperkteKosten")
	public static WebElement OmschrijvingOverigeVanAftrekBeperkteKosten(WebDriver driver){
		element = driver.findElement(By.id("idtableKostLastNieAft:0-1"));
		return element;
	}
//	Bedrag overige van aftrek uitgesloten of in aftrek beperkte kosten
	@FieldName(name = "BedragOverigeAftrekUitgeslotenAftrekBeperkteBosten")
	public static WebElement BedragOverigeAftrekUitgeslotenAftrekBeperkteBosten(WebDriver driver){
		element = driver.findElement(By.id("idtableKostLastNieAft:0-3"));
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
//	Winst uit zeescheepvaart
	@FieldName(name = "WinstUitZeescheepvaart")
	public static WebElement WinstUitZeescheepvaart(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuu"));
		return element;
	}
//	Totaal investeringsregelingen
	@FieldName(name = "TotaalInvesteringsregelingen")
	public static WebElement TotaalInvesteringsregelingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzv4"));
		return element;
	}
//	Wijzigingen toelaatbare fiscale reserves (onttrekkingen -/- toevoegingen)
	@FieldName(name = "WijzigingenToelaatbareFiscaleReservesOnttrekkingenToevoegingen")
	public static WebElement WijzigingenToelaatbareFiscaleReservesOnttrekkingenToevoegingen (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvt"));
		return element;
	}
	
	//Tabel ****
//	Kostenegalisatiereserve Toevoeging
	@FieldName(name = "KostenegalisatiereserveToevoeging")
	public static WebElement KostenegalisatiereserveToevoeging (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzva"));
		return element;
	}
//	Kostenegalisatiereserve Onttrekking
	@FieldName(name = "KostenegalisatiereserveOnttrekking")
	public static WebElement KostenegalisatiereserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvb"));
		return element;
	}

//	Herinvesteringsreserve Toevoeging
	@FieldName(name = "HerinvesteringsreserveToevoeging")
	public static WebElement HerinvesteringsreserveToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvd"));
		return element;
	}

//	Herinvesteringsreserve Onttrekking
	@FieldName(name = "HerinvesteringsreserveOnttrekking")
	public static WebElement HerinvesteringsreserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvg"));
		return element;
	}	
		
	//	Belaste compartimenteringsreserve Toevoeging
	@FieldName(name = "")
	public static WebElement BelasteCompartimenteringsreserveToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvj"));
		return element;
	}
		
//	Belaste compartimenteringsreserve Onttrekking
	@FieldName(name = "BelasteCompartimenteringsreserveOnttrekking")
	public static WebElement BelasteCompartimenteringsreserveOnttrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzvl"));
		return element;
	}
		
//	Overige fiscale reserves Toevoeging
	@FieldName(name = "OverigeFiscaleReservesToevoeging")
	public static WebElement OverigeFiscaleReservesToevoeging(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
//	Overige fiscale reserves Onttrekking
	@FieldName(name = "OverigeFiscaleReservesOnttrekking")
	public static WebElement OverigeFiscaleReservesOnttrekking(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}	
	
//	Totalen Toevoeging
	@FieldName(name = "TotalenToevoeging")
	public static WebElement TotalenToevoeging(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
		
	}	
//	Totalen Onttrekking
	@FieldName(name = "TotalenOnttrekking")
	public static WebElement TotalenOnttrekking(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
//	Saldo niet aftrekbare renten en royalty's	

	@FieldName(name = "SaldoNietAftrekbareRentenEnRoyaltys")
	public static WebElement SaldoNietAftrekbareRentenEnRoyaltys(WebDriver driver){
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
	
// 	Bovenmatige deelnemingsrente	
	@FieldName(name = "BovenmatigeDeelnemingsrente")
	public static WebElement BovenmatigeDeelnemingsrente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw0"));
		return element;
	}
	
// 	Rente overnameschulden	
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
	
//	Aftrekbare, voorheen getemporiseerde, rente
	@FieldName(name = "AftrekbareVoorheenGetemporiseerdeRente")
	public static WebElement AftrekbareVoorheenGetemporiseerdeRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzw4"));
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
	@FieldName(name = "ToevoegingAanWinstVolgensArtikel13cVpb")
	public static WebElement ToevoegingAanWinstVolgensArtikel13cVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwb"));
		return element;
	}
//	Liquidatieverlies volgens artikel 13d Vpb
	@FieldName(name = "LiquidatieverliesVolgensArtikel13dVpb")
	public static WebElement LiquidatieverliesVolgensArtikel13dVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwc"));
		return element;
	}
//	Niet-vrijgesteld voordeel volgens artikel 13h Vpb
	@FieldName(name = "NietVrijgesteldVoordeelVolgensArtikel13hVpb")
	public static WebElement NietVrijgesteldVoordeelVolgensArtikel13hVpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwe"));
		return element;
	}
//	Niet-vrijgesteld voordeel volgens artikel 13, lid 17 Vpb
	@FieldName(name = "NietVrijgesteldVoordeelVolgensArtikel13Lid17Vpb")
	public static WebElement NietVrijgesteldVoordeelVolgensArtikel13Lid17Vpb(WebDriver driver){
		element = driver.findElement(By.id("idn26n68qd"));
		return element;
	}
//	Extracomptabele belaste bedragen
	@FieldName(name = "ExtracomptabeleBelasteBedragen")
	public static WebElement ExtracomptabeleBelasteBedragen (WebDriver driver){
		element = driver.findElement(By.id("idCWNLExtcompBelBedrTot"));
		return element;
	}
//	Brutering van voordelen uit niet-kwalificerende beleggingsdeelnemingen
	@FieldName(name = "BruteringVoordelenUitKwalificerendeBeleggingsdeelnemingen")
	public static WebElement BruteringVoordelenUitKwalificerendeBeleggingsdeelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwg"));
		return element;
	}
//	Toevoeging art. 13aa, lid 6 Vpb
	@FieldName(name = "ToevoegingArt13aaLid6Vpb")
	public static WebElement ToevoegingArt13aaLid6Vpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzwi"));
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
		element = driver.findElement(By.id("idCWNLBuitOnderwinTot"));
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
		element = driver.findElement(By.id("idxdt9tzwt"));
		return element;
	}
//	Grondslag VPB giften culturele instellingen
	@FieldName(name = "GrondslagVPBGiftenCultureleInstellingen")
	public static WebElement GrondslagVPBGiftenCultureleInstellingen(WebDriver driver){
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
//	Belastbare winst voor splitsing bij belangenwijziging
	@FieldName(name = "BelastbareWinstVoorSplitsingBijBelangenwijziging")
	public static WebElement BelastbareWinstVoorSplitsingBijBelangenwijziging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzx0"));
		return element;
	}
//	Belastbare winst voor tijdstip belangenwijziging
	@FieldName(name = "BelastbareWinstVoorTijdstipBelangenwijziging")
	public static WebElement BelastbareWinstVoorTijdstipBelangenwijziging(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzx5"));
		return element;
	}
//	Belastbare winst na tijdstip belangenwijziging
	@FieldName(name = "BelastbareWinstNaTijdstipBelangenwijziging")
	public static WebElement BelastbareWinstNaTijdstipBelangenwijziging(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
//	Eliminatie winst boekjaar
	@FieldName(name = "EliminatieWinstBoekjaar")
	public static WebElement EliminatieWinstBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzx7"));
		return element;
	}
//	Imputatie winst vorig boekjaar
	@FieldName(name = "ImputatieWinstVorigBoekjaar")
	public static WebElement ImputatieWinstVorigBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzx8"));
		return element;
	}
//	Belastbare winst
	@FieldName(name = "BelastbareWinst")
	public static WebElement BelastbareWinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxb"));
		return element;
	}
//	In dit boekjaar te verrekenen verliezen m.u.v. houdsterverliezen
	@FieldName(name = "InDitBoekjaarTeVerrekenenVerliezenMUVhoudsterverliezen")
	public static WebElement InDitBoekjaarTeVerrekenenVerliezenMUVhoudsterverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxi"));
		return element;
	}
//	In dit boekjaar te verrekenen houdsterverliezen als bedoeld in art 20, lid 4 Vpb
	@FieldName(name = "InDitBoekjaarTeVerrekenenHoudsterverliezenAlsBedoeldInArt20Lid4Vpb")
	public static WebElement InDitBoekjaarTeVerrekenenHoudsterverliezenAlsBedoeldInArt20Lid4Vpb(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxj"));
		return element;
	}
//	In dit boekjaar totaal te verrekenen verliezen
	@FieldName(name = "InDitBoekjaarTotaalTeVerrekenenVerliezen")
	public static WebElement InDitBoekjaarTotaalTeVerrekenenVerliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzxe"));
		return element;
	}

//	Belastbaar bedrag (Totaal)	
	@FieldName(name = "BelastbaarBedrag")
	public static WebElement BelastbaarBedrag(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelasBedragTot"));
		return element;
	}
	
//	Belastbaar bedrag (berekening)	
	@FieldName(name = "BelastbaarBedragBerekening")
	public static WebElement BelastbaarBedragBerekening(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelasBedragTot2"));
		return element;
	}
//	Belastingbedrag voor vermeerderingen/verminderingen
	@FieldName(name = "BelastingbedragVoorVermeerderingenVerminderingen")
	public static WebElement BelastingbedragVoorVermeerderingenVerminderingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelVooVermind"));
		return element;
	}
//	Belastingvermeerdering
	@FieldName(name = "Belastingvermeerdering")
	public static WebElement Belastingvermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingvermeerderingTot2"));
		return element;
	}
//	Grondslag vermeerdering belasting i.v.m. ongedaan maken herkapitalisatie
	@FieldName(name = "GrondslagVermeerderingBelastingIVMongedaanMakenHerkapitalisatie")
	public static WebElement GrondslagVermeerderingBelastingIVMongedaanMakenHerkapitalisatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyd"));
		return element;
	}
//	Vermeerdering belasting i.v.m. ongedaan maken herkapitalisatie
	@FieldName(name = "VermeerderingBelastingIVMongedaanMakenHerkapitalisatie")
	public static WebElement VermeerderingBelastingIVMongedaanMakenHerkapitalisatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzye"));
		return element;
	}
//	Grondslag vermeerdering belasting i.v.m. afkoop pensioen/VUT op basis van art. 23a Wet VpB
	@FieldName(name = "GrondslagVermeerderingBelastingIVMafkoopPensioenVUTArt23aWetVpB")
	public static WebElement GrondslagVermeerderingBelastingIVMafkoopPensioenVUTArt23aWetVpB(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyg"));
		return element;
	}
//	Vermeerdering belasting i.v.m. afkoop pensioen/VUT op basis van art. 23a Wet VpB
	@FieldName(name = "VermeerderingBelastingIVMafkoopPensioenVUTart23aWetVpB")
	public static WebElement VermeerderingBelastingIVMafkoopPensioenVUTart23aWetVpB(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyh"));
		return element;
	}
//	Percentage i.v.m. beeindiging kredietinstelling, beleggingsinstelling of participatiemaatschappij (sanctiebepaling art. 23b Wet VpB)
	@FieldName(name = "PercentageIVMbeeindigingKredietinstelling")
	public static WebElement PercentageIVMbeeindigingKredietinstelling (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyi"));
		return element;
	}
//	Grondslag vermeerdering belasting i.v.m. beeindiging kredietinstelling, beleggingsinstelling of participatiemaatschappij (sanctiebepaling art. 23b Wet VpB)
	@FieldName(name = "GrondslagVermeerderingBelastingIVMbeeindigingKredietinstelling")
	public static WebElement GrondslagVermeerderingBelastingIVMbeeindigingKredietinstelling (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyk"));
		return element;
	}
//	Vermeerdering belasting i.v.m. beeindiging kredietinstelling, beleggingsinstelling of participatiemaatschappij (sanctiebepaling art. 23b Wet VpB)	
	@FieldName(name = "VermeerderingBelastingIVMbeeindigingKredietinstelling")
	public static WebElement VermeerderingBelastingIVMbeeindigingKredietinstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyl"));
		return element;
	}
//	Grondslag vermeerdering belasting i.v.m. het niet voldoen aan de stamrechtvrijstelling (sanctiebepaling art. 33a Wet VpB)
	@FieldName(name = "GrondslagVermeerderingBelastingIVMhetNietVoldoenAanDeStamrechtvrijstelling")
	public static WebElement GrondslagVermeerderingBelastingIVMhetNietVoldoenAanDeStamrechtvrijstelling (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzym"));
		return element;
	}
//	Vermeerdering belasting i.v.m. het niet voldoen aan de stamrechtvrijstelling (sanctiebepaling art. 33a Wet VpB)
	@FieldName(name = "VermeerderingBelastingIVMHetNietVoldoenAanDeStamrechtvrijstelling")
	public static WebElement VermeerderingBelastingIVMHetNietVoldoenAanDeStamrechtvrijstelling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyo"));
		return element;
	}
//	Saldo belasting voor elders belast
	@FieldName(name = "SaldoBelastingVoorEldersBelast")
	public static WebElement SaldoBelastingVoorEldersBelast(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzyr"));
		return element;
	}
//	Totaal belastingvermeerdering
	@FieldName(name = "TotaalBelastingvermeerdering")
	public static WebElement TotaalBelastingvermeerdering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingvermeerderingTot"));
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
		element = driver.findElement(By.id("idCWNLBelastingVermindTot"));
		return element;
	}
//	Totaal belastingverminderingen
	@FieldName(name = "TotaalBelastingverminderingen")
	public static WebElement TotaalBelastingverminderingen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelastingVermindTot"));
		return element;
	}
//	Regeling functionele valuta
	@FieldName(name = "RegelingFunctioneleValuta")
	public static WebElement RegelingFunctioneleValuta(WebDriver driver){
		element = driver.findElement(By.id("idCWNLRefFunctValTot2"));
		return element;
	}
//	Gemiddelde koers boekjaar in verband met regeling functionele valuta
	@FieldName(name = "GemiddeldeKoersBoekjaarInVerbandRegelingFunctioneleValuta")
	public static WebElement GemiddeldeKoersBoekjaarInVerbandRegelingFunctioneleValuta(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzy5"));
		return element;
	}
//	Valutafactor in verband met regeling voor functionele valuta
	@FieldName(name = "ValutafactorInVerbandMetRegelingVoorFunctioneleValuta")
	public static WebElement ValutafactorInVerbandMetRegelingVoorFunctioneleValuta(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzy7"));
		return element;
	}
//	Belastbaar bedrag grondslag voor berekening belasting
	@FieldName(name = "BelastbaarBedragGrondslagVoorBerekeningBelasting")
	public static WebElement BelastbaarBedragGrondslagVoorBerekeningBelasting(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzy8"));
		return element;
	}
//	Belasting naar het normale tarief
	@FieldName(name = "BelastingNaarHetNormaleTarief")
	public static WebElement BelastingNaarHetNormaleTarief(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzya"));
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
		element = driver.findElement(By.id("idtotVerschOntv2"));
		return element;
	}
//	Toelichting
	@FieldName(name = "Toelichting")
	public static WebElement Toelichting(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzzr"));
		return element;
	}
}
