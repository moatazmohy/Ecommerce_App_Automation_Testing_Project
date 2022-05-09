@regression
Feature: Product Search

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

    Scenario: Logged User could search for any product
      When User clicks search field
      And User fills the search field
      And User clicks search result from the result menu
      Then Search result should be displayed as the user's search