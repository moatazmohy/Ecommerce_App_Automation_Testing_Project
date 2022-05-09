@regression
Feature: Change Currency

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully


  Scenario: Logged User could switch between currencies US-Euro
    When User clicks currency button
    And User clicks euro button
    Then Currency changes to euro