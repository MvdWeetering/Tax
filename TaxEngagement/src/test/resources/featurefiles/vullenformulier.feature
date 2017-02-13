Feature: vullen formulier
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form process

  @vullen_formulier
  Scenario: vullen formulier
    Given I want to login
    When I use username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engagement module
    And open the Project "Test Jonathan"
    And open the form Algemene Vragen
    Then i can evaluate the process fill form
