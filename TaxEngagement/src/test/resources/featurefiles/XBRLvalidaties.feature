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