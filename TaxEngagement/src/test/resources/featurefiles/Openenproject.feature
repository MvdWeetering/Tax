Feature: Openen Project
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  So that I can work on the project that was opened

	@Login
  @OpenProject
  Scenario: Login Tax engagement
    Given I want to login
    When I use username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engament module
    And open the Project "Test Jonathan"
    Then i can work on the project