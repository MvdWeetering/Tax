Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

  @vullen_formulier @Algemene_gegevens_vullen
  Scenario: vullen formulier Algemene gegevens
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Algemene Gegevens
    Then i can fill out the form Algemene Gegevens with config 1
    Then i can validate the error messages for the Algemene gegevens form

  @vullen_formulier @Algemene_vragen
  Scenario: vullen formulier Algemene Vragen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Algemene Vragen
    Then i can fill out the form Algemene Vragen with config 1

  @vullen_formulier @Specificatie_Aandeelhouders_vullen
  Scenario Outline: vullen formulier Specificatie Aandeelhouders
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Specificatie Aandeelhouders
    Then i can fill out the form Specificatie Aandeelhouders with config <Id>
		Then i can validate the error messages for the Specificatie Aandeelhouders form
		
    Examples: 
      | Id |
      |  1|
   
 
  @vullen_formulier @Specificatie_Deelnemingen
  Scenario: vullen formulier Specificatie Deelnemingen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Specificatie Deelnemingen
  	Then i can fill out the form Specificatie Deelnemingen
 		Then i can validate the error messages for Specificatie Deelnemingen form

 
  @vullen_formulier @Toelichting_Balans
  Scenario: vullen formulier Toelichting Balans
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Toelichting Balans
    Then i can fill out the form Toelichting Balans with configId 1
    Then i can validate the error messages for the Toelichting Balans form

  @vullen_formulier @Winst_en_verlies_rekening
  Scenario: vullen formulier Winst en Verlies rekening
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Winst en Verlies rekening
    Then i can fill out the form Winst en Verlies rekening
    Then i can validate the totals for each column
 
  @vullen_formulier @Balans_Activa
  Scenario: vullen formulier Balans Activa
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Balans Activa
    Then i can fill out the form Balans Activa
    Then i can validate the totals for Balans Activa
       
  @vullen_formulier @Balans_Passiva
  Scenario: vullen formulier Balans Passiva
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Balans Passiva
    
    Then i can validate the totals for Balans Passiva   
    
    