Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

  @Regressie @vullen_formulier @Algemene_gegevens
  Scenario: vullen formulier Algemene gegevens
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27-03-2017"
    And open the form Algemene Gegevens
    Then i can fill out the form Algemene Gegevens with config 1
    Then i can validate the error messages for the Algemene gegevens form

  @Regressie  @vullen_formulier @Algemene_vragen
  Scenario: vullen formulier Algemene Vragen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27-03-2017"
    And open the form Algemene Vragen
    Then i can fill out the form Algemene Vragen with config 1

  @Regressie @vullen_formulier @Specificatie_Aandeelhouders_vullen
  Scenario Outline: vullen formulier Specificatie Aandeelhouders
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27-03-2017"
    And open the form Specificatie Aandeelhouders
    Then i can fill out the form Specificatie Aandeelhouders with config <Id>
		Then i can validate the error messages for the Specificatie Aandeelhouders form
		 
    Examples: 
      | Id |
      |  1 |
      |  2 |
      |  3 |
      |  4 |
 			|  5 |
 			|  6 |
 			 			
  @Regressie @vullen_formulier @Specificatie_Deelnemingen
  Scenario: vullen formulier Specificatie Deelnemingen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27-03-2017"
    And open the form Specificatie Deelnemingen
    Then i can fill out the form Specificatie Deelnemingen

   @Regressie @vullen_formulier @Toelichting_Balans
  Scenario: vullen formulier Toelichting Balans
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27-03-2017"
    And open the form Toelichting Balans
    Then i can fill out the form Toelichting Balans with configId 1
    Then i can validate the error messages for the Toelichting Balans form
