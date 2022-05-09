@regression
Feature: User Login

  Scenario: User could log in with valid email and password
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully