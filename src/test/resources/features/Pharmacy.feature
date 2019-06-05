@regression
Feature: Pharmacy

  @smoke
  Scenario: Create new pharmacy
    Given user is on pharmacies page
    When user creates a new pharmacy
    Then new pharmacy should be created

  Scenario: Edit pharmacy
    Given user is on pharmacies page
    When user creates a new pharmacy
    Then new pharmacy should be created