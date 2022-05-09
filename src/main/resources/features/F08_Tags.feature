@regression
Feature: Product Tags

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario: Logged user could select different tags from side menu
    Given User clicks Computers category
    When User scrolls down to tags section and clicks a tag
    Then Chosen tag page is opened

  Scenario: Logged user could select different tags from tags page
    Given User clicks Computers category
    When User scrolls down to tags section and clicks view all
    And User clicks a tag
    Then Chosen tag page is opened