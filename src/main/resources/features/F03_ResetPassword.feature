@regression
Feature: Resting Password

  Scenario: User could reset his/her password successfully
    Given User navigates to login page
    And User clicks forgot password button
    When User fills the required email field with valid email
    And User clicks recover button
    Then Instructions email message should be displayed