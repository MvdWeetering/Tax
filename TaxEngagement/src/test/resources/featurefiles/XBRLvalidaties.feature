@XBRL_Validation 
Feature: XBRL Validation 
	
@Spec_aandeelhouders_xbrl

Scenario: XBRL Validation of Specificatie Aandeelhouders
Given the reading of the XBRL is correct
Given the reading of the XLS is correct
When the elements of the XBRL and the XLS for Specificatie aandeelhouders are compared 
Then they contain the same values 

@Spec_algemene_gegevens_xbrl
Scenario: XBRL Validation of Algemene gegevens
Given the reading of the XBRL is correct
Given the reading of the XLS is correct
When the elements of the XBRL and the XLS for Algemene Gegevens are compared 
Then they contain the same values 
