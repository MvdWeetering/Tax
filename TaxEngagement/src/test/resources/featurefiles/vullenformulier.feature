Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

  @vullen_formulier @Algemene_gegevens_vullen
  Scenario Outline: vullen formulier Algemene gegevens
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 28082017"
    And open the form Algemene Gegevens
    Then i can fill out the form Algemene Gegevens with config <Id>
    Then i can validate the error messages for the Algemene gegevens form

    Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |
      |  2 | "Chrome" |

  @vullen_formulier @Algemene_vragen
  Scenario Outline: vullen formulier Algemene Vragen
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Algemene Vragen
    Then i can fill out the form Algemene Vragen with config 1

    Examples: 
      | Browser  |
      | "Chrome" |

  @vullen_formulier @Specificatie_Aandeelhouders_vullen
  Scenario Outline: vullen formulier Specificatie Aandeelhouders
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Specificatie Aandeelhouders
    Then i can fill out the form Specificatie Aandeelhouders with config <Id>
    Then i can validate the error messages for the Specificatie Aandeelhouders form

    Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |

  @vullen_formulier @Specificatie_Deelnemingen
  Scenario Outline: vullen formulier Specificatie Deelnemingen
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Specificatie Deelnemingen
    Then i can fill out the form Specificatie Deelnemingen with configId <TCID>
    Then i can validate the error messages for Specificatie Deelnemingen form

    Examples: 
      | TCID | Browser  |
    # |    1 | "Chrome" |
      |    2 | "Chrome" |

  @vullen_formulier @Toelichting_Balans
  Scenario Outline: vullen formulier Toelichting Balans
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27092017"
    And open the form Toelichting Balans
    Then i can fill out the form Toelichting Balans with configId <TCID>
    Then i can validate the error messages for the Toelichting Balans form

    Examples: 
      | TCID | Browser  |
      |    1 | "Chrome" |
      |    2 | "Chrome" |

  @vullen_formulier @Winst_en_verlies_rekening
  Scenario Outline: vullen formulier Winst en Verlies rekening
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Winst en Verlies rekening
    Then i can fill out the form Winst en Verlies rekening from tab <TCID>
    Then i can validate the error messages for the Winst en Verlies rekening form from tab <TCID>
    Then i can validate the totals for each column from tab <TCID>

    Examples: 
      | TCID   | Browser  |
      | "TC01" | "Chrome" |
      | "TC02" | "Chrome" |
      | "TC03" | "Chrome" |

  @vullen_formulier @Balans_Activa
  Scenario Outline: vullen formulier Balans Activa
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Balans Activa
    Then i can fill out the form Balans Activa from tab <TCID>
    Then i can validate the error messages for the Balans Activa form from tab <TCID>
    Then i can validate the totals for Balans Activa from tab <TCID>

    Examples: 
      | TCID   | Browser  |
      | "TC01" | "Chrome" |


  @vullen_formulier @Balans_Passiva
  Scenario Outline: vullen formulier Balans Passiva
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Balans Passiva
    Then i can fill out the form Balans Passiva from tab <TCID>
    Then i can validate the error messages for the Balans Passiva form from tab <TCID>
    Then i can validate the totals for Balans Passiva from tab <TCID>

    Examples: 
      | TCID   | Browser  |
      | "TC01" | "Chrome" |
      | "TC02" | "Chrome" |
      | "TC03" | "Chrome" |

  @vullen_formulier @Investeringsaftrek
  Scenario Outline: vullen formulier Investeringsaftrek
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27092017"
    And open the form Investeringsaftrek
    Then i can fill out the form Investeringsaftrek with config <Id>
    Then i can validate the error messages for the Investeringsaftrek form

    Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |

  @vullen_formulier @Objectvrijstelling
  Scenario Outline: vullen formulier Objectvrijstelling
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Objectvrijstelling
    Then i can fill out the form Objectvrijstelling from <TCID>
    Then i can validate the error messages for the formulier Objectvrijstelling

    Examples: 
      | TCID | Browser  |
      |    2 | "Chrome" |

  @vullen_formulier @Innovatiebox
  Scenario Outline: vullen formulier Innovatiebox
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Innovatiebox
    Then i can fill out the form Innovatiebox from <TCID>
    Then i can validate the error messages for the formulier Innovatiebox

    Examples: 
      | TCID | Browser  |
      |    1 | "Chrome" |
      |    2 | "Chrome" |
      |    3 | "Chrome" |

  @vullen_formulier @FiscaleVermogensVergelijking
  Scenario Outline: vullen formulier FiscaleVermogensVergelijking
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 27092017"
    And open the form FiscaleVermogensVergelijking
    Then i can fill out the form FiscaleVermogensVergelijking from <TCID>
    Then i can validate the error messages for the formulier FiscaleVermogensVergelijking from <TCID>
    Then i can validate the totals the formulier FiscaleVermogensVergelijking from  <TCID>

    Examples: 
      | TCID   | Browser  |
      | "TC01" | "Chrome" |

  @vullen_formulier @Zeescheepvaart
  Scenario Outline: vullen formulier Zeescheepvaart
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "14082017"
    And open the form Zeescheepvaart
    Then i can fill out the form Zeescheepvaart from <TCID>
    Then i can validate the error messages for the formulier Zeescheepvaart

    Examples: 
      | TCID | Browser  |
      |    1 | "Chrome" |
      |    2 | "Chrome" |
      |    3 | "Chrome" |
      |    4 | "Chrome" |

  @vullen_formulier @verlies_verrekening
  Scenario Outline: vullen formulier Verlies verrekening
    Given I want to login with browser <Browser>
    When I type username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "dossier 05082017"
    And open the form Verlies Verrekening
    Then i can fill out the form Verlies Verrekening from <TCID>
    Then i can validate the error messages for the formulier verliesverrekening

    Examples: 
      | TCID   | Browser  |
      | "Tc01" | "Chrome" |
      | "Tc02" | "Chrome" |
