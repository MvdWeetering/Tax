@XBRL_Validation
Feature: XBRL Validation

  @Spec_aandeelhouders_xbrl 
  Scenario: XBRL Validation of Specificatie Aandeelhouders
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Specificatie aandeelhouders are compared
    Then they contain the same values

  @algemene_gegevens_xbrl
  Scenario: XBRL Validation of Algemene gegevens
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Algemene Gegevens are compared
    Then they contain the same values

  @Specificatie_Deelneming_xbrl
  Scenario: XBRL Validation of Specificatie Deelnemingen
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Specificatie Deelneming are compared
    Then they contain the same values

  @Toelichtingbalans_xbrl
  Scenario: XBRL Validation of Toelichting Balans
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Toelichting Balans are compared
    Then they contain the same values

  @Zeescheepvaart_xbrl
  Scenario: XBRL Validation of Zeescheepvaart
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Zeescheepvaart are compared
    Then they contain the same values

  @Balans_Activa_xbrl
  Scenario: XBRL Validation of Balans Activa
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Balans Activa are compared
    Then they contain the same values

  @Balans_Passiva_xbrl
  Scenario: XBRL Validation of Balans Passiva
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Balans Passiva are compared
    Then they contain the same values

  @Fiscale_Vermogensvergelijking_xbrl
  Scenario: XBRL Validation Fiscale vermogensvergelijking
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Fiscale vermogensvergelijking are compared
    Then they contain the same values

  @Winst_en_verliesrekening_xbrl
  Scenario: XBRL Validation Winst en verliesrekening
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Winst en verliesrekening are compared
    Then they contain the same values

  @investerings_aftrek_xbrl
  Scenario: XBRL Validation Investeringsregeling
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Investeringsaftrek are compared
    Then they contain the same values
    
 	@verliesverrekening_xbrl
  Scenario: XBRL Validation verliesverrekening
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for verliesverrekening_xbrl are compared
    Then they contain the same values
    
  @Toelichting_overige_voorziening_xbrl
  Scenario: XBRL Validation Toelichting overige voorziening
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Toelichting_overige_voorziening_xbrl are compared
    Then they contain the same values
    
  @Toelichting_materiele_vaste_activa_xbrl 
  Scenario: XBRL Validation Toelichting overige voorziening
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Toelichting materiele vaste activa are compared
    Then they contain the same values
    
  @Toelichting_garantievoorziening_xbrl 
  Scenario: XBRL Validation Toelichting garantievoorziening
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Toelichting garantievoorziening are compared
    Then they contain the same values
  
  @Innovatiebox_xbrl 
  Scenario: XBRL Validation Innovatiebox
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for Innovatiebox are compared
    Then they contain the same values
    
    @objectvrijstelling_xbrl 
  Scenario: XBRL Validation objectvrijstelling
    Given the reading of the XBRL is correct
    Given the reading of the XLS is correct
    When the elements of the XBRL and the XLS for objectvrijstelling are compared
    Then they contain the same values
    
    