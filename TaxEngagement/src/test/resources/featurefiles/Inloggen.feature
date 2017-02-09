Feature: Inloggen Tax
  As a user
  I want to login to Caseware Tax engagement
  So that I can use the Tax engagement tool

	@Login
  @Login_Tax_Engagement
  Scenario: Login Tax engagement
    Given I want to login
    When I use username "Michel.van.de.Weetering@caseware.nl" and password "Welkom01"
    And Select the Tax engament module
    Then I am succesfully logged into the Tax engagement module
