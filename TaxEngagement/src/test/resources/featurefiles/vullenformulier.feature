Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

  @vullen_formulier @Algemene_gegevens_vullen
  Scenario Outline: vullen formulier Algemene gegevens
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Algemene Gegevens
    Then i can fill out the form Algemene Gegevens with config <Id>
    Then i can validate the error messages for the Algemene gegevens form

    Examples: 
      | Id |
      |  1 |
      |  2 |

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
      |  1 |
      |  2 |
      |  3 |
      |  4 |
      |  5 |
      |  6 |

  @vullen_formulier @Specificatie_Deelnemingen
  Scenario Outline: vullen formulier Specificatie Deelnemingen
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Specificatie Deelnemingen
    Then i can fill out the form Specificatie Deelnemingen with configId <TCID>
    Then i can validate the error messages for Specificatie Deelnemingen form

    Examples: 
      | TCID |
      |    1 |
      |    2 |
      |    3 |
      |    4 |

  @vullen_formulier @Toelichting_Balans
  Scenario Outline: vullen formulier Toelichting Balans
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Toelichting Balans
    Then i can fill out the form Toelichting Balans with configId <TCID>
    Then i can validate the error messages for the Toelichting Balans form

    Examples: 
      | TCID |
      |    1 |
      |    2 |

  @vullen_formulier @Winst_en_verlies_rekening
  Scenario Outline: vullen formulier Winst en Verlies rekening
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Winst en Verlies rekening
    Then i can fill out the form Winst en Verlies rekening from tab <TCID>
    Then i can validate the totals for each column from tab <TCID>

    Examples: 
      | TCID   |
      | "TC01" |
      | "TC02" |
      | "TC03" |

  @vullen_formulier @Balans_Activa
  Scenario Outline: vullen formulier Balans Activa
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Balans Activa
    Then i can fill out the form Balans Activa from tab <TCID>
    Then i can validate the totals for Balans Activa from tab <TCID>

    Examples: 
      | TCID   |
      | "TC01" |
      | "TC02" |
      | "TC03" |

  @vullen_formulier @Balans_Passiva
  Scenario Outline: vullen formulier Balans Passiva
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Balans Passiva
    Then i can fill out the form Balans Passiva from tab <TCID>
    Then i can validate the totals for Balans Passiva from tab <TCID>

    Examples: 
      | TCID   |
      | "TC01" |
      | "TC02" |
      | "TC03" |

  @vullen_formulier @Investeringsaftrek
  Scenario: vullen formulier Investeringsaftrek
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Investeringsaftrek
    Then i can fill out the form Investeringsaftrek

  @vullen_formulier @Objectvrijstelling
  Scenario Outline: vullen formulier Investeringsaftrek
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Objectvrijstelling
    Then i can fill out the form Objectvrijstelling from <TCID>
    Then i can validate the error messages for the formulier Objectvrijstelling

    Examples: 
      | TCID |
      |    1 |
      |    2 |
      |    3 |
      
      
  @vullen_formulier @Innovatiebox
  Scenario Outline: vullen formulier Innovatiebox
    Given I want to login
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 19-05"
    And open the form Innovatiebox
    Then i can fill out the form Innovatiebox from <TCID>
    Then i can validate the error messages for the formulier Innovatiebox

    Examples: 
      | TCID |
      |    1 |
      |    2 |
      |    3 |
