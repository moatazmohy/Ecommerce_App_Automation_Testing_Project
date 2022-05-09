@regression
Feature: Product Color Filter

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

    Scenario: Logged user could select different Categories
      When User hover over apparel category
      And User clicks shoes sub-Category
      And User selects red color
      And User clicks filtered item
      Then Red color should be found