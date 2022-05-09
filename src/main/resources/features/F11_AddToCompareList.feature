@regression
Feature: Add Products to Compare List

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario: Logged user could add different products to compare list
    When User hover over Computers category
    And User clicks Notebooks sub-Category
    And User clicks compare button of the first product
    And User clicks the second product
    And User clicks add to compare list of the second product
    And User goes to compare products page
    Then The selected products are displayed