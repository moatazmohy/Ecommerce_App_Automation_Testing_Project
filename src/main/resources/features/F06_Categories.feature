@regression
Feature: Select different categories

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario: Logged user could select different Categories
    When User hover over Computers category
    And User clicks Desktops sub-Category
    Then Category result is displaying