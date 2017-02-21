Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

@vullen_formulier @Algemene_gegevens
  Scenario: vullen formulier Algemene gegevens
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 15-02-2017 1015"
    And open the form Algemene Gegevens
    Then i can fill out the form Algemene Gegevens
 
  @vullen_formulier @Algemene_vragen
  Scenario: vullen formulier Algemene Vragen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 15-02-2017 1015"
    And open the form Algemene Vragen
    Then i can fill out the form Algemene Vragen

  @vullen_formulier @Specificatie_Aandeelhouders
  Scenario: vullen formulier Specificatie Aandeelhouders
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 15-02-2017 1015"
    And open the form Specificatie Aandeelhouders
    Then i can fill out the form Specificatie Aandeelhouders with config 1
    Then i can validate the error messages for the Specificatie Aandeelhouders form
    
  @vullen_formulier @Specificatie_Deelnemingen
  Scenario: vullen formulier Specificatie Deelnemingen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 15-02-2017 1015"
    And open the form Specificatie Deelnemingen
    Then i can fill out the form Specificatie Deelnemingen
    