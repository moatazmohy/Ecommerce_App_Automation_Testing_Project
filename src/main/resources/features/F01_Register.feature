@regression
Feature: User Registration

  Scenario: User could register with valid data

    Given User navigates to register page
    When User fills the required fields with valid data
    And User clicks register button
    Then User could register successfully